package com.dip.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dip.recycleview.adapter.ActorAdapter
import com.dip.recycleview.model.Actor

class MainActivity : AppCompatActivity() {
    private var lstActor = ArrayList<Actor>()
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recylerview)

        loadActor()
        val adapter = ActorAdapter(lstActor,this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun loadActor() {
        lstActor.add((Actor(1, "Dip Sapkota",
            "https://ultimateclassicrock.com/dimebag-darrell-legacy/", "Kathmandu", 1000000F
            )))

        lstActor.add((Actor(1, "Rajesh hamal",
            "", "Kathmandu", 2000000F
        )))

        lstActor.add((Actor(1, "Dilip Raymajhi",
            "", "Kathmandu", 3000000F
        )))

        lstActor.add((Actor(1, "Sadichha Shrestha",
            "", "Kathmandu", 1000000F
        )))
    }
}