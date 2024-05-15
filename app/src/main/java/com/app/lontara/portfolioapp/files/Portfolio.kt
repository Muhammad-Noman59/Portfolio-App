package com.app.lontara.portfolioapp.files

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.lontara.portfolioapp.R
import com.app.lontara.portfolioapp.ui.theme.AzureBlue



//        Made by Muhammad Noman
//
//        If you need my service or you have any question then you can contact with me.
//
//        WhatsApp number :  +923104881573
//
//        LinkedIn account :  https://www.linkedin.com/in/muhammad-noman59
//
//        Facebook account :  https://www.facebook.com/profile.php?id=100092720556743&mibextid=ZbWKwL




@Composable
fun Portfolio() {

    val spacer1 = Modifier.height(8.dp)
    val spacer2 = Modifier.height(12.dp)

    val isOpen = remember { mutableStateOf(false) }

    Surface (
        shadowElevation = 8.dp,
        shape = RoundedCornerShape(12.dp),
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(12.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.my_image),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(100.dp)
                    .padding(10.dp)
            )

            Spacer(modifier = spacer1)

            Divider()

            Spacer(modifier = spacer1)

            Text(
                text = "Muhammad Noman",
                style = TextStyle(
                    color = AzureBlue,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold
                )

            )

            Text(
                text = "Full stack mobile app developer",
                style = MaterialTheme.typography.bodySmall
            )

            Spacer(modifier = spacer2)

            Row {

                Image(painter = painterResource(id = R.drawable.github_icon), contentDescription ="GitHub Icon",
                    modifier = Modifier.size(18.dp)
                )

                Text(text = "/muhammad-noman59",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )

            }

            Spacer(modifier = Modifier.height(4.dp))

            Row {
                Image(painter = painterResource(id = R.drawable.linkedin_icon), contentDescription ="LinkedIn Icon",
                    modifier = Modifier.size(18.dp)
                )

                Text(text = "/muhammad-noman59",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
            }

            Spacer(modifier = spacer2)

            Button(onClick = { isOpen.value = !isOpen.value },
                shape = RoundedCornerShape(10),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AzureBlue
                )
            ) {

                Text(text = "My Projects")
            }

            Spacer(modifier = spacer2)

            if( isOpen.value ) {
                LazyColumn {
                    items(getProjectList()) { data ->
                        ProjectItem(data)
                    }
                }
            }
        }
    }
}

@Composable
fun ProjectItem(project : Project) {


    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    ){

        Image(painter = painterResource(id = project.image), contentDescription = "Project image",
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
        )

        Column (modifier = Modifier.padding(horizontal = 8.dp)){

            Text(
                text = project.name,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = project.description,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }

}