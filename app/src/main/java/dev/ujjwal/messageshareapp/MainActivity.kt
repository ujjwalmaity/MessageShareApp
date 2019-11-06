package dev.ujjwal.messageshareapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_showToast.setOnClickListener {
            Log.i("MainActivity", "Button clicked !")
            Toast.makeText(applicationContext, "Button clicked !", Toast.LENGTH_SHORT).show()
        }
    }
}
