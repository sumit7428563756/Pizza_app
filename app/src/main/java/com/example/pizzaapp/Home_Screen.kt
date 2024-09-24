package com.example.pizzaapp






import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaapp.ThirdScreen
import com.example.pizzaapp.ui.theme.BackgroundColor
import com.example.pizzaapp.ui.theme.RedColor
import com.example.pizzaapp.ui.theme.YellowColor
import com.example.pizzaapp.ThirdScreen as ThirdScreen1



@Composable
fun HomeScreen(navigationToFirstScreen:()-> Unit){
    val menuList = listOf("Regular", "Medium","Large","FamilyPack","Double Cheezze")
    var CurrentState by remember { mutableStateOf("Regular") }
    val ScrollState = rememberScrollState()
    val name = remember { mutableSetOf("") }


    Box(modifier = Modifier
        .fillMaxSize()
        .background(BackgroundColor)){
        Column() {
            PizzaHeader {}
            Card(modifier = Modifier.fillMaxWidth()) {
                Row (modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(ScrollState)
                ){
                    menuList.forEach {
                        CustomChip(title = it,  it == CurrentState , onValueChange ={data->
                            CurrentState = data
                        } )
                    }
                }
            }
            LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                items(PizzaList){
                    ShowPizza(pizza = it){}
                }
            }
        }
        ExtendedButton(modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 30.dp)
            .align(Alignment.BottomEnd))
    }
}

@Composable
fun ExtendedButton(modifier: Modifier){
    Box (modifier = modifier
        .height(48.dp)
        .clip(RoundedCornerShape(25.dp))
        .background(Color.DarkGray)){
        Row {
            SpacerWidth(20.dp)
            Text(text = "RS:-350", style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.W600,
                color = Color.White
            ),
                modifier = Modifier.align(CenterVertically))
            Icon(painter = painterResource(id = R.drawable.pngtreepizza_13019420), contentDescription ="",
                modifier = Modifier
                    .size(46.dp)
                    .padding(2.dp),
                tint = Color.Unspecified)
        }
    }

}

@Composable
fun ShowPizza(
    pizza: Pizza,navigationToThirdScreen: (Pizza) -> Unit
){
    Card(
        modifier = Modifier
            .width(175.dp)
            .padding(5.dp),
        shape = RoundedCornerShape(5.dp)
    ){
        Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Column(modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(id = pizza.image), contentDescription = "",
                    modifier = Modifier.size(109.dp))
                SpacerHeight()
                Text(text = pizza.price, style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    color = RedColor
                ),
                    textAlign = TextAlign.Center
                )
                SpacerHeight()
                Text(text = pizza.name, style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W600,
                    color = RedColor
                ),   textAlign = TextAlign.Center
                )
                SpacerHeight()
                Text(text = pizza.description, style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W600,
                    color = Color.DarkGray
                ),   textAlign = TextAlign.Center
                )
                SpacerHeight()
                Button(onClick = {navigationToThirdScreen(pizza) }, modifier = Modifier.width(91.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = ButtonDefaults.buttonColors(YellowColor))
                {
                    Text(text = "ADD", style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.White
                    )
                    )
                }
            }
        }
    }
}


@Composable
fun PizzaHeader(
    onclick: ()-> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(RedColor)
    ) {
        Row {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp, horizontal = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    IconButton(onClick = { onclick() }) {
                        Icon(imageVector = Icons.Default.Menu, contentDescription = null)
                    }
                    SpacerWidth()
                    SpacerHeight(20.dp)
                    Text(
                        text = "Chaursiya's Pizza", style = TextStyle(
                            fontSize = 30.sp,
                            fontWeight = FontWeight.W600,
                            color = Color.White
                        )
                    )
                }
                IconButton(onClick = { onclick() }) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = null)
                }

            }
        }

    }
}

@Composable
fun CustomChip(
    title: String,
    selected: Boolean,
    onValueChange: (String)-> Unit
){
    TextButton(onClick = {onValueChange(title)},
        shape = RoundedCornerShape(200.dp),
        elevation = ButtonDefaults.elevatedButtonElevation(0.dp),
        colors = ButtonDefaults.buttonColors(
            if (selected) YellowColor else Color.Transparent
        ),
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
    ) {
        Text(text = title, style = TextStyle(
            fontSize = 14.sp,
            fontWeight =FontWeight.W600,
            color = if (selected) Color.White else Color.DarkGray
        ))
    }

}
