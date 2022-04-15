package com.melany.componentesui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_android_button.*

class AndroidButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_button)
        changeTextButton()
        declareClickListener()
    }
    private fun changeTextButton(){
        Handler(Looper.getMainLooper()).postDelayed({btnSimpleButton.text="New Text Button"},4000)

        Handler(Looper.getMainLooper()).postDelayed({btnButtonIcon.text="New Text Button Icon"},4000)
    }

    private fun declareClickListener(){
        btnSimpleButton.setOnClickListener {
            showToastShort("New Text btnSimpleButton")
        }

        btnButtonIcon.setOnClickListener {
            showToastShort("New Text btnButtonIcon")
        }
    }

    fun callMaterialDesignButton(view:android.view.View){
        showToastShort("callMaterialDesignButton")
    }
    fun callRightIconButton(view:android.view.View){
        showToastShort("RightIconButton && callBackgroundImageButton")
    }

    fun callBackgroundImageButton(view:android.view.View){
        showToastShort("callBackgroundImageButton")

    }
    fun callRoundButton(view:android.view.View){
        showToastShort("callRoundButton")
    }
    fun callBorderRadiusButton(view:android.view.View){
        showToastShort("CallBorderRadiusButton")
    }

    private fun showToastShort(message: String)= Toast.makeText(this, message, Toast.LENGTH_LONG).show()

}