package com.eachut.ambulance

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var blink: ImageView
    private lateinit var ambulance_logo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        blink = findViewById(R.id.blink)
        ambulance_logo = findViewById(R.id.ambulance_logo)


        Handler().postDelayed({
            blink.visibility = View.INVISIBLE
        }, 800)

        Handler().postDelayed({
            blink.visibility = View.VISIBLE
        }, 800)

        Handler().postDelayed({
            blink.visibility = View.INVISIBLE
        }, 800)

        Handler().postDelayed({
            blink.visibility = View.VISIBLE
        }, 800)



        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }, 800)

    }
}