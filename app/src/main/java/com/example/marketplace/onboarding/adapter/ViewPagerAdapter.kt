package com.example.marketplace.onboarding.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.marketplace.onboarding.OnBoardingPageFragment
import com.example.marketplace.onboarding.OnBoardingType

class ViewPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        val type = OnBoardingType.getTypeByPosition(position)
        return OnBoardingPageFragment.getInstance(type)
    }

}