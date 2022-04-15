package com.melany.componentesui


import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)
    }
    class SpinnerActivityActivity : AppCompatActivity() {
        private var spinner1: Spinner? = null
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_spinner)
            spinner1 = findViewById<View>(R.id.spinner) as Spinner
            spinner1!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    pos: Int,
                    id: Long
                ) {
                    Toast.makeText(
                        parent.context,
                        "You have selected : " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onNothingSelected(arg: AdapterView<*>?) {}
            }
        }

        fun showvalue(view: View?) {
            val item = spinner1!!.selectedItem as String
            Toast.makeText(this, "You have selected : $item", Toast.LENGTH_SHORT).show()
        }
    }

}