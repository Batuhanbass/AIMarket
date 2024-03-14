package com.example.akllmarketaraba1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun RegisterScreen(){
    Column( modifier = Modifier
        .fillMaxHeight(1f)
        .fillMaxWidth(1f)
        .background(Color.White),
        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Logo()
        Spacer(modifier = Modifier.height(5.dp))
        Email_Al(string = "E-Mail Giriniz")
        Spacer(modifier = Modifier.height(2.dp))
        Email_Al(string = "Tekrardan E-Mail Giriniz")
        Spacer(modifier = Modifier.height(2.dp))
        Telefon_Al(string = "Telefon numarası Giriniz")
        Spacer(modifier = Modifier.height(2.dp))
        PasswordGet(string = "Şifre giriniz")
        Spacer(modifier = Modifier.height(5.dp))
        TusEdit(onClick = { /*TODO*/ }, deger = "Kayıt ol")
    }



}
@Composable
fun Email_Al(string: String){
    OutlinedTextField(
        leadingIcon= {
            Icon(
                imageVector = Icons.Default.AccountCircle,//Simge seçimi
                contentDescription = null,//Acıklama
                tint= Color(1, 1, 1)//Simgenin rengini belirleme

            )
        },
        value = string,
        label = { Text("") },
        onValueChange = {},


        )
}
@Composable
fun Telefon_Al(string: String){
    OutlinedTextField(
        leadingIcon= {
            Icon(
                imageVector = Icons.Default.Phone,//Simge seçimi
                contentDescription = null,//Acıklama
                tint= Color(1, 1, 1)//Simgenin rengini belirleme

            )
        },
        value = string,
        label = { Text("") },
        onValueChange = {},


        )
}
@Composable
fun PasswordGet(string: String){
    OutlinedTextField(
        leadingIcon= {
            Icon(
                imageVector = Icons.Default.Lock,//Simge
                contentDescription = null,//Acıklama
                tint= Color(1, 1, 1)//Simgenin rengini belirleme

            )
        },
        value = "batu",
        label = { Text(string) },
        onValueChange = {},
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

    )
}