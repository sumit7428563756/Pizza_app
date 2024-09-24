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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pizzaapp.ui.theme.BackgroundColor
import com.example.pizzaapp.ui.theme.YellowColor


    @Composable
    fun ThirdScreen(pizza: Pizza) {

        Box(
            modifier = Modifier
                .fillMaxHeight()
                .background(BackgroundColor)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = pizza.image),
                             contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth()
                                .size(200.dp)
                                .padding(10.dp)
                        )
                        SpacerHeight(20.dp)
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White),
                            shape = RoundedCornerShape(topStart = 5.dp)
                        ) {
                            Text(
                                text = pizza.name, style = TextStyle(
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.W800,
                                    color = Color.Black
                                ), textAlign = TextAlign.Center
                            )
                            SpacerHeight(5.dp)
                            Text(
                                text = pizza.price,
                                Modifier
                                    .clip(RoundedCornerShape(5.dp))
                                    .background(
                                        Color.DarkGray
                                    ), style = TextStyle(
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.W800,
                                    color = Color.Black,
                                ), textAlign = TextAlign.Center
                            )
                            SpacerHeight(5.dp)
                            Text(
                                text = pizza.description, style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.W800,
                                    color = Color.DarkGray
                                ), textAlign = TextAlign.Center
                            )
                            SpacerHeight(5.dp)
                            Text(
                                text = pizza.price,
                                Modifier
                                    .clip(RoundedCornerShape(2.dp))
                                    .background(
                                        Color.DarkGray
                                    )
                                    .padding(5.dp), style = TextStyle(
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.W800,
                                    color = Color.Black,
                                ), textAlign = TextAlign.Start
                            )
                            SpacerHeight(5.dp)
                            Button(
                                onClick = { }, modifier = Modifier.width(91.dp),
                                shape = RoundedCornerShape(18.dp),
                                colors = ButtonDefaults.buttonColors(YellowColor)
                            )
                            {
                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Pay Now", style = TextStyle(
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.W600,
                                        color = Color.Yellow
                                    )
                                )
                            }

                        }
                    }

                }

            }
        }
    }




