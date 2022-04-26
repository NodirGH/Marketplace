package com.example.marketplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var currentFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.itemIconTintList = null
        setSupportActionBar(toolbar)

        supportFragmentManager.beginTransaction().replace(R.id.nav_container, FoodMenuFragment())
            .commit()
        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener(navListener)

        val spOrderPlaces = findViewById<Spinner>(R.id.orderPlace)
        val namesOfOrderPlaces =
            listOf<String>("1Pat Tat St, San Po Kong","Maskva kalxoz", "Navoiy kalxoz", "Saraylik", "Xayraobod", "Olmazor")
        val adapter = ArrayAdapter(this, R.layout.spinner_color, namesOfOrderPlaces)
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
        supportFragmentManager.beginTransaction().replace(R.id.nav_container, currentFragment)
            .commit()
        true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.miQRScanner -> Toast.makeText(this, "QR scanner is clicked", Toast.LENGTH_SHORT).show()
            R.id.miSearch -> Toast.makeText(this, "Search is clicked", Toast.LENGTH_SHORT).show()
        }
        return false
    }

}