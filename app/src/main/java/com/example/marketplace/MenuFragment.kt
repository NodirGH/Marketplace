package com.example.marketplace

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.marketplace.core.BaseFragment
import com.example.marketplace.databinding.FragmentMenuFragmentBinding

class MenuFragment : BaseFragment<FragmentMenuFragmentBinding>(FragmentMenuFragmentBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bottomNavigation.setupWithNavController(findNavController())

        val adapter = ArrayAdapter(requireContext(), R.layout.spinner_color, resources.getStringArray(R.array.orderPlacesSpinner))
        adapter.setDropDownViewResource(R.layout.dropdown_spinner_color)
        binding.spOrderPlace.adapter = adapter

        binding.spOrderPlace.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }

}