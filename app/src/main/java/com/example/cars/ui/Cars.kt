package com.example.cars.ui

import android.annotation.SuppressLint
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.cars.R
import com.example.cars.dataSurce.CarsDataClass
import com.example.cars.dataSurce.cars
import com.example.cars.ui.theme.CarsTheme

@Composable
fun CarsApp(){
    CarsTheme {
        CarsList(carsList = cars)
    }
}
//نسوي الكرت اولا
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CarsCard(carsDataClass: CarsDataClass,modifier: Modifier = Modifier){
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier.padding(8.dp),
        elevation = 4.dp,
        enabled = true,
        onClick = {expanded = !expanded},
    ) {
    Column(
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
            ) {
        Image(
            painter = painterResource(id = carsDataClass.carImage) ,
            contentDescription = stringResource(id = carsDataClass.carType),
            modifier = modifier
                .fillMaxWidth()
                .height(194.dp),
            contentScale = ContentScale.Crop
            )
        Text(
            text = stringResource(id = carsDataClass.carType),
            modifier = modifier.padding(16.dp),
            style = MaterialTheme.typography.h6
        )
        if (expanded) {CarsPrice(carsDataClass = carsDataClass)}

    }
}
}

// يطلع لنا السعر عند ضغط على الكرت
@Composable
private fun CarsPrice(carsDataClass: CarsDataClass,modifier: Modifier=Modifier){
    Column(
        modifier = modifier.padding(
            start = 16.dp,
            top = 8.dp,
            bottom = 16.dp,
            end = 16.dp
        )
    ) {
        Text(
            text = stringResource(R.string.price),
            style = MaterialTheme.typography.h3
        )
        Text(
            text = stringResource(carsDataClass.carPrice),
            style = MaterialTheme.typography.body1
        )
    }
}



//بنسوي اللسته في هاذي الداله نحتاج متغير من نواع داتا كلاس
@Composable
fun CarsList(carsList:List<CarsDataClass>,modifier: Modifier = Modifier){
    LazyColumn{
        items(carsList){ cars ->
            CarsCard(carsDataClass = cars)
        }
    }
}