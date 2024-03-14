package com.example.akllmarketaraba1.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.akllmarketaraba1.Gecis
import com.example.akllmarketaraba1.R
import kotlinx.coroutines.launch
import kotlin.system.exitProcess

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(){
    var fiyat= remember {
        mutableListOf("10","20","20.5","35.57","25","12","15.5","10","20","20.5","35.57","25","12","15.5")
    }
    var ismi= remember {
        mutableListOf("Süt 1L","AYCİCEK YAĞI","Çikolata","Eti puf kek","CANGA","CRAX","DONDURMA","Süt 1L","AYCİCEK YAĞI","Çikolata","Eti puf kek","CANGA","CRAX","DONDURMA")
    }
    Scaffold (modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBar(colors = TopAppBarDefaults.topAppBarColors(Color(245,245,245)),
            title = { Text(text = "Alınan Urunler") },

            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null
                    )
                }

            }) },floatingActionButton = {
            FloatingActionButton(modifier = Modifier.fillMaxWidth(0.4f), containerColor = Color.Red,
                onClick = { println("Ödeme basıldı") },
                content = { Text(text = "Öde") }
            )
        }


    ){values->
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(values)){
            items(
                count = fiyat.count(),
                itemContent = {
                    val say=fiyat[it]
                    Tasarım(acıklama = ismi[it], fiyat =fiyat[it] , Resim = "1")
                }
            )

            }
        }

    }

@Composable
fun YanMenu(){
    val items= listOf("Alışveris","Profil","Ayarlar","Ödeme","Hakkımda","Çıkış")
    val secilenIndex= remember {
        mutableStateOf(0)
    }
    val drawerState= rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope= rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet() {
                Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.padding(0.dp,55.dp))
                        Image(painter = painterResource(R.drawable.ab1), contentDescription = null,
                            modifier = Modifier.clip(shape = CircleShape ))//Veritabanından resim
                    Spacer(modifier = Modifier.padding(0.dp,12.dp))
                    Text(text = "Batuhan Bas")//Veri tabanından isim
                    Spacer(modifier = Modifier.padding(0.dp,10.dp))
                    items.forEachIndexed { index, menu ->
                        NavigationDrawerItem(
                            label = {
                                Text(text = menu)


                            },
                            icon = {
                                when(menu){
                                    ("ALISVERİS") -> Icon(painter = painterResource(id = R.drawable.ab1),
                                        contentDescription = null)
                                    ("Profil") -> Icon(painter = painterResource(id = R.drawable.ab1),
                                        contentDescription = null)
                                    ("Ayarlar") -> Icon(painter = painterResource(id = R.drawable.ab2_24),
                                        contentDescription = null)
                                    ("Ödeme") -> Icon(painter = painterResource(id = R.drawable.ab3),
                                        contentDescription = null)
                                    ("Hakkımda") -> Icon(painter = painterResource(id = R.drawable.ab4),
                                        contentDescription = null)
                                    ("Çıkış") -> Icon(painter = painterResource(id = R.drawable.ab5),
                                        contentDescription = null)
                                }
                            },
                            selected =secilenIndex.value==index
                            ,onClick = {  scope.launch { drawerState.close() }
                                secilenIndex.value=index})

                    }
                }
            }


        }, content = {
            if(secilenIndex.value==0){
                MenuScreen()
            }
            if(secilenIndex.value==1){
                //Profil ekranı
            }
            if(secilenIndex.value==2){
                MenuSettingsSc()
            }
            if(secilenIndex.value==3){
                //Odeme ekranı
            }
            if(secilenIndex.value==4){
                MenuInfoSc()
            }
            if(secilenIndex.value==5){
                Gecis()
            }
        })





}
