package dev.ujjwal.messageshareapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dev.ujjwal.messageshareapp.R
import dev.ujjwal.messageshareapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_showToast.setOnClickListener {
            Log.i("MainActivity", "Button clicked !")
            showToast("Button clicked !")
        }

        btn_sendUserMessageToNextActivity.setOnClickListener {

            val message: String = et_userMessage.text.toString()
            et_userMessage.setText("")

            //Explicit Intent
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }

        btn_shareToOtherApps.setOnClickListener {

            val message: String = et_userMessage.text.toString()
            et_userMessage.setText("")

            //Implicit Intent
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to : "))
        }

        btn_recyclerViewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
