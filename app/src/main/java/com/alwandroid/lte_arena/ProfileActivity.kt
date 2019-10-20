package com.alwandroid.lte_arena

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.net.toUri
import de.hdodenhof.circleimageview.CircleImageView
import java.io.IOException

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

//        val extras: Bundle = intent.extras

        val imgProfilePicture: CircleImageView = findViewById(R.id.img_profile)
        val tvProfileName: TextView = findViewById(R.id.tv_item_name_profile)
        val tvProfileEmail: TextView = findViewById(R.id.tv_item_email_profile)

        val picture = intent.getStringExtra(EXTRA_IMAGE)
        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)

        imgProfilePicture.setImageResource(R.drawable.profile)
        tvProfileName.text = name
        tvProfileEmail.text = email

        val actionBar = supportActionBar
        actionBar!!.title = "Profile"

        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayShowHomeEnabled(true)
    }

    private fun getBitmapFromDrawable(fileName: String) : Bitmap?{
        return try {
            BitmapFactory.decodeStream(assets.open(fileName))
        } catch (e: IOException){
            e.printStackTrace()
            null
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
    }
}
