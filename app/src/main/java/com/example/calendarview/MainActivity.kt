package com.example.calendarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         var kalendarz=findViewById<CalendarView>(R.id.calendarView)
        kalendarz.minDate=System.currentTimeMillis()
        kalendarz.maxDate=System.currentTimeMillis() + (kalendarz.maxDate - System.currentTimeMillis())
        var wyjazd=findViewById<Button>(R.id.wyjazd)
        var powrot=findViewById<Button>(R.id.powrot)
        var licz=findViewById<Button>(R.id.policz)
        var wyjazdtxt=findViewById<TextView>(R.id.wyjazdtext)
        var powrottxt=findViewById<TextView>(R.id.powrottext)
        var licztxt=findViewById<TextView>(R.id.policztext)
        var data= arrayListOf<Int>(0,0,0)
        var data_odj= arrayListOf<Int>(0,0,0)
        var data_przyj= mutableListOf<Int>(0,0,0)
        
        }
}