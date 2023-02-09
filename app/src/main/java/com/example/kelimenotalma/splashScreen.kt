package com.example.kelimenotalma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            val intent = Intent(this@splashScreen,MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
        //splashin geçiş zamanını ayarlamak için 3 saniye sonra ana sayfaya geçer
    }
}