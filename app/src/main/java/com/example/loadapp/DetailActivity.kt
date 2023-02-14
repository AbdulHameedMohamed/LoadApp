package com.example.loadapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

class DetailActivity : AppCompatActivity() {
    private var fileName = ""
    private var status = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        setListeners()

        getExtras()
    }

    private fun setListeners() {
        ok_button.setOnClickListener {
            goToMainScreen()
        }
    }

    private fun getExtras() {
        fileName = intent.getStringExtra("fileName").toString()
        status = intent.getStringExtra("status").toString()
        file_name.text = fileName
        status_text.text = status
    }

    private fun goToMainScreen() {
        val  mainActivity = Intent(this, MainActivity::class.java)
        startActivity(mainActivity)
    }
}
