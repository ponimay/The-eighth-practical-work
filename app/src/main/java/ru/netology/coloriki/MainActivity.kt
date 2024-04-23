package ru.myaplication.Cheveta

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val redBtn: Button = findViewById(R.id.red_button)
        val orangeBtn: Button = findViewById(R.id.orange_button)
        val blueBtn: Button = findViewById(R.id.blue_button)
        val font1: Button = findViewById(R.id.font1)
        val font2: Button = findViewById(R.id.font2)
        val font3: Button = findViewById(R.id.font3)
        val textView: TextView = findViewById(R.id.current_color)
        val textView2: TextView = findViewById(R.id.cur_font)
        val rLayaut: ConstraintLayout = findViewById(R.id.constLay)


        redBtn.setOnClickListener {
            textView.text = "Красный"
            rLayaut.setBackgroundColor(resources.getColor(R.color.redColor, null))
        }
        orangeBtn.setOnClickListener {
            textView.text = "Оранжевый"
            rLayaut.setBackgroundColor(resources.getColor(R.color.orangeColor, null))
        }
        blueBtn.setOnClickListener {
            textView.text = "Синий"
            rLayaut.setBackgroundColor(resources.getColor(R.color.blueColor, null))
        }
        font1.setOnClickListener {
            textView2.typeface = Typeface.create("casual", Typeface.NORMAL)
        }
        font2.setOnClickListener {
            textView2.typeface = Typeface.create("cursive", Typeface.NORMAL)
        }
        font3.setOnClickListener {
            textView2.typeface = Typeface.create("monospace", Typeface.NORMAL)
        }
    }


}