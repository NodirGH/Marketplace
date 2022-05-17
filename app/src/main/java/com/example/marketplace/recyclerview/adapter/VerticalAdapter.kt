package com.example.marketplace.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marketplace.R
import com.example.marketplace.recyclerview.model.HorizontalModel
import com.example.marketplace.recyclerview.model.VerticalModel

class VerticalAdapter(
    private val context: Context,
    private val verticalModel: List<VerticalModel>
) : RecyclerView.Adapter<VerticalAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById<TextView>(R.id.tvTitleRowItem)
        var horizontalRV: RecyclerView = itemView.findViewById(R.id.cat_item_recycler)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_items, parent, false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = verticalModel[position].title
        setRowItemRecycler(holder.horizontalRV, verticalModel[position].items)
    }

    override fun getItemCount(): Int {
        return verticalModel.size
    }

    private fun setRowItemRecycler(recyclerView: RecyclerView, category: List<HorizontalModel>) {
        val itemRecyclerAdapter = HorizontalAdapter(context, category)
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter
    }
}