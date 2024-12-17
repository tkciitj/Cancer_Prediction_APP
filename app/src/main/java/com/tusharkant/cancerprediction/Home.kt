package com.tusharkant.cancerprediction

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class ActivityHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Reference to the CardViews
        val smallCellLungCancerCard = findViewById<CardView>(R.id.card_small_cell_lung_cancer)
        // Set click listeners for each card
        smallCellLungCancerCard.setOnClickListener {
            startActivityMain(1) // Load screen 1 for "Small Cell Lung Cancer"
        }

    }

    private fun startActivityMain(screenIndex: Int) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("SCREEN_INDEX", screenIndex) // Pass screen index to ActivityMain
        startActivity(intent)
    }
}
