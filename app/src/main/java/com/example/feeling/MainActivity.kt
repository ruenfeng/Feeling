package com.example.feeling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fab.setOnClickListener{
            val intent: Intent = Intent(this,
                AddActivity::class.java)

            startActivityForResult(intent, REQUEST_CODE)
        }
    }

    companion object{
        val REQUEST_CODE = 1
    }
}
