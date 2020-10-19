package com.example.julianadecarvalho_mapd711_ex1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSend = findViewById<View>(R.id.btnSend)


            btnSend.setOnClickListener {

                //creating an intent object using both first and second activities.
                val i = Intent(this, SubActivity::class.java)

                //initializing a reference object for all edit texts
                //storing value with key values pair of intent object using putExtra() method
                val fullName      = findViewById<EditText>(R.id.edtFullName)


                //storing value with key values pair of intent object using putExtra() method
                i.putExtra("FullName", fullName.text.toString())

                //this method helps to navigate first activity screen to second activity screen.
                startActivity(i)


            }

    }
}