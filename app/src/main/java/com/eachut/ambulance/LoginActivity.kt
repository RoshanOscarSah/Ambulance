package com.eachut.ambulance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var etLusername: EditText
    private lateinit var etLpassword: EditText
    private lateinit var signinHighlight: ImageView
    private lateinit var Emergency: TextView
    private lateinit var tvLsighup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etLusername = findViewById(R.id.etLusername)
        etLpassword = findViewById(R.id.etLpassword)
        signinHighlight = findViewById(R.id.signinHighlight)
        Emergency = findViewById(R.id.Emergency)
        tvLsighup = findViewById(R.id.tvLsighup)

        signinHighlight.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        tvLsighup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        Emergency.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }





    }
}