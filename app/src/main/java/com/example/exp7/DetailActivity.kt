package com.example.exp7

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_ITEM = "extra_discovery_item"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.detailRoot)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, 0, systemBars.right, systemBars.bottom)
            insets
        }

        val item = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra(EXTRA_ITEM, DiscoveryItem::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getSerializableExtra(EXTRA_ITEM) as? DiscoveryItem
        }

        val imageViewDetail = findViewById<ImageView>(R.id.imageViewDetail)
        val buttonBack = findViewById<ImageButton>(R.id.buttonBack)
        val textViewDetailCategory = findViewById<TextView>(R.id.textViewDetailCategory)
        val textViewDetailRating = findViewById<TextView>(R.id.textViewDetailRating)
        val textViewDetailTitle = findViewById<TextView>(R.id.textViewDetailTitle)
        val textViewDetailLocation = findViewById<TextView>(R.id.textViewDetailLocation)
        val textViewDetailSeason = findViewById<TextView>(R.id.textViewDetailSeason)
        val textViewDetailOverview = findViewById<TextView>(R.id.textViewDetailOverview)

        buttonBack.setOnClickListener {
            finish()
        }

        item?.let {
            imageViewDetail.setImageResource(it.imageResId)
            textViewDetailCategory.text = it.category
            textViewDetailRating.text = it.rating
            textViewDetailTitle.text = it.title
            textViewDetailLocation.text = it.location
            textViewDetailSeason.text = it.bestSeason
            textViewDetailOverview.text = it.detailedOverview
        }
    }
}