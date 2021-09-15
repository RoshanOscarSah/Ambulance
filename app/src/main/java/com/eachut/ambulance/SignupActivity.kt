package com.eachut.ambulance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class SignupActivity : AppCompatActivity() {

    private lateinit var signupHighlight: ImageView
    private lateinit var tvSlogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        signupHighlight = findViewById(R.id.signupHighlight)
        tvSlogin = findViewById(R.id.tvSlogin)

        signupHighlight.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        tvSlogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }



    }
}