package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val number = (Math.floor(Math.random()*100) + 1).toInt()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun task(view: View){

        var txt1:TextView = findViewById(R.id.Second)
        var txt:EditText= findViewById(R.id.text1)
        var mine = txt.editableText.toString().toInt()

        if(mine > number){
            txt1.setText("Guess Lower")
        }else if(mine < number){
            txt1.setText("Guess Higher")
        }else{
            txt1.setText("Hurrah!!! You Won")
            return
        }

    }
}


