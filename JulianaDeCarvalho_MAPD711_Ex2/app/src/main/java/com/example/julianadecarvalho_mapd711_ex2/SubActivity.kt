package com.example.julianadecarvalho_mapd711_ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        //defining an intent object
        val intent = intent

        //getting values from previous activity using intent object
        val fullName      = intent.getStringExtra("FullName")
        val qualification = intent.getStringExtra("Qualification")
        val profession    = intent.getStringExtra("Profession")
        val hobby         = intent.getStringExtra("Hobby")
        val dreamJob      = intent.getStringExtra("DreamJob")

        //defining a reference for all text view controls
        val txtFullName      = findViewById<TextView> (R.id.txtFullName)
        val txtQualification = findViewById<TextView> (R.id.txtQualification)
        val txtProfession    = findViewById<TextView> (R.id.txtProfession)
        val txtHobby         = findViewById<TextView> (R.id.txtHobby)
        val txtDreamJob      = findViewById<TextView> (R.id.txtDreamJob)

        //assigning values to all textview controls
        txtFullName.text      = txtFullName.text.toString() +" "+fullName
        txtQualification.text = txtQualification.text.toString() +" "+qualification
        txtProfession.text    = txtProfession.text.toString() +" "+profession
        txtHobby.text         = txtHobby.text.toString() +" "+hobby
        txtDreamJob.text      = txtDreamJob.text.toString() +" "+dreamJob

    }
}