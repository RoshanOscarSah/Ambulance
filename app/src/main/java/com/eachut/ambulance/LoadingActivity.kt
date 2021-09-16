package com.eachut.ambulance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import com.bumptech.glide.Glide

class LoadingActivity : AppCompatActivity() {
    private lateinit var loadingLogo: ImageView
    private lateinit var cancalhigh: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        loadingLogo = findViewById(R.id.loadingLogo)
        cancalhigh = findViewById(R.id.cancalhigh)

        Glide.with(this)
            .load(R.drawable.requesting)
            .into(loadingLogo);

        Handler().postDelayed({
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)


        cancalhigh.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }


    }
}