package com.example.kelimenotalma

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerviewAdapter(val list : ArrayList<String>) : RecyclerView.Adapter<RecyclerviewAdapter.KelimeVH>() {
    class KelimeVH(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KelimeVH {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row
            ,parent,false)
        return KelimeVH(itemView)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: KelimeVH, position: Int) {
            holder.itemView.recylerViewTextView.text=list.get(position)





    }
}