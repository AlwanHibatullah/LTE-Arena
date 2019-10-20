package com.alwandroid.lte_arena

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.alwandroid.lte_arena.model.Smartphone
import com.bumptech.glide.Glide

class SmartphoneDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val smartphone: Smartphone = intent.getParcelableExtra(EXTRA_DETAIL)

        // Value for General Specs
        val imgSmartphone: ImageView = findViewById(R.id.img_detail_smartphone)
        val nameSmartphone: TextView = findViewById(R.id.tv_detail_smartphone_name)
        val manufacture: TextView = findViewById(R.id.tv_detail_manufacture)
        val announcedDate: TextView = findViewById(R.id.tv_detail_announced_date)
        val marketStatus: TextView = findViewById(R.id.tv_detail_market_status)
        val price: TextView = findViewById(R.id.tv_detail_price)

        // Value for Description
        val descSmartphone: TextView = findViewById(R.id.tv_description)

        // Value for Body Spesification
        val dimSmartphone: TextView = findViewById(R.id.tv_detail_dimensions)
        val weightSmartphone: TextView = findViewById(R.id.tv_detail_weight)
        val simSmartphone: TextView = findViewById(R.id.tv_detail_SIM)
        val resistance: TextView = findViewById(R.id.tv_detail_resistance)

        // Value for Display Specification
        val typeDisplay: TextView = findViewById(R.id.tv_detail_type_display)
        val sizeDisplay: TextView = findViewById(R.id.tv_detail_size_display)
        val resolution: TextView = findViewById(R.id.tv_detail_resolution)

        // Value for Platform Specification
        val osSmartphone: TextView = findViewById(R.id.tv_detail_os)
        val chipset: TextView = findViewById(R.id.tv_detail_chipset)
        val cpu: TextView = findViewById(R.id.tv_detail_cpu)
        val gpu: TextView = findViewById(R.id.tv_detail_gpu)
        val internalMemory: TextView = findViewById(R.id.tv_detail_internal)
        val cardSlot: TextView = findViewById(R.id.tv_detail_card_slot)

        // Value for Features Specification
        val wifi: TextView = findViewById(R.id.tv_detail_wifi)
        val bluetooth: TextView = findViewById(R.id.tv_detail_bluetooth)
        val sensors: TextView = findViewById(R.id.tv_detail_sensors)
        val battery: TextView = findViewById(R.id.tv_detail_battery)

        // Value for Camera Specification
        val rearCamera: TextView = findViewById(R.id.tv_detail_rear_camera)
        val rearVideo: TextView = findViewById(R.id.tv_detail_rear_camera_video)
        val frontCamera: TextView = findViewById(R.id.tv_detail_front_camera)
        val frontVideo: TextView = findViewById(R.id.tv_detail_front_camera_video)

        // General Specs
        Glide.with(this).load(smartphone.photo).override(150,200).into(imgSmartphone)
        nameSmartphone.text = smartphone.name
        manufacture.text = "by ${smartphone.manufactur}"
        announcedDate.text = smartphone.announced_date
        marketStatus.text = smartphone.market_status

        when(marketStatus.text){
            "Released" -> marketStatus.setTextColor(Color.rgb(0,100,0))
            "Announced" -> marketStatus.setTextColor(Color.DKGRAY)
            else -> marketStatus.setTextColor(Color.rgb(139,0,0))

        }

        price.text = "$ ${smartphone.price.toString()}"

        // Description Section
        descSmartphone.text = smartphone.detail

        // Detail Specification
        // Detail Body
        dimSmartphone.text = smartphone.dimensions
        weightSmartphone.text = smartphone.weight.toString()
        simSmartphone.text = smartphone.sim
        resistance.text = smartphone.resistance

        // Detail Display
        typeDisplay.text = smartphone.type
        sizeDisplay.text = smartphone.size
        resolution.text = smartphone.resolution

        // Detail Platform
        osSmartphone.text = smartphone.os
        chipset.text = smartphone.chipset
        cpu.text = smartphone.cpu
        gpu.text = smartphone.gpu
        internalMemory.text = smartphone.internal_memory
        cardSlot.text = smartphone.card_slot

        // Detail Features
        wifi.text = smartphone.wifi
        bluetooth.text = smartphone.bluetooth
        sensors.text = smartphone.sensors
        battery.text = smartphone.battery

        // Detail Camera
        rearCamera.text = smartphone.rear_camera
        rearVideo.text = smartphone.rear_camera_video
        frontCamera.text = smartphone.front_camera
        frontVideo.text = smartphone.front_camera_video

        if (supportActionBar != null){
            (supportActionBar as ActionBar).title = "${smartphone.manufactur} ${smartphone.name}"
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }
}
