package com.example.marketplace.onboarding

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.marketplace.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        lifecycleScope.launch {
            delay(1000)
            withContext(Dispatchers.Main) {
                if (isOnBoardingFinished()) {
                    findNavController().navigate(R.id.action_splashFragment2_to_menuFragment)
                } else {
                    findNavController().navigate(R.id.action_splashFragment2_to_viewPagerFragment)
                }
            }
        }
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun isOnBoardingFinished(): Boolean {
        val sharedPref = requireActivity().getSharedPreferences("OnBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)
    }

}