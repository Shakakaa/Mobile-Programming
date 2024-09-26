package com.example.asgn1_ex4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.asgn1_ex4.ui.theme.Asgn1Ex4Theme
import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Create some sample posts (with image and caption)
        val samplePosts = listOf(
            Post(R.drawable.sample_post, "Had a great day at the beach!"),
            Post(R.drawable.sample_post, "Loving this new camera"),
            Post(R.drawable.sample_post, "Nature is beautiful 🌲"),
            Post(R.drawable.sample_post, "Amazing sunset!"),
            Post(R.drawable.sample_post, "Check out this cool project I’m working on!")
        )

        // Set up the RecyclerView with the adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PostAdapter(samplePosts)
    }
}
