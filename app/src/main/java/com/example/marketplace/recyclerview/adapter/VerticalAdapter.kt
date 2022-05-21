package com.example.marketplace.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marketplace.R
import com.example.marketplace.recyclerview.model.HorizontalModel
import com.example.marketplace.recyclerview.model.VerticalModel

class VerticalAdapter(
    private val context: Context,
    private val verticalModel: List<VerticalModel>
) : RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {

    class VerticalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       var categoryTitle : TextView = itemView.findViewById(R.id.tvTitleRowItem)
        var itemRecycler: RecyclerView = itemView.findViewById(R.id.row_item_recycler)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val inflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_items, parent, false)
        return VerticalViewHolder(inflater)
    }

    override fun onBindViewHolder(holderVertical: VerticalViewHolder, position: Int) {
            holderVertical.categoryTitle.text = verticalModel[position].categoryTitle
            setRowItemRecycler(holderVertical.itemRecycler, verticalModel[position].categoryItem)
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