package com.example.marketplace.onboarding.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marketplace.R
import com.example.marketplace.onboarding.BaseHallScreen1Fragment
import com.example.marketplace.onboarding.BaseHallScreen2Fragment
import com.example.marketplace.onboarding.BaseHallScreen3Fragment
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            BaseHallScreen1Fragment(),
            BaseHallScreen2Fragment(),
            BaseHallScreen3Fragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.viewPager2.adapter = adapter

        return view
    }

}