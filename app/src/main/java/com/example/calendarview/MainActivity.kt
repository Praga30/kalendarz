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
        kalendarz.setOnDateChangeListener(){ CalendarView, i, a, b ->
            data[0]=i
            data[1]=a+1
            data[2]=b
        }
        powrot.setOnClickListener {
            data_przyj[0] = data[0]
            data_przyj[1] = data[1]
            data_przyj[2] = data[2]
            powrottxt.text="Data powrotu: "+data[2].toString()+"-"+data[1].toString()+"-"+data[0].toString()
        }
        wyjazd.setOnClickListener {
            data_odj[0]=data[0]
            data_odj[1]=data[1]
            data_odj[2]=data[2]
            wyjazdtxt.text="Data wyjazdu: "+data[2].toString()+"-"+data[1].toString()+"-"+data[0].toString()
        }

        licz.setOnClickListener {
            var tempprzyj=(data_przyj[0]+360)+(data_przyj[1]+30)+data_przyj[2]
            var tempodj=(data_odj[0]+360)+(data_odj[1]+30)+data_odj[2]
            var templicz=(tempprzyj.toChar()-tempodj.toChar())
            if(templicz<0)
            {
                licztxt.text="Niepoprawna data powrotu"
            }
            else
            {
                templicz.toString()
            licztxt.text="Ilosc dni: "+templicz
            }
        }
        }
}