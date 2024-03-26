package com.example.listviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView=findViewById<ListView>(R.id.listview)
        val names= arrayOf("Android", "Php", "Java", "C", "C++", "Python", "ASP .Net")

        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { AdapterView, view, i, l ->
            Toast.makeText(this,"Item Selected "+ names[i], Toast.LENGTH_LONG)
                .show()
        }
    }
}