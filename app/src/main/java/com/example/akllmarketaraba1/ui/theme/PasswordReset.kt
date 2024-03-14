package com.example.akllmarketaraba1.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GetCode(string: String){
    OutlinedTextField(leadingIcon = {
                Icon(imageVector = Icons.Default.AccountCircle,
                    contentDescription ="123" )
    }

        , value = string, onValueChange = {})


}
@Composable
fun CodeEnter(string: String){
    OutlinedTextField(leadingIcon = {
        Icon(imageVector = Icons.Default.Edit,
            contentDescription ="123" )
    }

        , value = string, onValueChange = {})


}

@Composable
fun PasswordResetScreen(){
    Column(modifier = Modifier.fillMaxSize(1f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Logo()
        Spacer(modifier = Modifier.height(15.dp))
        GetCode("E-Mail giriniz")
        Spacer(modifier = Modifier.height(10.dp))
        TusEdit(onClick = { /*TODO*/ }, deger = "Kodu Gönder")
        Spacer(modifier = Modifier.height(10.dp))
        CodeEnter(string = "Kodu giriniz")
        Spacer(modifier = Modifier.height(10.dp))
        TusEdit(onClick = { /*TODO*/ }, deger = "Kodu gir")
    }


}
