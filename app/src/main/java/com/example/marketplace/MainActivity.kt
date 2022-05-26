package com.example.marketplace

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toolbar
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.marketplace.core.BaseActivity
import com.example.marketplace.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    private lateinit var currentFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, FoodMenuFragment()).commit()
        binding.bottomNavigation.setOnNavigationItemSelectedListener (navListener)

        val spAdapter = ArrayAdapter(this, R.layout.spinner_color, resources.getStringArray(R.array.orderPlacesSpinner))
        spAdapter.setDropDownViewResource(R.layout.dropdown_spinner_color)
        binding.spOrderPlace.adapter = spAdapter

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

    private val navListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when(it.itemId) {
            R.id.locationFragment -> {
                currentFragment = LocationFragment()
            }

            R.id.foodMenuFragment -> {
                currentFragment = FoodMenuFragment()
            }
            R.id.accountFragment -> {
                currentFragment = AccountFragment()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, currentFragment).commit()
        true
    }

}