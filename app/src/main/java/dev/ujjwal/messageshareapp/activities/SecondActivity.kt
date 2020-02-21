package dev.ujjwal.messageshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.ujjwal.messageshareapp.Constants
import dev.ujjwal.messageshareapp.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        val TAG: String = SecondActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras

        bundle?.let {
            val message = bundle.getString(Constants.USER_MSG_KEY)

            tv_userMessage.text = message
        }
    }
}
