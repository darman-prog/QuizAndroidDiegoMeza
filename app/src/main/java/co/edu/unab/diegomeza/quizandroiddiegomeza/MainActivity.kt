package co.edu.unab.diegomeza.quizandroiddiegomeza

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.unab.diegomeza.quizandroiddiegomeza.ui.theme.QuizAndroidDiegoMezaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {



        }
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ImagenUno(){


    Column(modifier = Modifier.padding(start = 15.dp , end = 15.dp , top = 28.dp, bottom = 15.dp)) {


        Row (horizontalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()){

            Text("Encabezado", modifier = Modifier.background(color = Color.LightGray).padding(vertical = 10.dp, horizontal = 10.dp))

        }

        Column(verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()) {

            Row(horizontalArrangement = Arrangement.spacedBy(35.dp , Alignment.CenterHorizontally),
                modifier = Modifier.background(Color.Green).fillMaxWidth().padding(vertical = 20.dp, horizontal = 20.dp)){

                Text("item 1", modifier = Modifier.background(Color.Blue).padding(horizontal = 10.dp, vertical = 10.dp))

                Text("item 2", modifier = Modifier.background(Color.Red).padding(horizontal = 10.dp, vertical = 10.dp))

                Text("item 3", modifier = Modifier.background(Color.Yellow).padding(horizontal = 10.dp, vertical = 10.dp))
            }


            Row (verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()
            ){


                Text("Pie de pagina",modifier = Modifier.background(Color.Cyan).padding(vertical = 10.dp, horizontal = 10.dp), textAlign = TextAlign.Center,
                    )

            }
        }






    }



}