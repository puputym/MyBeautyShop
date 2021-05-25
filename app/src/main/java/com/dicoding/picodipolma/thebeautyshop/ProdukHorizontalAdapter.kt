package com.dicoding.picodipolma.thebeautyshop

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ProdukHorizontalAdapter(val listProduk: ArrayList<Produk>): RecyclerView.Adapter<ProdukHorizontalAdapter.ProdukViewHolder>() {

    private  val TAG = "RecycleViewAdapter"
    private lateinit var onItemClickCallback : OnItemHorizontalClickCallback

    interface OnItemHorizontalClickCallback {
        fun onItemClicked(produkImages: Produk)
    }
    fun setOnItemClickCallback(onItemClickCallback: OnItemHorizontalClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ProdukViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.image_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdukViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_horizontal, parent, false)
        return ProdukViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  listProduk.size
    }
    override fun onBindViewHolder(holder: ProdukViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder: called.")
        val produk = listProduk[position]
        Glide.with(holder.itemView.context)
            .load(produk.photo)
            .apply(RequestOptions().override(65,65))
            .into(holder.imgPhoto)
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listProduk[holder.adapterPosition])
        }
    }
}