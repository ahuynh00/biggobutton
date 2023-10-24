package edu.uw.ischool.ahuynh00.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var clicks = 0;
        findViewById<Button>(R.id.button)
            .setOnClickListener {
                clicks++
                val btn: Button = findViewById(R.id.button)
                btn.text = when(clicks){
                    0 -> getString(R.string.no_clicks)
                    1 -> getString(R.string.one_click)
                    else -> getString(R.string.multi_clicks, clicks)
                }

            }
    }
}