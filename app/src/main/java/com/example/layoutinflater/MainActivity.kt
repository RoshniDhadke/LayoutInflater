package com.example.layoutinflater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view= layoutInflater.inflate(R.layout.design,null)
        val layout=findViewById<LinearLayout>(R.id.linearlayout)
        layout.addView(view)
        view.findViewById<EditText>(R.id.ed1)
        view.findViewById<EditText>(R.id.ed2)
        view.findViewById<Button>(R.id.button)

    }
}