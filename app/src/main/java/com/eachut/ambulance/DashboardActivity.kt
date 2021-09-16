package com.eachut.ambulance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout

class DashboardActivity : AppCompatActivity() {


    private lateinit var phonebookD: ImageView
    private lateinit var healthytipD: ImageView
    private lateinit var request: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        phonebookD =  findViewById(R.id.phonebookD)
        healthytipD = findViewById(R.id.healthytipD)
        request = findViewById(R.id.request)


        phonebookD.setOnClickListener {
            val intent = Intent(this, PhonebookActivity::class.java)
            startActivity(intent)
        }

        healthytipD.setOnClickListener {
            val intent = Intent(this, HealthtipActivity::class.java)
            startActivity(intent)
        }

        request.setOnClickListener {
            val intent = Intent(this, LoadingActivity::class.java)
            startActivity(intent)
        }


    }
}