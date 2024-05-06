package za.ac.iie.st10444951ass2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to navigate to the second screen
        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)// GameActivity: name of the second activity
            // Pass the message "I am hungry" as an extra with the intent
            intent.putExtra("FEED_MESSAGE", "I am hungry")//This will be shown in the feedTextView
            startActivity(intent)
        }
    }
}



