package me.vincent.weather.feature.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import me.vincent.weather.R.layout

class WeatherActivity : AppCompatActivity() {
  
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
  }

  fun requestForLocationPermission() {
    //TODO: Request to access location
  }

  fun getLocation() {
    //TODO: Get Location of user
  }

  fun makeNetworkCall() {
    //TODO: Call Network Call Function here
  }
}
