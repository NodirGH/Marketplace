package com.example.marketplace.onboarding

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.marketplace.R
import com.example.marketplace.core.BaseFragment
import com.example.marketplace.databinding.FragmentOnboardingBinding
import com.example.marketplace.onboarding.adapter.ViewPagerAdapter


class OnBoardingFragment :
    BaseFragment<FragmentOnboardingBinding>(FragmentOnboardingBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ViewPagerAdapter(
            parentFragmentManager,
            lifecycle
        )
        binding.vpOnBoarding.adapter = adapter
        binding.diOnBoarding.attachTo(binding.vpOnBoarding)

        binding.vpOnBoarding.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                if (position == adapter.itemCount - 1) {
                    binding.btnAction.text = getString(R.string.OnBoardingTimeStartOrdering)
                    val constraintSet = ConstraintSet()
                    constraintSet.clone(binding.root)

                    constraintSet.connect(
                        R.id.btnAction,
                        ConstraintSet.LEFT,
                        ConstraintSet.PARENT_ID,
                        ConstraintSet.LEFT,
                        0
                    )
                    constraintSet.applyTo(binding.root)
                    binding.diOnBoarding.visibility = View.GONE
                } else {
                    binding.btnAction.text = getString(R.string.Next)
                    val constraintSet = ConstraintSet()
                    constraintSet.clone(binding.root)

                    constraintSet.clear(
                        R.id.btnAction,
                        ConstraintSet.LEFT
                    )
                    constraintSet.applyTo(binding.root)

                    binding.diOnBoarding.visibility = View.VISIBLE

                }
            }
        })
        binding.btnAction.setOnClickListener {
            if (binding.vpOnBoarding.currentItem == adapter.itemCount - 1) {
                findNavController().navigate(R.id.testFragment)
            } else {
                binding.vpOnBoarding.currentItem = binding.vpOnBoarding.currentItem + 1
            }
        }

    }
}