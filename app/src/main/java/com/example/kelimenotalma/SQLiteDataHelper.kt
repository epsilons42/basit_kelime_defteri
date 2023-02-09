package com.example.kelimenotalma

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

open class SQLiteDataHelper(context: Context) : SQLiteOpenHelper(context,"Kelime",null,1) {
    override fun onCreate(db: SQLiteDatabase) { db.execSQL(" CREATE TABLE kelimeler(sira INTEGER PRİMARY KEY AUTOINCREMENT" +
                ",kelime TEXT,karsilik TEXT,ornek_cumle TEXT);")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
         db!!.execSQL("DROP TABLE İF EXİSTS kelimeler")
        onCreate(db)
    }
}