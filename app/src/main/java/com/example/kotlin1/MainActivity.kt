package com.example.kotlin1

import android.content.Intent
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable

import java.util.ArrayList

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


//называем кнопки

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //присваиваем кнопкам реальные id
        val Play: Button = findViewById(R.id.buttonPlay)
        val Menu1: Button = findViewById(R.id.buttonMenu)
        val Exit1: Button = findViewById(R.id.buttonExit)
        //val Rocet: ImageView = findViewById(R.id.rocet)
        //textS?.setText("Frrfra")
        //создаем экземпляр листенера
        Play.setOnClickListener {
            val randomIntent = Intent(this, MainActivity2::class.java)
            startActivity(randomIntent)}

        Menu1.setOnClickListener {
                val menuInten = Intent(this, SettingsActivity::class.java)
                startActivity(menuInten)
            }
                //создаем экземпляр листенера


        Exit1.setOnClickListener {
            System.exit(0)
        }
        val imageViews: MutableList<ImageView> =
            ArrayList()

        imageViews.add(findViewById<View>(R.id.imageView2) as ImageView)

        animateImageViews(imageViews)
    }

    private fun animateImageViews(imageViews: List<ImageView>) {
        for (imageView in imageViews) {
            animateImageView(imageView)
        }
    }

    private fun animateImageView(imageView: ImageView) {
        val drawable = imageView.drawable
        if (drawable is Animatable) {
            val animatable = drawable as Animatable
            animatable.start()
        }
    }
    }