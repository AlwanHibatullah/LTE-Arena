package com.alwandroid.lte_arena.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Smartphone(
    // table smartphone
    var name: String? =  "",
    var manufactur: String? = "",
    var announced_date: String? = "",
    var market_status: String? = "",
    var detail: String? = "",
    var photo: Int = 0,

    //tabel body
//    var id_body: Int = 0,
    var dimensions: String? = "",
    var weight: Int = 0,
    var sim: String? = "",
    var resistance: String? = "",

    //tabel display
//    var id_display: Int = 0,
    var type: String? = "",
    var size: String? = "",
    var resolution: String? = "",

    //tabel platform
//    var id_platform: Int = 0,
    var os: String? = "",
    var chipset: String? = "",
    var cpu: String? = "",
    var gpu: String? = "",
    var internal_memory: String? = "",
    var card_slot: String? = "",

    //tabel feature
//    var id_feature: Int = 0,
    var wifi: String? = "",
    var bluetooth: String? = "",
    var sensors: String? = "",
    var battery: String? = "",

    //tabel camera
//    var id_camera: Int = 0,
    var rear_camera: String? = "",
    var rear_camera_video: String? = "",
    var front_camera: String? = "",
    var front_camera_video: String? = "",

    //Other
    var price: Int = 0
) : Parcelable