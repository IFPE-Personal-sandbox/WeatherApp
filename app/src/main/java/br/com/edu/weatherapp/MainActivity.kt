package br.com.edu.weatherapp

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.LocalActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.edu.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomePage()
        }
    }
}

@Composable
fun HomePage(){
    val activity = LocalActivity.current as Activity
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
            .fillMaxWidth(fraction = 0.9f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Seja bem vindo!"
        )
        Spacer(modifier = Modifier.size(24.dp))
        Button(
            onClick = {activity.finish()}
        ) {
            Text("Sair")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePagePreview() {

    //"Renderiza HomePage usando o tema visual do app"
    //HomePage inteira usa esse padrão visual --> WeatherAppTheme
    WeatherAppTheme {
        HomePage()
    }
}