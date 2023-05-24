package com.example.facebook

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity2 : AppCompatActivity()
{
    lateinit var loginBtn:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title = "Log in"

        loginBtn=findViewById(R.id.loginBtn)
        loginBtn.setOnClickListener {
            Toast.makeText(this@MainActivity2,"start next page",Toast.LENGTH_LONG).show()
            val intent=Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(intent)


        }



    }
}


