package com.example.iteradmin.kotlin_prog01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt=findViewById<TextView>(R.id.devloper)
        val bt1=findViewById<Button>(R.id.button1)
        val bt2=findViewById<Button>(R.id.button2)
        bt1.setOnClickListener(){
            txt.setText("no,you r begginer")
        }
    }
}
