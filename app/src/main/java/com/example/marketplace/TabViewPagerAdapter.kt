package com.example.marketplace

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.marketplace.databinding.FragmentViewPagerBinding
import kotlinx.android.synthetic.main.items_view_pager.view.*

class TabViewPagerAdapter{

}


//    (
//    private val images: List<Int>
//) : RecyclerView.Adapter<TabViewPagerAdapter.TabViewPagerViewHolder>() {
//    inner class TabViewPagerViewHolder(view: View) : RecyclerView.ViewHolder(view)
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabViewPagerViewHolder {
//        val view =
//            LayoutInflater.from(parent.context).inflate(R.layout.items_view_pager, parent, false)
//        return TabViewPagerViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: TabViewPagerViewHolder, position: Int) {
//        val curImage = images[position]
//        holder.itemView.ivImage.setImageResource(curImage)
//    }
//
//    override fun getItemCount(): Int {
//        return images.size
//    }
//}