package com.example.akllmarketaraba1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.akllmarketaraba1.R

@Composable
fun Tasarım(acıklama: String,fiyat: String,Resim:String){
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color(242,242,242)),
        verticalArrangement = Arrangement.Center){
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(all = 10.dp,),
                elevation = CardDefaults.elevatedCardElevation(50.dp),
                colors = CardDefaults.cardColors(Color(245,245,245)),
                shape = RoundedCornerShape(corner = CornerSize(2.dp))
            ) {
                Row(modifier = Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(id = R.drawable.sut), contentDescription =null,
                        modifier = Modifier.size(45.dp,45.dp).weight(1f))
                    Spacer(modifier = Modifier.padding(20.dp,0.dp))
                    Text(text = acıklama, modifier = Modifier.weight(1f) )
                    Spacer(modifier = Modifier.padding(20.dp,0.dp))
                    Text(text = fiyat)
                    Spacer(modifier = Modifier.padding(10.dp,0.dp))
                    Icon(painter = painterResource(id = R.drawable.baseline_delete_forever_24),
                        contentDescription =null,
                        tint = Color.Red
                    )
                }
            }
    }




}