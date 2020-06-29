package com.example.kotlin1

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess
import com.example.kotlin1.MainActivity2 as MainActivity2


//называем кнопки

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //присваиваем кнопкам реальные id
        val Play: Button = findViewById(R.id.buttonPlay)
        val Menu1: Button = findViewById(R.id.buttonMenu)
        val Exit1: Button = findViewById(R.id.buttonExit)
        //textS?.setText("Frrfra")
        //создаем экземпляр листенера
        Play.setOnClickListener {
            val randomIntent = Intent(this, MainActivity2::class.java)
            startActivity(randomIntent)
        }
        Menu1.setOnClickListener{
            val menuInten = Intent(this, SettingsActivity::class.java )
            startActivity(menuInten)
        }
        Exit1.setOnClickListener {
            System.exit(0)
        }


    }
}