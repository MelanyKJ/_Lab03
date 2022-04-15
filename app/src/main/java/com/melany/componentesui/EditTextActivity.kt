package com.melany.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_text.*

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
    }
    fun register(view: android.view.View){
        when (edtfirstName.text.isBlank() && edtlastName.text.isBlank()){
            true -> tvdisplayName.text= "Ingresar texto"
            false -> tvdisplayName.text= "Your username is ${edtfirstName.text} ${edtlastName.text}"
        }
    }
}

