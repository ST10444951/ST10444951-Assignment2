package za.ac.iie.st10444951ass2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val petImageView = findViewById<ImageView>(R.id.petimageView)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)

        val feedTextView = findViewById<TextView>(R.id.feedTextView)
        val cleanTextView = findViewById<TextView>(R.id.cleanTextView)
        val playTextView = findViewById<TextView>(R.id.playTextView)

        // Retrieve the message passed from the first screen
        val feedMessage = intent.getStringExtra("FEED_MESSAGE")
        // Set the text of the feed TextView to the feed message
        feedTextView.text = feedMessage


        // Logic for the Feed button
        feedButton.setOnClickListener {
            // Change the pet's image to match feeding action icon
            petImageView.setImageResource(R.drawable.eating)//replace text in bold with   your picture name

            // Update the pet's status values (e.g., health, hunger, cleanliness)
            // Update the feed TextView
            feedTextView.text = getString(R.string.eating)

            // Update the play TextView
            playTextView.text = getString(R.string.play_with_me)


            // Logic for the Clean button
            cleanButton.setOnClickListener {
                // Change the pet's image to match cleaning action icon
                petImageView.setImageResource(R.drawable.bath)//your picture name here

                // Update the pet's status values (e.g., health, hunger, cleanliness)
                // Update the clean textview
                cleanTextView.text = getString(R.string.clean_nice_and_clean)


                // Logic for the Play button
                playButton.setOnClickListener {
                    // Change the pet's image to match playing action icon
                    petImageView.setImageResource(R.drawable.play)//your picture name here

                    // Update the pet's status values (e.g., health, hunger, cleanliness)
                    // Update the play TextView
                    playTextView.text = getString(R.string.play)

                    // Update the clean textview
                    cleanTextView.text = getString(R.string.clean)
                }
            }
        }
    }
}

