package com.example.marketplace

import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class TestFragment : Fragment() {

    private lateinit var currentFragment: Fragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view = inflater.inflate(R.layout.fragment_test, container, false)

        parentFragmentManager.beginTransaction().replace(R.id.nav_container, FoodMenuFragment())
            .commit()

        (activity as AppCompatActivity).supportActionBar
        val bottomNav: BottomNavigationView = view.findViewById(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener(navListener)

        val spOrderPlaces = view.findViewById<Spinner>(R.id.orderPlace)
        val namesOfOrderPlaces =
            listOf(
                "1Pat Tat St, San Po Kong",
                "Maskva kalxoz",
                "Navoiy kalxoz",
                "Saraylik",
                "Xayraobod",
                "Olmazor"
            )
        val adapter = ArrayAdapter(requireContext(), R.layout.spinner_color, namesOfOrderPlaces)
        adapter.setDropDownViewResource(R.layout.dropdown_spinner_color)
        spOrderPlaces.adapter = adapter

        spOrderPlaces.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
        return view
    }

    private val navListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.miLocation -> {
                currentFragment = LocationFragment()
            }
            R.id.miOrderMenu -> {
                currentFragment = FoodMenuFragment()
            }
            R.id.miAccount -> {
                currentFragment = AccountFragment()
            }
        }
        parentFragmentManager.beginTransaction().replace(R.id.nav_container, currentFragment)
            .commit()
        true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.miQRScanner -> Toast.makeText(
                activity,
                "QR scanner is clicked",
                Toast.LENGTH_SHORT
            ).show()
            R.id.miSearch -> Toast.makeText(
                activity,
                "Search is clicked",
                Toast.LENGTH_SHORT
            ).show()
        }
        return true
    }
}