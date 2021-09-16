package com.eachut.ambulance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.isVisible

class HealthtipActivity : AppCompatActivity() {
    private lateinit var backHealthytip: ImageView
    private lateinit var cardio: LinearLayout
    private lateinit var cardiodesc: LinearLayout
    private lateinit var cardioimg: ImageView

    private lateinit var snake: LinearLayout
    private lateinit var snakedesc: LinearLayout
    private lateinit var snakeimg: ImageView

    private lateinit var chemical: LinearLayout
    private lateinit var chemicaldesc: LinearLayout
    private lateinit var chemicalimg: ImageView

    private lateinit var heart: LinearLayout
    private lateinit var heartdesc: LinearLayout
    private lateinit var heartimg: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_healthtip)


        backHealthytip = findViewById(R.id.backHealthytip)

        cardio = findViewById(R.id.cardio)
        cardiodesc = findViewById(R.id.cardiodesc)
        cardioimg = findViewById(R.id.cardioimg)

        snake = findViewById(R.id.snake)
        snakedesc = findViewById(R.id.snakedesc)
        snakeimg = findViewById(R.id.snakeimg)

        chemical = findViewById(R.id.chemical)
        chemicaldesc = findViewById(R.id.chemicaldesc)
        chemicalimg = findViewById(R.id.chemicalimg)

        heart = findViewById(R.id.heart)
        heartdesc = findViewById(R.id.heartdesc)
        heartimg = findViewById(R.id.heartimg)


        backHealthytip.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }


        cardio.setOnClickListener {
            var expandedOrNot = cardio.getContentDescription().toString()

            if (expandedOrNot == "0"){
                cardiodesc.isVisible = true
                cardioimg.setImageResource(R.drawable.uparrow)
                cardio.contentDescription = "1"
            }else{
                cardiodesc.isVisible = false
                cardioimg.setImageResource(R.drawable.downarrow)
                cardio.contentDescription = "0"
            }
        }

        snake.setOnClickListener {
            var expandedOrNot = snake.getContentDescription().toString()

            if (expandedOrNot == "0"){
                snakedesc.isVisible = true
                snakeimg.setImageResource(R.drawable.uparrow)
                snake.contentDescription = "1"
            }else{
                snake.isVisible = false
                snakeimg.setImageResource(R.drawable.downarrow)
                snake.contentDescription = "0"
            }
        }

        chemical.setOnClickListener {
            var expandedOrNot = chemical.getContentDescription().toString()

            if (expandedOrNot == "0"){
                chemicaldesc.isVisible = true
                chemicalimg.setImageResource(R.drawable.uparrow)
                chemical.contentDescription = "1"
            }else{
                chemicaldesc.isVisible = false
                chemicalimg.setImageResource(R.drawable.downarrow)
                chemical.contentDescription = "0"
            }
        }

        heart.setOnClickListener {
            var expandedOrNot = heart.getContentDescription().toString()

            if (expandedOrNot == "0"){
                heartdesc.isVisible = true
                heartimg.setImageResource(R.drawable.uparrow)
                heart.contentDescription = "1"
            }else{
                heartdesc.isVisible = false
                heartimg.setImageResource(R.drawable.downarrow)
                heart.contentDescription = "0"
            }
        }








    }
}