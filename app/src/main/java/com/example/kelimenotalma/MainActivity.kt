package com.example.kelimenotalma


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kelimenotalma.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var vB : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        vB = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(vB.root)


        var vt = SQLiteDataHelper(this@MainActivity)
        val kelimeler = KelimelerDao().tumKelimeler(vt)

        var indeks = 0
        val aList = ArrayList<String>()
        while(indeks < kelimeler.size){

            aList.add("${kelimeler.get(indeks).kelime} = ${kelimeler.get(indeks).karsilik} (${kelimeler.get(indeks).ornek_cumle})")
            indeks++

        }
        val layoutMeneger = LinearLayoutManager(this@MainActivity)
        recyclerView.layoutManager = layoutMeneger
        val adapter = RecyclerviewAdapter(aList)
        recyclerView.adapter = adapter










        vB.buttonEkle.setOnClickListener {
            val intent = Intent(this@MainActivity,kelimeEkleme::class.java)
            startActivity(intent)
        }


    }
}