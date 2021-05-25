package com.dicoding.picodipolma.thebeautyshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class DetailProfile : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)
        val clickBack : ImageView = findViewById(R.id.back)
        clickBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.back->{
                val moveIntent = Intent(this@DetailProfile, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}