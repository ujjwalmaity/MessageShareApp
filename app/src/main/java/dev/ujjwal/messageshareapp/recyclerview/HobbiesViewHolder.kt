package dev.ujjwal.messageshareapp.recyclerview

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import dev.ujjwal.messageshareapp.showToast
import kotlinx.android.synthetic.main.layout_hobbies_view.view.*

class HobbiesViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView) {

    private var currentHobby: Hobby? = null
    private var currentPosition: Int = 0

    init {
        itemView.setOnClickListener {
            context.showToast(currentHobby!!.title + " clicked!")
        }

        itemView.img_share.setOnClickListener {
            val message: String = "My hobby is " + currentHobby!!.title

            //Implicit Intent
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            context.startActivity(Intent.createChooser(intent, "Share to : "))
        }
    }

    fun setData(hobby: Hobby?, position: Int) {
        this.currentHobby = hobby
        this.currentPosition = position

        itemView.tv_title.text = hobby!!.title
    }
}