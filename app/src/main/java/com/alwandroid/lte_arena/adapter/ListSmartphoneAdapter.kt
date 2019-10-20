package com.alwandroid.lte_arena.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.AdapterListUpdateCallback
import androidx.recyclerview.widget.RecyclerView
import com.alwandroid.lte_arena.R
import com.alwandroid.lte_arena.model.Smartphone
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_row_smartphone.view.*

class ListSmartphoneAdapter(private val listSmartphone: ArrayList<Smartphone>) : RecyclerView.Adapter<ListSmartphoneAdapter.ListViewHolder>(){

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Smartphone)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_smartphone, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSmartphone.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val smartphone = listSmartphone[position]

        Glide.with(holder.itemView.context)
            .load(smartphone.photo)
            .apply(RequestOptions().override(90,120))
            .into(holder.imgPhoto)

        holder.tvName.text = "${smartphone.manufactur} ${smartphone.name}"
        holder.tvDetail.text = smartphone.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listSmartphone[holder.adapterPosition]) }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_phone_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_phone_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_smartphone)
    }

}