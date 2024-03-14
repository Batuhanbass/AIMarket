package com.example.akllmarketaraba1.ui.theme


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.akllmarketaraba1.R

@Composable
fun Kullanici(string: String){
    OutlinedTextField(
        leadingIcon= {
            Icon(
                imageVector = Icons.Default.AccountCircle,//Simge seçimi
                contentDescription = null,//Acıklama
                tint= Color(1, 1, 1)//Simgenin rengini belirleme

            )
        },
        value = string,
        label = { Text("User") },
        onValueChange = {},


        )
}
@Composable
fun PasswordInput(string: String){
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
@Composable

fun TusEdit(onClick: () -> Unit, deger:String) {

    FilledTonalButton(onClick = { onClick() },
        modifier = Modifier
            .height(60.dp)
            .width(120.dp),
        colors = ButtonDefaults.filledTonalButtonColors(Color(10,226,255))//Kutunun içerik rengi

    ) {
        Text(text=deger)
    }
}
@Composable
fun Logo() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
    ) {
        Image(painter = painterResource(id = R.drawable.bb)
            , contentDescription ="12"
            ,Modifier.size(100.dp,100.dp))
        Column {
            YaziLogo(text = "AI", fontSize = 35.sp)
            YaziLogo(text = "MARKET", fontSize = 15.sp)
        }
    }
}
@Composable
fun YaziLogo(text: String, fontSize: TextUnit) {
    BasicText(
        text = text,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            color = Color(10, 226, 255),
            fontSize = fontSize
        )
    )
}
@Composable
fun SirketAmblem(){
    Row( verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End) {
        Image(painter = painterResource(id = R.drawable.yildiz), contentDescription ="q",
            modifier = Modifier
                .height(30.dp)
                .width(30.dp))
    Text(text = "Sallama Yazılım")

    }



}
@Composable
fun YaziButonu(onClick: () -> Unit) {
    TextButton(
        onClick = { onClick()  }
    ) {
        YaziLogo(text = "Şifremi Unuttum", fontSize = 12.sp)
    }
}
@Composable
fun LoginScreen(navController:NavController) {
    Column(
        modifier = Modifier
            .fillMaxHeight(1f)
            .fillMaxWidth(1f)
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Logo()
        Spacer(modifier = Modifier.height(5.dp))
        Kullanici("E-Mail Giriniz")
        Spacer(modifier = Modifier.height(15.dp))
        PasswordInput("Password")
        Spacer(modifier = Modifier.height(15.dp))
        Row {
            TusEdit(onClick = { navController.navigate("KayıtOL") }, deger = "Kayıt ol")
            Spacer(modifier = Modifier.width(35.dp))
            TusEdit(onClick = {navController.navigate("Giris")


            }, deger = "Giriş")
        }
        Spacer(modifier = Modifier.height(5.dp))
        YaziButonu(onClick = {navController.navigate("SifreSifir")})
        Spacer(modifier = Modifier.height(45.dp))
        SirketAmblem()

    }
}
