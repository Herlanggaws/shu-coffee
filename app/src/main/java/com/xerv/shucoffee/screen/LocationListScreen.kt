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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LocationListScreen() {
    val locations = listOf(
        StoreLocation(
            name = "Shu Coffee",
            address = "Jl. Merdeka No.78, RT.01/RW.02, Ciwaringin, Kecamatan Bogor Tengah, Kota Bogor, Kota Bogor",
            time = "08:00 - 21:00"
        ),
        StoreLocation(
            name = "Shu Coffee",
            address = "Jl. Merdeka No.78, RT.01/RW.02, Ciwaringin, Kecamatan Bogor Tengah, Kota Bogor, Kota Bogor",
            time = "08:00 - 21:00"
        ),
        StoreLocation(
            name = "Shu Coffee",
            address = "Jl. Merdeka No.78, RT.01/RW.02, Ciwaringin, Kecamatan Bogor Tengah, Kota Bogor, Kota Bogor",
            time = "08:00 - 21:00"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF8F4EA)) // Light cream background
            .padding(16.dp)
    ) {
        Text(
            "Store Location List",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(locations) { location ->
                StoreCard(location)
            }
        }
    }
}

data class StoreLocation(val name: String, val address: String, val time: String)

@Composable
fun StoreCard(location: StoreLocation) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(location.name, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Text(location.address)
            Spacer(modifier = Modifier.height(4.dp))
            Text(location.time)

            Divider(modifier = Modifier.padding(vertical = 12.dp), color = Color.LightGray)

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Map", color = Color(0xFFA67C52), fontWeight = FontWeight.Medium)
                Text("Call", color = Color(0xFFA67C52), fontWeight = FontWeight.Medium)
            }
        }
    }
}
