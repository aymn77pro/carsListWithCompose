package com.example.cars.dataSurce

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.cars.R

data class CarsDataClass(
   @DrawableRes val carImage:Int,
   @StringRes val carType: Int,
   @StringRes val carPrice : Int
)


val cars = listOf<CarsDataClass>(
   CarsDataClass(R.drawable.car1,R.string.car_1,R.string.carPrice1),
   CarsDataClass(R.drawable.car2,R.string.car_2,R.string.carPrice2),
   CarsDataClass(R.drawable.car3,R.string.car_3,R.string.carPrice3),
   CarsDataClass(R.drawable.car4,R.string.car_4,R.string.carPrice4),
   CarsDataClass(R.drawable.car5,R.string.car_5,R.string.carPrice5),
   CarsDataClass(R.drawable.car6,R.string.car_6,R.string.carPrice6),
   CarsDataClass(R.drawable.car7,R.string.car_7,R.string.carPrice7),
   CarsDataClass(R.drawable.car8,R.string.car_8,R.string.carPrice8),
   CarsDataClass(R.drawable.car9,R.string.car_9,R.string.carPrice9),
   CarsDataClass(R.drawable.car10,R.string.car_10,R.string.carPrice10)
)
