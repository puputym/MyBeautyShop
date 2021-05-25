package com.dicoding.picodipolma.thebeautyshop

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.io.PrintStream

class MainDetailProduk : AppCompatActivity(), View.OnClickListener {

    private lateinit var title: TextView
    private lateinit var harga : TextView
//    private lateinit var rating : TextView
    private lateinit var detail: TextView
    private lateinit var image: ImageView

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_HARGA ="extra_harga"
        const val EXTRA_RATING ="extra_rating"
        const val EXTRA_DETAILS = "extra_details"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_detail_produk)

        val nameProduk = intent.getStringExtra(EXTRA_NAME)
        val hargaProduk = intent.getStringExtra(EXTRA_HARGA)
        val nameRating = intent.getStringExtra(EXTRA_RATING)
        val detailProduk = intent.getStringExtra(EXTRA_DETAILS)
        val photoProduk = intent.getIntExtra(EXTRA_PHOTO, 0)

        title = findViewById(R.id.title_detail)
        harga = findViewById(R.id.harga_detail)
//        rating = findViewById(R.id.rating_detail)
        detail = findViewById(R.id.desc_detail)
        image = findViewById(R.id.img_detail)

        title.setText(nameProduk)
        harga.setText(hargaProduk)
//        rating.setText(nameRating)
        detail.setText(detailProduk)

        loadImagefromUrl(photoProduk)
        val clickBack : ImageView = findViewById(R.id.back)
        clickBack.setOnClickListener(this)

    }

    private fun loadImagefromUrl(photoProduk: Int) {
        Glide.with(this)
                .load(photoProduk)
                .apply(RequestOptions().override(200, 200))
                .into(image)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.back->{
                val moveIntent = Intent(this@MainDetailProduk, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

}


