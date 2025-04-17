package com.xerv.shucoffee.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF9F6ED)) // light beige background
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .background(Color.White, shape = RoundedCornerShape(4.dp))
                .fillMaxWidth()
        ) {
            Text(
                text = "Account",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )

            Divider(color = Color(0xFFF2EEE3), thickness = 8.dp)

            Column(modifier = Modifier.padding(16.dp)) {
                ProfileRow("Name", "Herlangga")
                ProfileRow("Email", "herlangga@mail.com")
                ProfileRow("Phone Number", "+6289873627345")
                ProfileRow("Address", "Jl. Supratman No 56")
                ProfileRow("Gender", "Male")
                ProfileRow("Birth Date", "10 January 1993")

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    "Update Profile",
                    color = Color(0xFFA67C52),
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Change Password",
                    color = Color(0xFFA67C52),
                    fontWeight = FontWeight.Medium
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier
                .background(Color.White, shape = RoundedCornerShape(4.dp))
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text("About Us", fontWeight = FontWeight.Medium)
            Divider(modifier = Modifier.padding(vertical = 8.dp), color = Color(0xFFE0E0E0))
            Text("Privacy Policy", fontWeight = FontWeight.Medium)
            Divider(modifier = Modifier.padding(vertical = 8.dp), color = Color(0xFFE0E0E0))
            Text("Log Out", color = Color(0xFFA67C52), fontWeight = FontWeight.Medium)
        }

        Spacer(modifier = Modifier.weight(1f)) // Push content up if screen height larger
    }
}

@Composable
fun ProfileRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            label,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.weight(1f)
        )
        Text(
            value,
            color = Color.Black,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.End
        )
    }
}

