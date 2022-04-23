package com.example.marketplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var currentFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.nav_container, FoodMenuFragment())
            .commit()
        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener (navListener)

        val spOrderPlaces = findViewById<Spinner>(R.id.orderPlace)
        spOrderPlaces.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

    }
    private val navListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when(it.itemId){
            R.id.miLocation -> {
                currentFragment = LocationFragment()
            }
            R.id.miFoodMenu -> {
                currentFragment = FoodMenuFragment()
            }
            R.id.miAccount  -> {
                currentFragment = AccountFragment()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.nav_container, currentFragment).commit()
        true
    }
}