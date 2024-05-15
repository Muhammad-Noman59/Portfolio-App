package com.app.lontara.portfolioapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.app.lontara.portfolioapp.files.Portfolio
import com.app.lontara.portfolioapp.ui.theme.PortfolioAppTheme


//        Made by Muhammad Noman
//
//        If you need my service or you have any question then you can contact with me.
//
//        WhatsApp number :  +923104881573
//
//        LinkedIn account :  https://www.linkedin.com/in/muhammad-noman59
//
//        Facebook account :  https://www.facebook.com/profile.php?id=100092720556743&mibextid=ZbWKwL


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PortfolioAppTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->

                    innerPadding

                    Column (modifier = Modifier.fillMaxSize()
                        .padding(innerPadding)
                    ){

                        Portfolio()
                    }



                }
            }
        }
    }
}
