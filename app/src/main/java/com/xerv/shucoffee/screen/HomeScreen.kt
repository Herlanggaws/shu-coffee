package com.xerv.shucoffee.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.xerv.shucoffee.R
import com.xerv.shucoffee.ui.theme.Brown
import com.xerv.shucoffee.ui.theme.CardWhite
import com.xerv.shucoffee.ui.theme.Cream
import com.xerv.shucoffee.ui.theme.GrayText
import com.xerv.shucoffee.ui.theme.PrimaryText
import com.xerv.shucoffee.ui.theme.SecondaryText

@Preview
@Composable
fun HomeScreen() {
    val rewards = listOf(
        "FREE Coffee" to "100 Pts",
        "Disc 30%" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "Disc 30%" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "Disc 30%" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "Disc 30%" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "Disc 30%" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "Disc 30%" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "FREE Coffee" to "100 Pts",
        "Disc 30%" to "100 Pts",
        "FREE Coffee" to "100 Pts",
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Cream)
            .padding(16.dp),
        contentPadding = PaddingValues(bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            // Greeting
            Text(
                text = "Hi, Herlangga!",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )
        }

        item {
            // Points Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = CardWhite),
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.weight(1f),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Your Point",
                            fontSize = 14.sp,
                            color = SecondaryText
                        )
                        Text(
                            text = "1.000 pts",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Brown
                        )
                    }
                    Row(
                        modifier = Modifier.weight(1f),
                        horizontalArrangement = Arrangement.End
                    ) {
                        HomeButtonComponent()
                        Spacer(modifier = Modifier.width(16.dp))
                        HomeButtonComponent()
                    }
                }
            }
        }

        item {
            // Location List
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Location List",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryText
                )
                Text("See All", color = Brown)
            }
        }

        item {
            // Location Card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = CardWhite)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Shu Coffee", fontWeight = FontWeight.Bold, color = PrimaryText)
                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = "Jl. Merdeka No.78, RT.01/RW.02, Ciwaringin",
                        color = SecondaryText
                    )
                    Text("08:00 - 21:00", color = GrayText)
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("Map", color = Brown)
                        Text("Call", color = Brown)
                    }
                }
            }
        }

        item {
            // Rewards title
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Available Rewards",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryText
                )
                Text("See All", color = Brown)
            }
        }

        items(rewards) { (title, pts) ->
            Card(
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(containerColor = CardWhite)
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(title, fontWeight = FontWeight.Bold, color = PrimaryText)
                        Text("Valid Until 10 June 2023", color = GrayText)
                    }
                    Text(pts, color = Brown, fontWeight = FontWeight.SemiBold)
                }
            }
        }
    }
}


@Preview
@Composable
fun HomeButtonComponent() {
    Column {
        Card(
            colors = CardDefaults.cardColors(containerColor = Cream),
            shape = RoundedCornerShape(12.dp),
        ) {
            Image(
                modifier = Modifier.padding(8.dp),
                painter = painterResource(R.drawable.ic_barcode),
                contentDescription = ""
            )
        }
        Spacer(Modifier.height(8.dp))
        Text("My QR", color = Brown)
    }
}
