package com.example.marketplace.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.marketplace.R
import kotlinx.android.synthetic.main.fragment_base_hall_screen2.view.*
import kotlinx.android.synthetic.main.fragment_basehall_screen1.view.*

class BaseHallScreen2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_base_hall_screen2, container, false)

        val viewPager2 = activity?.findViewById<ViewPager2>(R.id.viewPager2)
        view.btnTimeToStart.setOnClickListener {
            viewPager2?.currentItem = 2
        }

        return view
    }

}