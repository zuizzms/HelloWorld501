package com.example.helloworld501

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var clickButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickButton = findViewById(R.id.click_button)

        clickButton.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                "Hello World!",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}