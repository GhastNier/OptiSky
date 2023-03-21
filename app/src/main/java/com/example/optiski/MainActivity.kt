package com.example.optiski

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        val buttonSignIn = findViewById<ImageButton>(R.id.signInButton)
        val buttonSignInGoogle = findViewById<ImageButton>(R.id.signInGoogleButton)
        val buttonSignUp = findViewById<ImageButton>(R.id.signUpButton)

        buttonSignIn.setOnClickListener {
            val intent = Intent(this, ConnexionActivity::class.java)
            startActivity(intent)
        }

        buttonSignInGoogle.setOnClickListener {
            val intent = Intent(this, ChoicesActivity::class.java)
            startActivity(intent)
        }

        buttonSignUp.setOnClickListener {
            val intent = Intent(this, InscriptionActivity::class.java)
            startActivity(intent)
        }

    }
}
