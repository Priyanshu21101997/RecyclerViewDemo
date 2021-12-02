package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(var movieList:ArrayList<Movie>):RecyclerView.Adapter<RecyclerAdapter.viewHolder>() {

    // It will have reference of the row layout
    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameView: TextView? = itemView.findViewById<TextView>(R.id.nameView)
        val ratingView: TextView? = itemView.findViewById<TextView>(R.id.ratingView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        // With the help of holder's old reference created we have to set data

        holder.nameView?.text = movieList[position].name
        holder.ratingView?.text = movieList[position].rating.toString()


    }

    override fun getItemCount(): Int {
        return movieList.size
    }


}