package com.alwandroid.lte_arena

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alwandroid.lte_arena.adapter.ListSmartphoneAdapter
import com.alwandroid.lte_arena.model.Smartphone
import com.alwandroid.lte_arena.model.SmartphoneData
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.net.URI
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rvSmartphone: RecyclerView
    private var list: ArrayList<Smartphone> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSmartphone = findViewById(R.id.rv_smartphone)
        rvSmartphone.setHasFixedSize(true)

        list.addAll(SmartphoneData.listSmartphone)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvSmartphone.layoutManager = LinearLayoutManager(this)
        val listSmartphoneAdapter = ListSmartphoneAdapter(list)
        rvSmartphone.adapter = listSmartphoneAdapter

        listSmartphoneAdapter.setOnItemClickCallback(object : ListSmartphoneAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Smartphone) {
                showDetailSmartphone(data)
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_button, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        actionProfile(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun actionProfile(action: Int){
        when(action){
            R.id.action_profile -> {
                val moveWithDataIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                val profile: Int = Integer.parseInt(R.drawable.profile.toString())
                moveWithDataIntent.putExtra(ProfileActivity.EXTRA_IMAGE, profile)
                moveWithDataIntent.putExtra(ProfileActivity.EXTRA_NAME, "Alwan Hibatullah")
                moveWithDataIntent.putExtra(ProfileActivity.EXTRA_EMAIL, "alwanhibatullah@gmail.com")
                startActivity(moveWithDataIntent)
            }
        }
    }

    private fun showDetailSmartphone(data: Smartphone){
//        val smartphone: ArrayList<Smartphone> = arrayListOf()
        val detailSmartphoneIntent = Intent(this@MainActivity, SmartphoneDetail::class.java)
        detailSmartphoneIntent.putExtra(SmartphoneDetail.EXTRA_DETAIL, data)
        startActivity(detailSmartphoneIntent)
    }
}
