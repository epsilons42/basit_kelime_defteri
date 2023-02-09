package com.example.kelimenotalma

import android.annotation.SuppressLint
import android.content.ContentValues

class KelimelerDao {
    fun ekle(vt:SQLiteDataHelper,kelime : String ,karsilik : String, ornek_cume : String){

        var db = vt.writableDatabase
        val values = ContentValues()
        values.put("kelime",kelime)
        values.put("karsilik",karsilik)
        values.put("ornek_cumle",ornek_cume)
        db.insertOrThrow("kelimeler",null,values)
        db.close()


    }
    @SuppressLint("Range")
    fun tumKelimeler(vt : SQLiteDataHelper): ArrayList<KelimelerDataTablosu>{

        val kelimelerArrayList = ArrayList<KelimelerDataTablosu>()

        val db = vt.writableDatabase

        var cursor =db.rawQuery(" SELECT * FROM kelimeler",null)

        while(cursor.moveToNext()){
            val kelime = KelimelerDataTablosu(cursor.getInt(cursor.getColumnIndex("sira"))
                ,cursor.getString(cursor.getColumnIndex("kelime"))
                ,cursor.getString(cursor.getColumnIndex("karsilik"))
                ,cursor.getString(cursor.getColumnIndex("ornek_cumle")))
            kelimelerArrayList.add(kelime)

        }
        return kelimelerArrayList
    }
}