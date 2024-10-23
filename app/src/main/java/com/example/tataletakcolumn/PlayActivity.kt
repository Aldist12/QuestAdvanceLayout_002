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
@Preview(showBackground = true)
@Composable
fun PlayActivity(modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxSize()) {
        SectionHeader()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Kepada Yth :", Modifier.padding(start = 8.dp))
        Text(text = "Kepala Stasiun", Modifier.padding(start = 8.dp))
        MainSection(judulParam = "Nama", isipParam = "Aldi Septiyanto")
        MainSection(judulParam = "Kelas", isipParam = "Pengembangan Aplikasi Mobile")
        MainSection(judulParam = "NIM", isipParam = "20210140002")
        MainSection(judulParam = "Keterangan", isipParam = "Sebagai Syarat Kelulusan")
    }
}

@Composable
fun SectionHeader(){
    Column {
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)) {
            Row(
                modifier = Modifier.padding(15.dp)
            ) {
                Box(contentAlignment = Alignment.BottomEnd) {
                    Image(painter = painterResource(id = R.drawable.tvriyogyakarta),
                        contentDescription = null,
                        Modifier.size(90.dp))
                    Icon(Icons.Filled.Check,
                        contentDescription = null,
                        Modifier
                            .padding(end = 1.dp)
                            .size(25.dp),
                        tint = Color.Red )
                }
                Column (Modifier.padding(15.dp)) {
                    Text(text = "TVRI YOGYAKARTA", color = Color.White)
                    Spacer(Modifier.padding(3.dp))
                    Text(text = "Media Pemersatu Bangsa", color = Color.White)
                }
            }
        }
    }
}

@Composable
fun MainSection(judulParam:String, isipParam:String){
    Column {
        Row(Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = judulParam, Modifier.weight(0.8f))
            Text(text = ":", Modifier.weight(0.2f))
            Text(text = isipParam, Modifier.weight(2f))
        }
    }
}