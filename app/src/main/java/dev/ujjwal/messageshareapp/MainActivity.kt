package dev.ujjwal.messageshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_showToast.setOnClickListener {
            Log.i("MainActivity", "Button clicked !")
            Toast.makeText(applicationContext, "Button clicked !", Toast.LENGTH_SHORT).show()
        }

        btn_sendUserMessageToNextActivity.setOnClickListener {

            val message: String = et_userMessage.text.toString()
            et_userMessage.setText("")

            //Explicit Intent
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
    }
}
