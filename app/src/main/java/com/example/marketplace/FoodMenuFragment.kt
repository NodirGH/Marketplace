package com.example.marketplace

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.marketplace.core.BaseFragment
import com.example.marketplace.databinding.FragmentFoodMenuBinding
import com.example.marketplace.recyclerview.adapter.HomeAdapter
import kotlinx.android.synthetic.main.fragment_food_menu.*

class FoodMenuFragment : BaseFragment<FragmentFoodMenuBinding>(FragmentFoodMenuBinding::inflate) {
    private lateinit var homeAdapter: HomeAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    private fun init() {
        homeAdapter = HomeAdapter(requireContext())
        val layoutManager =LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        rvItems.layoutManager = layoutManager
        rvItems.adapter = homeAdapter
    }
}