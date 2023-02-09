package com.example.kelimenotalma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kelime_ekleme.*

class kelimeEkleme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime_ekleme)

        buttonOnay.setOnClickListener {
            var vt = SQLiteDataHelper(this)
            val kelimeText = editTextKelime.text.toString()
            val karsilikText = editTextKarsilik.text.toString()
            val ornekCumleText = editTextOrnekCumle.text.toString()
            if(kelimeText.length>0 && karsilikText.length >0 && ornekCumleText.length>0){
            val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
                KelimelerDao().ekle(vt,kelimeText,karsilikText,ornekCumleText)
            }else{
                Toast.makeText(applicationContext,"Tüm Bilgileri Dolduruz",Toast.LENGTH_SHORT).show()
            }
        }


    }
}