package com.example.fauziw97.archemy

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fauziw97.archemy.adapter.ElementAdapter
import com.example.fauziw97.archemy.model.Element

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Element> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val elementList = findViewById<RecyclerView>(R.id.recyclerView)
        initData()
        elementList.layoutManager = LinearLayoutManager(this)
        elementList.adapter = ElementAdapter(items, this)

    }

    private fun initData() {
        val initial = resources.getStringArray(R.array.element_initial)
        val name = resources.getStringArray(R.array.element_name)
        val mass = resources.getStringArray(R.array.element_mass)

        items.clear()
        for (i in initial.indices) {
            items.add(Element(initial[i], name[i], mass[i]))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.bottomappbar_menu, menu)
        return true
    }
}
