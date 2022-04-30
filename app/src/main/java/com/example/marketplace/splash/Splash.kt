package com.example.marketplace.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.marketplace.MainActivity
import com.example.marketplace.R
import kotlinx.android.synthetic.main.fragment_main_splash.*

class Splash: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_splash)

        ivMainSplashPicture.animate().setDuration(3000).alpha(1f).withEndAction{
            val end = Intent(this, MainActivity::class.java)
            startActivity(end)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}