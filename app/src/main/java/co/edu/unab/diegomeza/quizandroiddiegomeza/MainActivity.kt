package co.edu.unab.diegomeza.quizandroiddiegomeza

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.edu.unab.diegomeza.quizandroiddiegomeza.ui.theme.QuizAndroidDiegoMezaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            PresentacionUno()
              PresentacionDos()


        }
    }
}


@Composable
//@Preview(showBackground = true, showSystemUi = true)
fun PresentacionUno(){


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


            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    "Pie de pagina",
                    modifier = Modifier.background(Color.Cyan).padding(10.dp),
                    textAlign = TextAlign.Center
                )
            }
        }

    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PresentacionDos(){

    val painter = painterResource(id = R.drawable.star_on)


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {
        Image(painter, contentDescription = "Estrella rara", modifier = Modifier.size(150.dp).clip(
            CircleShape
        ))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.background(color = Color.White)
        ) {


            Text(
                "Diego Meza", fontWeight = FontWeight.Bold, fontSize = 26.sp,
                modifier = Modifier.padding(
                    top = 10.dp
                ),
            )

            Text("Desarrollador de software junior")

        }

        Spacer(Modifier.padding(12.dp))
        Row (){ Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 20.dp)
        )
        {
            Text("150", fontWeight = FontWeight.Bold)
            Text("Posts")


        }


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                Text("8.2K", fontWeight = FontWeight.Bold)
                Text("Seguidores")
            }




            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                Text("1200", fontWeight = FontWeight.Bold)
                Text("Likes")
            } }

        Spacer(Modifier.padding(12.dp))


            Column (horizontalAlignment = Alignment.CenterHorizontally){

                Row (horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth()){
                    Text("Seguir", modifier = Modifier.background(color = Color.Red).padding(vertical = 10.dp, horizontal = 19.dp))
                    Text("Mensaje",modifier = Modifier.background(color = Color.Blue).padding(vertical = 10.dp, horizontal = 19.dp))


                }

            }
    }

    }
