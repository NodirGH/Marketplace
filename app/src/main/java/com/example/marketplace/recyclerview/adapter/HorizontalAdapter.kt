package com.example.marketplace.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marketplace.R
import com.example.marketplace.recyclerview.model.HorizontalModel

class HorizontalAdapter(
    private val context: Context,
    private val category: List<HorizontalModel>
) : RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>() {

    class HorizontalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.ivFoodPicture)
        var nameOfFood: TextView = itemView.findViewById(R.id.tvFoodName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_items_horizontal_rv, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.apply {
            itemImage.setImageResource(category[position].images)
            nameOfFood.text = category[position].foodName
        }

    }

    override fun getItemCount(): Int {
        return category.size
    }
}