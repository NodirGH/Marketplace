package com.example.marketplace.onboarding

import android.os.Bundle
import android.view.View
import com.example.marketplace.R
import com.example.marketplace.core.BaseFragment
import com.example.marketplace.databinding.FragmentOnboardingDiversityBinding

class OnBoardingPageFragment :
    BaseFragment<FragmentOnboardingDiversityBinding>(FragmentOnboardingDiversityBinding::inflate) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            when (OnBoardingType.values()[it.getInt(KEY_TYPE)]) {
                OnBoardingType.Diversity -> {
                    binding.tvTitle.text = getString(R.string.OnBoardingDiversityTitle)
                    binding.tvInfo.text = getString(R.string.OnBoardingDiversityInfo)
                    binding.ivOnBoarding.setImageResource(R.drawable.onboarding_diversity)
                }
                OnBoardingType.BaseHall -> {
                    binding.tvTitle.text = getString(R.string.OnBoardingBasehallTitle)
                    binding.tvInfo.text = getString(R.string.OnBoardingBasehallInfo)
                    binding.ivOnBoarding.setImageResource(R.drawable.onboarding_basehall)
                }
                OnBoardingType.Convenience -> {
                    binding.tvTitle.text = getString(R.string.OnBoardingBasehallTitle)
                    binding.tvInfo.text = getString(R.string.OnBoardingBasehallInfo)
                    binding.ivOnBoarding.setImageResource(R.drawable.onboarding_diversity)
                }
            }
        }
    }

    companion object {
        val KEY_TYPE = "type"
        fun getInstance(type: OnBoardingType): OnBoardingPageFragment {
            val bundle = Bundle()
            bundle.putInt(KEY_TYPE, type.ordinal)
            val onBoardingPage = OnBoardingPageFragment()
            onBoardingPage.arguments = bundle
            return onBoardingPage
        }
    }

}