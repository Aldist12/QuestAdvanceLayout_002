package com.example.tataletakcolumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview (showBackground = true)
@Composable
fun PlayActivity(modifier: Modifier = Modifier){
    Column (modifier = Modifier.fillMaxSize()) {
        SectionHeader()
        Spacer(modifier = Modifier.padding(20.dp))
        Text(
            text = "Kepada YTH"
        )
        Text(text = "Kepala Stasiun")
        Spacer(modifier = Modifier.padding(20.dp))

        MainSection(
            judulParam = "Nama",
            isiParam = "Aldi Septiyanto"
        )
        MainSection(
            judulParam = "Kelas",
            isiParam = "Pengembangan Aplikasi Mobile"
        )
        MainSection(
            judulParam = "NIM",
            isiParam = "20210140002"
        )
        MainSection(
            judulParam = "Alamat",
            isiParam = "Yogyakarta"
        )
    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.DarkGray)){
        Row (
            modifier = Modifier.padding(15.dp)
        ){
            Box(contentAlignment = Alignment.BottomEnd){
                Image(
                    painter = painterResource(id = R.drawable.tvriyogyakarta),
                    contentDescription = "",
                    Modifier
                        .size(110.dp)
                        .clip(shape = CircleShape)
                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = "",
                    Modifier
                        .padding(end = 15.dp)
                        .size(30.dp),
                    tint = Color.Red

                )
            }
            Column (Modifier.padding(15.dp)) {
                Text(
                    text = "Media Pemersatu Bangsa",
                    color = Color.White
                )
                Text(
                    text = "TVRI YOGYAKARTA",
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun MainSection(
    judulParam: String,
    isiParam: String

){
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(3.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(3.dp),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            Text(
                text = judulParam,
                modifier = Modifier.weight(0.8f)
            )
            Text(
                text = " : ",
                modifier = Modifier.weight(0.2f)
            )
            Text(
                text = "$isiParam",
                modifier = Modifier.weight(2f)
            )
        }
    }

}