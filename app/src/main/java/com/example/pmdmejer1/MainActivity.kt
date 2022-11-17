package com.example.pmdmejer1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onRestart = 4
    private var onStop = 5
    private var onDestroy = 6
    private lateinit var textNombre : EditText
    private lateinit var textApellido : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")
        textNombre= findViewById(R.id.editTextTextPersonName)
        textApellido=findViewById(R.id.editTextTextPersonName2)
    }



    override fun onStart() {
        super.onStart()
        println("onStar $onStart")
    }
    override fun onResume() {
        super.onResume()
        println("onResume $onResume")
    }
    override fun onPause() {
        super.onPause()
        println("onPause $onPause")
    }
    override fun onRestart() {
        super.onRestart()
        println("onRestart $onRestart")
    }
    override fun onStop() {
        super.onStop()
        println("onStop $onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy $onDestroy")
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        super.onSaveInstanceState(savedInstanceState)

        savedInstanceState.putString("TAGNOMBRE",textNombre.text.toString())
        savedInstanceState.putString("TAGAPELLIDO",textApellido.text.toString())

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        textNombre.setText(savedInstanceState.getString("TAGNOMBRE"))
        textApellido.setText(savedInstanceState.getString("TAGAPELLIDO"))

    }


}