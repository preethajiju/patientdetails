package com.example.patientdetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonclickevent(view: View) {
        var getName=findViewById<EditText>(R.id.name)
        var getDoc=findViewById<EditText>(R.id.doc)
        var getSym=findViewById<EditText>(R.id.sym)
        Toast.makeText(this,getName.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getDoc.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getSym.text.toString(),Toast.LENGTH_LONG).show()


    }

    fun clickbuttonevent(view: View) {
        var getName=findViewById<EditText>(R.id.name)
        var getDoc=findViewById<EditText>(R.id.doc)
        var getSym=findViewById<EditText>(R.id.sym)
        Toast.makeText(this,"Try again",Toast.LENGTH_LONG).show()
    }
}