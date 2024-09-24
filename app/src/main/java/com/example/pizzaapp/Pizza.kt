package com.example.pizzaapp


import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pizza(
    @DrawableRes val image: Int,
    val name: String,
    val description: String,
    val price: String
):Parcelable
val PizzaList = listOf(
    Pizza(
        R.drawable.tomato_pizza,
        name = "Tomato pizza",
        description = "Slices of Tomatos as a topings on Pizza",
        price = "RS:-70"
    ),
    Pizza(
        R.drawable.corn_pizza,
        name = "Corn Pizza",
        description = "Sweet Corn as a topings on Pizza",
        price = "RS:-70"
    ),
    Pizza(
        R.drawable.capcicum_pizza,
        name = "Capcicum Pizza",
        description = "Slices of Capcicum as a topings on Pizza",
        price = "RS:-70"
    ),Pizza(
        R.drawable.paneer_pizza,
        name = "Paneer Pizza",
        description = "Slice of Paneer as a topings on Pizza",
        price = "RS:-70"
    ),Pizza(
        R.drawable.pngtreepizza_13019420,
        name = "Onion Pizza",
        description = "Slices of Onion as a topings on Pizza",
        price = "RS:-70"
    ),Pizza(
        R.drawable.mixed_pizza,
        name = "Mixed Pizza",
        description = "Mixed Vegies as a topings on Pizza",
        price = "RS:-70"
    ),Pizza(
        R.drawable.pngtreepizza_burgers_and_fast_food_16263047,
        name = "Family Pack Pizza",
        description = "A large size Pizza with burger,French Fries,with cock",
        price = "RS:-250"
    ))

