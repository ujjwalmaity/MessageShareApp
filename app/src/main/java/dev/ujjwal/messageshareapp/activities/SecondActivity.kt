package dev.ujjwal.messageshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.ujjwal.messageshareapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val message = bundle!!.getString("user_message")

        tv_userMessage.text = message
    }
}
