package com.ajmi.employeeapp

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

    fun loginemp(view: View) {
        var getEname=findViewById<EditText>(R.id.empname)
        var getEcod=findViewById<EditText>(R.id.empcod)
        var getDes=findViewById<EditText>(R.id.des)
        var getCname=findViewById<EditText>(R.id.cmpnm)
        var getPlace=findViewById<EditText>(R.id.plac)
        Toast.makeText(this,getEname.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getEcod.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getDes.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getCname.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getPlace.text.toString(),Toast.LENGTH_SHORT).show()
    }
}