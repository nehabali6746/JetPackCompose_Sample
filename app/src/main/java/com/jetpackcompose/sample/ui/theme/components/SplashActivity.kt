package com.jetpackcompose.sample.ui.theme.components

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackcompose.sample.R
import com.jetpackcompose.sample.ui.theme.JetPackComposeSampleTheme

class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeSampleTheme {
                Surface(
                ) {
//                    Recomposable()
//                    previewItem()
                    NotificationScreen()
                }
            }
        }
    }
}


@Composable
fun SplashUI() {
   Text(text = "", modifier = Modifier
       .clickable { }
       .background(Color.Green)
       .size(200.dp)
       .border(4.dp, Color.Blue)
       .clip(CircleShape)
       .background(Color.Yellow)
       .size(200.dp))


}
@Preview(showBackground = true)
@Composable
fun CircularImage(){
    Image(painter = painterResource(id = R.drawable.ic_launcher_background)
            , contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Magenta, CircleShape),

        contentDescription = "testing" )
}

//@Preview(showBackground = true)
@Composable
fun splashPreview() {
    JetPackComposeSampleTheme {
        SplashUI()
    }


}



