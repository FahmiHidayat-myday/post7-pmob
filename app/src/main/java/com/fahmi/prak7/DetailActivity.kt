package com.fahmi.prak7

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgCover: ImageView = findViewById(R.id.imgDetailCover)
        val tvTitle: TextView = findViewById(R.id.tvDetailTitle)
        val tvDate: TextView = findViewById(R.id.tvDetailDate)
        val tvDesc: TextView = findViewById(R.id.tvDetailDesc)
        val tvPages: TextView = findViewById(R.id.tvDetailPages)

        val book = intent.getSerializableExtra("EXTRA_BOOK") as? Book

        if (book != null) {
            tvTitle.text = book.title
            tvDate.text = book.releaseDate
            tvDesc.text = book.description

            tvPages.text = "Total Pages: ${book.pages}"

            Glide.with(this)
                .load(book.cover)
                .into(imgCover)
        }
    }
}