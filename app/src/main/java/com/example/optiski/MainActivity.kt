package com.example.optiski

import android.app.Activity
import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat.startActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {

    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null

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
