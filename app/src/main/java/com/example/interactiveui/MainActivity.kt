package com.example.interactiveui

import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity<Book> : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation", "WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val searchBar = findViewById<EditText>(R.id.search_bar)
         val Atomic = findViewById<Button>(R.id.ATOMIC_HABITS)
        searchBar.setOnClickListener {
            val searchQuery = searchBar.text.toString().trim()  // Get the trimmed query

            if (searchQuery.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, searchQuery)  // Add query to intent
                startActivity(intent)
            } else {
                // Handle empty query case (e.g., display a message)
                Toast.makeText(this, "Please enter correct book name to search", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        Atomic.setOnClickListener()
        {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://pdf.ac/17QJow")
            startActivity(intent)
        }
    }

}

