package com.example.marketplace.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.marketplace.R

//class MainAdapter(
//    var context: Context,
//    var listOfRecyclerView: List<RecyclerView>
//) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
//
//    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var horizontalRecyclerView: RecyclerView = itemView.findViewById(R.id.mainRecyclerHorizontal)
//        var verticalRecyclerView: RecyclerView = itemView.findViewById(R.id.mainRecyclerVertical)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
//        return MainViewHolder(
//            LayoutInflater.from(parent.context).inflate(R.layout.fragment_food_menu, parent, false)
//        )
//    }
//
//    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
//
//    }
//
//    override fun getItemCount(): Int {
//        return listOfRecyclerView.size
//    }
//}