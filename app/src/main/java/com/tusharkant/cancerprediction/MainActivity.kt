package com.tusharkant.cancerprediction

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.tusharkant.cancerprediction.ui.theme.CancerPredictionTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set the XML layout

        // Find the button by its ID
        val registerImageView: ImageView = findViewById(R.id.REGISTER)

        // Set an onClickListener to handle button clicks
        registerImageView.setOnClickListener {
            // Start RegisterActivity when the ImageView is clicked
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        // Find the button by its ID
        val loginImageView: ImageView = findViewById(R.id.LOGIN)

        // Set an onClickListener to handle button clicks
        loginImageView.setOnClickListener {
            // Start RegisterActivity when the ImageView is clicked
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}

