package com.eachut.ambulance

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat

class PhonebookActivity : AppCompatActivity() {
    private lateinit var relativelayout: RelativeLayout
    private lateinit var myImageView: ImageView
    private lateinit var backPhonebook: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phonebook)

        relativelayout = findViewById(R.id.relativelayout)
        myImageView = findViewById(R.id.myImageView)
        backPhonebook = findViewById(R.id.backPhonebook)

        relativelayout.setOnClickListener {
            DrawableCompat.setTint(
                DrawableCompat.wrap(myImageView.drawable),
                ContextCompat.getColor(this, R.color.white50)
            )
        }

        backPhonebook.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }


    }
}