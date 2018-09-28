package com.example.fauziw97.archemy.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fauziw97.archemy.R
import com.example.fauziw97.archemy.model.Element
import kotlinx.android.synthetic.main.element_item.view.*


class ElementAdapter(val items: List<Element>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {


    override fun getItemCount(): Int {
        return items.size
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        return ViewHolder(layoutInflater.inflate(R.layout.element_item, parent, false))

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.initial.text = item.id
        holder.name.text = item.name
        holder.mass.text = item.mass
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val initial = view.initial
    val name = view.name
    val mass = view.mass
}