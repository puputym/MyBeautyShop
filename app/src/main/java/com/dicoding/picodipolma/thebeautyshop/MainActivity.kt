package com.dicoding.picodipolma.thebeautyshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvHorizontal: RecyclerView
    private lateinit var rvVertical: RecyclerView
    private var list: ArrayList<Produk> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHorizontal = findViewById(R.id.rv_beauty_horizontal)
        rvHorizontal.setHasFixedSize(true)

        rvVertical = findViewById(R.id.rv_beauty_vertical)
        rvVertical.setHasFixedSize(true)

        val clickProfile: ImageView = findViewById(R.id.img_profile)
        clickProfile.setOnClickListener(this)
        list.addAll(ProdukData.listData)
        showRecycleList()
    }

    private fun showRecycleList() {
        rvHorizontal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val horizontalAdapter = ProdukHorizontalAdapter(list)
        rvHorizontal.adapter = horizontalAdapter

        rvVertical.layoutManager = LinearLayoutManager(this)
        val verticalAdapter = ProdukVerticalAdapter(list)
        rvVertical.adapter = verticalAdapter

        verticalAdapter.setOnItemClickCallback(object : ProdukVerticalAdapter.OnItemVerticalClickCallback {
            override fun onItemClicked(data: Produk) {
                val intent = Intent(this@MainActivity, MainDetailProduk::class.java)
                intent.putExtra(MainDetailProduk.EXTRA_NAME, data.name)
                intent.putExtra(MainDetailProduk.EXTRA_HARGA, data.harga)
                intent.putExtra(MainDetailProduk.EXTRA_DETAILS, data.detail)
                intent.putExtra(MainDetailProduk.EXTRA_PHOTO, data.photo)
                startActivity(intent)
            }
        })

        horizontalAdapter.setOnItemClickCallback(object : ProdukHorizontalAdapter.OnItemHorizontalClickCallback {
            override fun onItemClicked(produkImages: Produk) {
                val intent = Intent(this@MainActivity, MainDetailProduk::class.java)
                intent.putExtra(MainDetailProduk.EXTRA_NAME, produkImages.name)
                intent.putExtra(MainDetailProduk.EXTRA_HARGA, produkImages.harga)
                intent.putExtra(MainDetailProduk.EXTRA_DETAILS, produkImages.detail)
                intent.putExtra(MainDetailProduk.EXTRA_PHOTO, produkImages.photo)
                startActivity(intent)
            }
        })
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.img_profile -> {
                val moveIntent = Intent(this@MainActivity, DetailProfile::class.java)
                startActivity(moveIntent)
            }
        }
    }
}