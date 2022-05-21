package com.example.marketplace.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marketplace.FoodMenuFragment
import com.example.marketplace.R
import com.example.marketplace.recyclerview.model.NewVerticalModel

class NewVerticalAdapter(
    var context: Context,
    private var categoryNew: List<NewVerticalModel>
) : RecyclerView.Adapter<NewVerticalAdapter.NewVerticalViewHolder>() {

    inner class NewVerticalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var newVerticalPicture: ImageView = itemView.findViewById(R.id.ivVerticalFoodPicture)
        var newVerticalFoodName: TextView = itemView.findViewById(R.id.tvVerticalFoodName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewVerticalViewHolder {
        return NewVerticalViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_item_vertical_r_v, parent, false))
    }

    override fun onBindViewHolder(holder: NewVerticalViewHolder, position: Int) {
        holder.apply {
            newVerticalPicture.setImageResource(categoryNew[position].verticalPictureNew)
            newVerticalFoodName.text = categoryNew[position].verticalFoodName
        }
    }

    override fun getItemCount(): Int {
        return categoryNew.size
    }
}