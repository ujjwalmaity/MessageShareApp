package dev.ujjwal.messageshareapp.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.ujjwal.messageshareapp.R

class HobbiesViewAdapter(val context: Context, val hobbies: List<Hobby>) :
    RecyclerView.Adapter<HobbiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbiesViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_hobbies_view, parent, false)
        return HobbiesViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: HobbiesViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }
}