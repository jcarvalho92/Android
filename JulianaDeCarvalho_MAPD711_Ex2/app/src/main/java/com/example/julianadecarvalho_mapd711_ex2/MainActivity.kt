package com.example.julianadecarvalho_mapd711_ex2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = findViewById<View>(R.id.btnSend)

        btnSend.setOnClickListener {

            //creating an intent object using both first and second activities.
            val i = Intent(this, SubActivity::class.java)

            //initializing a reference using resources (strings.xml)
            val fullName = resources.getString(R.string.full_name)
            val qualification = resources.getString(R.string.qualification)
            val profession = resources.getString(R.string.profession)
            val hobby = resources.getString(R.string.hobby)
            val dreamJob = resources.getString(R.string.dream_job)

            //storing value with key values pair of intent object using putExtra() method
            i.putExtra("FullName", fullName)
            i.putExtra("Qualification", qualification)
            i.putExtra("Profession", profession)
            i.putExtra("Hobby", hobby)
            i.putExtra("DreamJob", dreamJob)

            //this method helps to navigate first activity screen to second activity screen.
            startActivity(i)


        }
    }

}