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
    private val categoryItem: List<HorizontalModel>
) : RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>() {

    class HorizontalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var horizontalFoodPicture: ImageView = itemView.findViewById(R.id.ivHorizontalFoodPicture)
        var horizontalFoodName: TextView = itemView.findViewById(R.id.tvHorizontalFoodName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        return HorizontalViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_items_horizontal_rv, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.apply {
            holder.horizontalFoodPicture.setImageResource(categoryItem[position].horizontalPicture)
            holder.horizontalFoodName.text = categoryItem[position].foodName
        }

    }

    override fun getItemCount(): Int {
        return categoryItem.size
    }
}