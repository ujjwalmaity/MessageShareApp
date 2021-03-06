package dev.ujjwal.messageshareapp.recyclerview

import android.content.Context
import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import dev.ujjwal.messageshareapp.R
import dev.ujjwal.messageshareapp.showToast
import kotlinx.android.synthetic.main.layout_hobbies_view.view.*

class HobbiesViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView) {

    private var currentHobby: Hobby? = null
    private var currentPosition: Int = 0

    init {
        itemView.setOnClickListener {
            currentHobby?.let {
                context.showToast(currentHobby!!.title + context.resources.getString(R.string.clicked))
            }
        }

        itemView.img_share.setOnClickListener {
            currentHobby?.let {
                val message: String =
                    context.resources.getString(R.string.my_hobby_is) + currentHobby!!.title

                //Implicit Intent
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"
                context.startActivity(
                    Intent.createChooser(
                        intent,
                        context.resources.getString(R.string.share_to)
                    )
                )
            }
        }
    }

    fun setData(hobby: Hobby?, position: Int) {
        this.currentHobby = hobby
        this.currentPosition = position

        hobby?.let {
            itemView.tv_title.text = hobby.title
        }
    }
}