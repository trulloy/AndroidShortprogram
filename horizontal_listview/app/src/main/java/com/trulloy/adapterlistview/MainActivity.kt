package com.trulloy.adapterlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.trulloy.adapterlistview.Adapters.CustomeAdapter
import com.trulloy.adapterlistview.Adapters.ItemViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val data = ArrayList<ItemViewModel>()
        for (i in 0 until 20) {
            data.add(ItemViewModel(R.drawable.ic_launcher_foreground, "het $i"))
        }

        val adapter = CustomeAdapter(data)
        recyclerView.adapter = adapter
    }
}
