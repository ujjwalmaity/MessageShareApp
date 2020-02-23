package dev.ujjwal.messageshareapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.ujjwal.messageshareapp.R
import dev.ujjwal.messageshareapp.recyclerview.HobbiesViewAdapter
import dev.ujjwal.messageshareapp.recyclerview.Hobby
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
        val hobbies = listOf(
            Hobby(resources.getString(R.string.swimming)),
            Hobby(resources.getString(R.string.reading)),
            Hobby(resources.getString(R.string.walking)),
            Hobby(resources.getString(R.string.sleeping)),
            Hobby(resources.getString(R.string.gaming)),
            Hobby(resources.getString(R.string.programming)),
            Hobby(resources.getString(R.string.talking)),
            Hobby(resources.getString(R.string.acting)),
            Hobby(resources.getString(R.string.baking)),
            Hobby(resources.getString(R.string.coloring)),
            Hobby(resources.getString(R.string.cycling)),
            Hobby(resources.getString(R.string.dancing)),
            Hobby(resources.getString(R.string.drawing)),
            Hobby(resources.getString(R.string.flying_kite)),
            Hobby(resources.getString(R.string.gardening)),
            Hobby(resources.getString(R.string.painting)),
            Hobby(resources.getString(R.string.running)),
            Hobby(resources.getString(R.string.singing))
        )

        //LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
        val hobbiesViewAdapter = HobbiesViewAdapter(this, hobbies)
        recyclerView.adapter = hobbiesViewAdapter
    }
}
