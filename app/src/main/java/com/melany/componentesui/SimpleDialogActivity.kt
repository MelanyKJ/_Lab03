package com.melany.componentesui

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class SimpleDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_dialog)
    }
    fun showDialog(view: android.view.View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert Dialog Title")
        builder.setMessage("Here is android alert dialog message")
            .setPositiveButton("OK",
                DialogInterface.OnClickListener{dialog, id ->
                    this.showToast("Click Positive Button")
                })
            .setNegativeButton("Negative Button",
                DialogInterface.OnClickListener { dialog, id ->
                    this.showToast("Click Negative Button")
                })
        // Create the AlertDialog object and return it
        builder.create()

        builder.show()

    }
}