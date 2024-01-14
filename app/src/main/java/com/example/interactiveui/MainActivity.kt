package com.example.interactiveui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val instagram=findViewById<Button>(R.id.instagram)
        val facebook=findViewById<Button>(R.id.facebook)
        val whatsapp=findViewById<Button>(R.id.whatsapp)
        instagram.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.instagram.com/")
            startActivity(intent)
        }
        facebook.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.facebook.com/")
            startActivity(intent)
        }
        whatsapp.setOnClickListener(){
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.whatsapp.com/")
            startActivity(intent)
        }
    }


}