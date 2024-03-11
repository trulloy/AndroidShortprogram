package com.trulloy.applicationllistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)

        // Sample data
        val itemList = listOf(
            NameIteam(1, "Het"),
            NameIteam(2, "Dipak"),
            NameIteam(3, "Kalpesh"),
            NameIteam(4, "Ashish"),
            NameIteam(5, "Nikul")
        )

        val adapter = ArrayAdapter<NameIteam>(
            this,
            R.layout.list_iteam,
            R.id.textViewItem,
            itemList
        )

        listView.adapter = adapter

        listView.setOnItemClickListener(AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedName = itemList[position].name
            showToast("Clicked on: $selectedName")
        })
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}