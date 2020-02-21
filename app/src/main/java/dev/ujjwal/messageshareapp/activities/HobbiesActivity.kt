package dev.ujjwal.messageshareapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.ujjwal.messageshareapp.R
import dev.ujjwal.messageshareapp.recyclerview.HobbiesViewAdapter
import dev.ujjwal.messageshareapp.recyclerview.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    companion object {
        val TAG: String = HobbiesActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        //LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
        val hobbiesViewAdapter = HobbiesViewAdapter(this, Supplier.hobbies)
        recyclerView.adapter = hobbiesViewAdapter
    }
}
