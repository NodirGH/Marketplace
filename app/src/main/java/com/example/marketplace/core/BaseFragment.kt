package com.example.marketplace.core

import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.annotation.ColorRes
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.marketplace.R
import com.example.marketplace.utils.Inflate


abstract class BaseFragment<VB : ViewBinding>(val inflater: Inflate<VB>) : Fragment() {

    private var _binding: VB? = null
    val binding get() = _binding!!
    val bindingSafe get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflater(inflater, container, false)
        updateStatusBarColor(R.color.colorPrimary)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun updateStatusBarColor(
        @ColorRes colorId: Int,
        isStatusBarFontDark: Boolean = true,
        isTranslucent: Boolean = false
    ) {
        val window = requireActivity().window
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = ContextCompat.getColor(requireContext(), colorId)
            setSystemBarTheme(isStatusBarFontDark)
        } else {
            window.statusBarColor = ContextCompat.getColor(requireContext(), colorId)
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private fun setSystemBarTheme(isStatusBarFontDark: Boolean) {
        // Fetch the current flags.
        val lFlags = requireActivity().window.decorView.systemUiVisibility
        // Update the SystemUiVisibility depending on whether we want a Light or Dark theme.
        requireActivity().window.decorView.systemUiVisibility =
            if (isStatusBarFontDark) lFlags and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv() else lFlags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }

}