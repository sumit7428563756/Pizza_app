package com.example.pizzaapp



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaapp.ui.theme.Purple40
import com.example.pizzaapp.ui.theme.YellowColor


@Composable
fun FirstScreen(navigationToHomeScreen:()-> Unit){

    val name = remember { mutableStateOf("") }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(YellowColor)){
        Column(modifier = Modifier
            .fillMaxHeight()
            .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            SpacerHeight(20.dp)
            Text("CHAURSIYA'S PIZZA",  style = TextStyle(
                fontSize = 58.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.W800,
                color = Purple40,
                textAlign = TextAlign.Center
            ))
            SpacerHeight(10.dp)
            Image(painter = painterResource(id = R.drawable.pngtreepizza_burgers_and_fast_food_16263047),
                contentDescription = null, modifier = Modifier.size(400.dp), alignment = Alignment.Center
            )
            SpacerHeight(10.dp)
            Text("ENJOY EATING",  style = TextStyle(
                fontSize = 48.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.W800,
                color = Purple40,
                textAlign = TextAlign.Center
            ))
            SpacerHeight(30.dp)
            Text("All the delicious Pizza's on Your Phone",  style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.W600,
                color = Color.Black,
                textAlign = TextAlign.Center
            ))
            SpacerHeight(20.dp)
            Button(onClick = {navigationToHomeScreen()}, modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
                shape = RoundedCornerShape(12.dp), colors = ButtonDefaults.buttonColors(Color.White) ) {
                Text("Get Started",  style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.Red,
                    textAlign = TextAlign.Center
                ))
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun firstpreview(){
    FirstScreen({})
}