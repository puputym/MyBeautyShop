package com.dicoding.picodipolma.thebeautyshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ProdukVerticalAdapter(val listProduk: ArrayList<Produk>) : RecyclerView.Adapter<ProdukVerticalAdapter.VerticalViewHolder>() {
    private lateinit var onItemVerticalClickCallback : OnItemVerticalClickCallback

    fun setOnItemClickCallback(onItemVerticalClickCallback: OnItemVerticalClickCallback) {
        this.onItemVerticalClickCallback = onItemVerticalClickCallback
    }

    interface OnItemVerticalClickCallback {
        fun onItemClicked(data: Produk)
    }

    inner class VerticalViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail :TextView = itemView.findViewById(R.id.tv_item_detail)
        var tvHarga: TextView = itemView.findViewById(R.id.tv_item_harga)
        var imgPhoto: ImageView= itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_vertical, parent, false)
        return VerticalViewHolder(view)
    }

    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        val produk = listProduk[position]
        Glide.with(holder.itemView.context)
            .load(produk.photo)
            .apply(RequestOptions().override(150, 150))
            .into(holder.imgPhoto)
        holder.tvName.text = produk.name
        holder.tvDetail.text = produk.detail
        holder.tvHarga.text = produk.harga
        holder.itemView.setOnClickListener { onItemVerticalClickCallback.onItemClicked(listProduk[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listProduk.size
    }
}