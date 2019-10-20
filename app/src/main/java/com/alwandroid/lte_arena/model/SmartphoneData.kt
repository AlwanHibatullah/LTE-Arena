package com.alwandroid.lte_arena.model

import com.alwandroid.lte_arena.R

object SmartphoneData {
    /* ----------------------General Description-------------------------- */
    private val smartphoneName = arrayOf(
        "iPhone 11",
        "iPhone 11 Pro",
        "iPhone 11 Pro Max",
        "Pixel 4",
        "Pixel 4 XL",
        "Galaxy Note 10+",
        "Galaxy S10+",
        "Mate 30 Pro",
        "Xperia 5",
        "Mi MIX Alpha"
    )

    private val smartphoneManufacture = arrayOf(
        "Apple",
        "Apple",
        "Apple",
        "Google",
        "Google",
        "Samsung",
        "Samsung",
        "Huawei",
        "Sony",
        "Xiaomi"
    )

    private val smartphoneAnnouncedDate = arrayOf(
        "September 10, 2019",
        "September 10, 2019",
        "September 10, 2019",
        "October 15, 2019",
        "October 15, 2019",
        "August 7, 2019",
        "February 20, 2019",
        "September 19, 2019",
        "September 5, 2019",
        "September 24, 2019"
    )

    private val smartphoneMarketStatus = arrayOf(
        "Released",
        "Released",
        "Released",
        "Announced",
        "Announced",
        "Released",
        "Released",
        "Announced",
        "Released",
        "Announced"
    )

    private val smartphoneDetail = arrayOf(
        "The iPhone 11 serves as the de facto successor to the iPhone XR. It scores a 12MP ultra wide-angle camera at the rear which has a focal length of just 13mm and an aperture of F2.4. The iPhone 11 also gets a dedicated Night Mode for the camera, a new 12MP FaceTime selfie camera that shoots 4K60fps video, and improved Portrait mode. The A13 Bionic chipset is more powerful and efficient, adding an additional hour of battery life compared to the iPhone XR. The iPhone 11 is available in black, white, red, yellow, green, and purple. The starting price of the iPhone 11 is \$699 for the 64GB version, \$749 for the 128GB, and \$849 for the 256GB one.",
        "The successor of the iPhone XS comes with a compact 5.8” Super Retina XDR display, which is brighter and displays wider color gamut. There’s a triple camera setup - a ultra wide-angle F2.4 snapper joins the F1.8 regular and F2.0 telephoto cameras. Aside from great landscape shots, you will also be able to seamlessly switch between all three cameras while shooting videos. The new Deep Fusion camera feature brings HDR to another level by analyzing and combining 9 shots into one. The 7nm A13 Bionic chip provides a 20% increase in CPU and GPU performance, as well as improved battery life - up to 4 hours more. The iPhone 11 Pro is available in black, white, gold, and midnight green. Prices start at \$999 for the 64GB version, \$1149 for the 256GB, and \$1349 for the 512GB variant.",
        "The largest new iPhone has all the features of the iPhone 11 Pro, but comes with a much larger 6.5” display as well as a beefier battery that lasts up to 5 hours longer than the iPhone XS Max. There’s a triple camera setup - a ultra wide-angle F2.4 snapper joins the F1.8 regular and F2.0 telephoto cameras. Aside from great landscape shots, you will also be able to seamlessly switch between all three cameras while shooting videos. The new Deep Fusion camera feature brings HDR to another level by analyzing and combining 9 shots into one. The 7nm A13 Bionic chip provides a 20% increase in CPU and GPU performance, as well as improved battery life - up to 4 hours more. The iPhone 11 Pro is available in black, white, gold, and midnight green. Prices start at \$1099 for the 64GB version, \$1249 for the 256GB one, and \$1449 for the 512GB one.",
        "The Google Pixel 4 comes with a 90Hz 5.7\" OLED display, a dual camera, a Snapdragon 855 chipset, 6GB of RAM, 64GB of storage, a 2800mAh battery, a dual-camera (wide + telephoto), and availability across all major US carriers. It has no fingerprint sensor save for a radar-powered face unlock method. You can also control certain apps and functions of the devices with simple gestures in front of the radar sensor. Prices start at \$799 for the 64GB version and climb to \$899 for the 128GB version.",
        "The Google Pixel 4 XL comes with a 90Hz 6.3\" OLED display, a dual camera, a Snapdragon 855 chipset, 6GB of RAM, 64GB of storage, a 3700mAh battery, a dual-camera (wide + telephoto), and availability across all major US carriers. It has no fingerprint sensor save for a radar-powered face unlock method. You can also control certain apps and functions of the devices with simple gestures in front of the radar sensor. Prices start at \$899 for the 64GB version and climb to \$999 for the 128GB version.",
        "The Galaxy Note 10+ is Samsung’s flagship device for the second half of the year. It’s equipped with the Snapdragon 855 chip (Exynos 9825 in the international version), a whopping 12GB of RAM, as well as either 256 or 512GB of storage with microSD card support. The phone supports ultra-fast 45W wired charging and 20W wireless charging of its large 4,300mAh battery. It has a quad-camera - aside from a 12MP main, 12MP telephoto, and a 16MP wide-angle camera, the phone also has a ToF sensor for range imaging. The phone is available in Aura Black, Aura White, Aura Glow, and the exclusive Aura Blue. Prices start at \$1,099 for the 256GB version, and \$1,199 for the 512GB one.",
        "As the Galaxy S10, the Samsung Galaxy S10+ comes with a powerful Snapdragon 855 chip, a glass-and-metal construction, and a fingerprint reader built inside the display. It is bigger, however, meaning that you get a larger, 6.4-inch OLED screen and a larger, 4100mAh battery lasting longer between charges. The phone can be had with up to 1TB of built-in storage and 12GB of RAM. The camera system is identical, combining a main, 12MP camera with dual aperture, with a 2x zoom telephoto camera and a super wide-angle cam for epic shots. On the front, the curved display stretches from one edge to another, interrupted only by an oval cutout for the 10MP dual front-facing camera with autofocus and 4K video recording.",
        "Despite lacking Google’s apps and services out of the box, the Huawei Mate 30 Pro is one of the most impressive Android devices in terms of hardware. The 6.5-inch OLED display is curved at a rather steep 88-degree angle and has a FullHD+ resolution that helps get a better battery life out of the 4,500mAh battery that supports 40W wired and 27W wireless charging. The 7nm Kirin 990 chipset is running the show in tandem with 8GB of RAM and 256GB of storage. There’s 3D face unlock that’s similar to Apple’s FaceID, as well as an optical in-display fingerprint scanner. The Mate 30 Pro uses two 40MP camera sensors, as well as a 40MP main, 8MP telephoto, a 40MP ultra-wide, and a ToF camera. The phone can record slo-mo videos at 7,680fps. The Mate 30 Pro runs on Android 10 and EMUI 10. The phone starts at EUR 1,099.",
        "The Sony Xperia 5 is the smaller successor to the ultra-tall Xperia 1 that was announced at MWC’19. With a 6.1-inch FullHD+ OLED display, the phone once again features a high 21:9 display for an immersive, cinematic-like experience. A Snapdragon 855 chipset with 6GB of RAM and a 3,140mAh battery is powering the phone. There is a triple camera setup at the back, consisting of a wide-, ultra-wide, and telephoto cameras, but this time around it is positioned to the left side of the phone in comparison with the Xperia 1.",
        "The Xiaomi Mi Mix Alpha is an innovative smartphone with an enormous wraparound display around the front, sides and back that’s helping it achieve a record screen-to-body ratio of 180.6%. Whatever body part is not screen is covered by space-grade titanium alloy, while the rear part of the display is covered in sapphire and ceramic. The MIX Alpha also comes with the super-fast Qualcomm Snapdragon 855+ chipset, 12GB RAM+512GB storage, 4050mAh battery, as well as a very detailed 108MP main camera with an enormous 1/1.33-inch sensor. There’s also a 20MP ultra wide-angle snapper and a 12MP 2x telephoto shooter. The phone will sell for the very high price of \$2,800."
    )

    private val smartphoneImage = intArrayOf(
        R.drawable.apple_iphone_11,
        R.drawable.apple_iphone_11_pro,
        R.drawable.apple_iphone_11_pro_max,
        R.drawable.google_pixel_4,
        R.drawable.google_pixel_4_xl,
        R.drawable.samsung_galaxy_note10_plus,
        R.drawable.samsung_galaxy_s10_plus_new,
        R.drawable.huawei_mate30_pro,
        R.drawable.sony_xperia_5,
        R.drawable.xiaomi_mi_mix_alpha
    )

    /* -----------------------------Body-------------------------------- */
    private val smartphoneDimensions = arrayOf(
        "150.9 x 75.7 x 8.3 mm",
        "144 x 71.4 x 8.1 mm",
        "158 x 77.8 x 8.1 mm",
        "147.1 x 68.8 x 8.2 mm",
        "160.4 x 75.1 x 8.2 mm",
        "162.3 x 77.2 x 7.9 mm",
        "157.6 x 74.1 x 7.8 mm",
        "158.1 x 73.1 x 8.8 mm",
        "158 x 68 x 8.2 mm",
        "154.4 x 72.3 x 10.4 mm"
    )

    private val smartphoneWeight = intArrayOf(
        194,
        188,
        226,
        162,
        193,
        196,
        198,
        198,
        164,
        241
    )

    private val smartphoneSIM = arrayOf(
        "Single SIM",
        "Nano-SIM and/or Electronic SIM card",
        "Nano-SIM and/or Electronic SIM card",
        "Nano-SIM card & eSIM",
        "Nano-SIM card & eSIM",
        "Single SIM (Nano-SIM) or Hybrid Dual SIM (Nano-SIM, dual stand-by)",
        "Single SIM (Nano-SIM) or Hybrid Dual SIM (Nano-SIM, dual stand-by)",
        "Single SIM (Nano-SIM) or Hybrid Dual SIM (Nano-SIM, dual stand-by)",
        "Single SIM (Nano-SIM) or Hybrid Dual SIM (Nano-SIM, dual stand-by)",
        "Dual SIM (Nano-SIM, dual stand-by)"
    )

    private val smartphoneResistance = arrayOf(
        "IP68 dust/water resistant (up to 2m for 30 mins)",
        "IP68 dust/water resistant (up to 4m for 30 mins)",
        "IP68 dust/water resistant (up to 4m for 30 mins)",
        "IP68 dust/water resistant (up to 1.5m for 30 mins)",
        "IP68 dust/water resistant (up to 1.5m for 30 mins)",
        "IP68 dust/water resistant (up to 1.5m for 30 mins)",
        "IP68 dust/water resistant (up to 1.5m for 30 mins)",
        "IP68 dust/water resistant (up to 2m for 30 mins)",
        "IP65/IP68 dust/water resistant (up to 1.5m for 30 mins)",
        "-"
    )

    /* -----------------------------Display----------------------------- */
    private val smartphoneTypeDisplay = arrayOf(
        "Liquid Retina IPS LCD capacitive touchscreen, 16M colors",
        "Super Retina XDR OLED capacitive touchscreen, 16M colors",
        "Super Retina XDR OLED capacitive touchscreen, 16M colors",
        "P-OLED capacitive touchscreen, 16M colors",
        "P-OLED capacitive touchscreen, 16M colors",
        "Dynamic AMOLED capacitive touchscreen, 16M colors",
        "Dynamic AMOLED capacitive touchscreen, 16M colors",
        "OLED capacitive touchscreen, 16M colors",
        "OLED capacitive touchscreen, 16M colors",
        "Flexible Super AMOLED capacitive touchscreen, 16M colors"
    )

    private val smartphoneSizeDisplay = arrayOf(
        "6.1 inches",
        "5.8 inches",
        "6.5 inches",
        "5.7 inches",
        "6.3 inches",
        "6.8 inches",
        "6.4 inches",
        "6.53 inches",
        "6.1 inches",
        "7.92 inches"
    )

    private val smartphoneResolution = arrayOf(
        "828 x 1792 pixels",
        "1125 x 2436 pixels",
        "1242 x 2688 pixels",
        "1080 x 2280 pixels",
        "1440 x 3040 pixels",
        "1440 x 3040 pixels",
        "1440 x 3040 pixels",
        "1176 x 2400 pixels",
        "1080 x 2520 pixels",
        "2088 x 2250 pixels"
    )

    /* -----------------------------Platform--------------------------- */
    private val smartphoneOS = arrayOf(
        "iOS 13",
        "iOS 13",
        "iOS 13",
        "Android 10",
        "Android 10",
        "Android 9.0",
        "Android 9.0",
        "Android 10",
        "Android 9.0",
        "Android 10"
    )

    private val smartphoneChipset = arrayOf(
        "Apple A13 Bionic (7 nm+)",
        "Apple A13 Bionic (7 nm+)",
        "Apple A13 Bionic (7 nm+)",
        "Qualcomm SDM855 Snapdragon 855 (7 nm)",
        "Qualcomm SDM855 Snapdragon 855 (7 nm)",
        "Exynos 9825 (7 nm)",
        "Exynos 9820 (8 nm)",
        "HiSilicon Kirin 990 (7 nm+)",
        "Qualcomm SDM855 Snapdragon 855 (7 nm)",
        "Qualcomm SDM855 Snapdragon 855+ (7 nm)"
    )

    private val smartphoneCPU = arrayOf(
        "Hexa-core (2x2.65 GHz Lightning + 4x1.8 GHz Thunder)",
        "Hexa-core (2x2.65 GHz Lightning + 4x1.8 GHz Thunder)",
        "Hexa-core (2x2.65 GHz Lightning + 4x1.8 GHz Thunder)",
        "Octa-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)",
        "Octa-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)",
        "Octa-core (2x2.73 GHz Mongoose M4 & 2x2.4 GHz Cortex-A75 & 4x1.9 GHz Cortex-A55)",
        "Octa-core (2x2.73 GHz Mongoose M4 & 2x2.31 GHz Cortex-A75 & 4x1.95 GHz Cortex-A55)",
        "Octa-core (2x2.86 GHz Cortex-A76 & 2x2.09 GHz Cortex-A76 & 4x1.86 GHz Cortex-A55)",
        "Octa-core (1x2.84 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.78 GHz Kryo 485)",
        "Octa-core (1x2.96 GHz Kryo 485 & 3x2.42 GHz Kryo 485 & 4x1.8 GHz Kryo 485)"
    )

    private val smartphoneGPU = arrayOf(
        "Apple GPU (4-core graphics)",
        "Apple GPU (4-core graphics)",
        "Apple GPU (4-core graphics)",
        "Adreno 640",
        "Adreno 640",
        "Mali-G76 MP12",
        "Mali-G76 MP12",
        "Mali-G76 MP16",
        "Adreno 640",
        "Adreno 640"
    )

    private val smartphoneInternal = arrayOf(
        "64GB 4GB RAM, 128GB 4GB RAM, 256GB 4GB RAM",
        "64GB 4GB RAM, 256GB 4GB RAM, 512GB 4GB RAM",
        "64GB 4GB RAM, 256GB 4GB RAM, 512GB 4GB RAM",
        "64GB 6GB RAM, 128GB 6GB RAM",
        "64GB 6GB RAM, 128GB 6GB RAM",
        "256GB 12GB RAM, 512GB 12GB RAM",
        "128GB 8GB RAM, 512GB 8GB RAM, 1TB 12GB RAM",
        "128GB 8GB RAM, 256GB 8GB RAM",
        "128GB 6GB RAM",
        "512GB 12GB RAM"
    )

    private val smartphoneCardSlot = arrayOf(
        "No",
        "No",
        "No",
        "No",
        "No",
        "microSD, up to 1 TB (uses shared SIM slot) - dual SIM model only",
        "microSD, up to 1 TB (uses shared SIM slot) - dual SIM model only",
        "NM (Nano Memory), up to 256GB (uses shared SIM slot)",
        "microSD, up to 1 TB (uses shared SIM slot) - dual SIM model only",
        "No"
    )

    /* -----------------------------Feature--------------------------- */
    private val smartphoneWifi = arrayOf(
        "Wi-Fi 802.11 a/b/g/n/ac/ax, dual-band, hotspot",
        "Wi-Fi 802.11 a/b/g/n/ac/ax, dual-band, hotspot",
        "Wi-Fi 802.11 a/b/g/n/ac/ax, dual-band, hotspot",
        "Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot",
        "Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot",
        "Wi-Fi 802.11 a/b/g/n/ac/ax, dual-band, Wi-Fi Direct, hotspot",
        "Wi-Fi 802.11 a/b/g/n/ac/ax, dual-band, Wi-Fi Direct, hotspot",
        "Wi-Fi 802.11 a/b/g/n/ac, dual-band, DLNA, Wi-Fi Direct, hotspot",
        "Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot",
        "Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct, DLNA, hotspot"
    )

    private val smartphoneBluetooth = arrayOf(
        "5.0, A2DP, LE",
        "5.0, A2DP, LE",
        "5.0, A2DP, LE",
        "5.0, A2DP, LE, aptX HD",
        "5.0, A2DP, LE, aptX HD",
        "5.0, A2DP, LE, aptX",
        "5.0, A2DP, LE, aptX",
        "5.1, A2DP, aptX HD, LE",
        "5.0, A2DP, aptX HD, LE",
        "5.0, A2DP, LE, aptX HD"
    )

    private val smartphoneSensors = arrayOf(
        "Face ID, accelerometer, gyro, proximity, compass, barometer",
        "Face ID, accelerometer, gyro, proximity, compass, barometer",
        "Face ID, accelerometer, gyro, proximity, compass, barometer",
        "Face ID, accelerometer, gyro, proximity, compass, barometer",
        "Face ID, accelerometer, gyro, proximity, compass, barometer",
        "Fingerprint (under display, ultrasonic), accelerometer, gyro, proximity, compass, barometer\n Samsung DeX (desktop experience support)\n ANT+\n Bixby natural language commands and dictation1",
        "Fingerprint (under display, ultrasonic), accelerometer, gyro, proximity, compass, barometer\n Samsung DeX (desktop experience support)\n ANT+\n Bixby natural language commands and dictation1",
        "Face ID, fingerprint (under display, optical), accelerometer, gyro, proximity, barometer, compass",
        "Fingerprint (side-mounted), accelerometer, gyro, proximity, barometer, compass, color spectrum",
        "Fingerprint (under display, optical), accelerometer, gyro, proximity, compass, barometer"
    )

    private val smartphoneBattery = arrayOf(
        "Non-removable Li-Ion 3110 mAh",
        "Non-removable Li-Ion 3046 mAh",
        "Non-removable Li-Ion 3969 mAh",
        "Non-removable Li-Po 2800 mAh",
        "Non-removable Li-Po 3700 mAh",
        "Non-removable Li-Ion 4300 mAh",
        "Non-removable Li-Ion 4100 mAh",
        "Non-removable Li-Po 4500 mAh",
        "Non-removable Li-Ion 3140 mAh",
        "Non-removable Li-Po 4050 mAh"
    )

    /* -----------------------------Camera--------------------------- */
    private val smartphoneRearCamera = arrayOf(
        "12 MP, f/1.8, 26mm (wide), 1/2.55, 1.4Âµm, dual pixel PDAF, OIS + 12 MP, f/2.4, 13mm (ultrawide)",
        "12 MP, f/1.8, 26mm (wide), 1/2.55\", 1.4µm, dual pixel PDAF, OIS + 12 MP, f/2.0, 52mm (telephoto), 1/3.4\", 1.0µm, PDAF, OIS, 2x optical zoom + 12 MP, f/2.4, 13mm (ultrawide)",
        "12 MP, f/1.8, 26mm (wide), 1/2.55\", 1.4µm, dual pixel PDAF, OIS + 12 MP, f/2.0, 52mm (telephoto), 1/3.4\", 1.0µm, PDAF, OIS, 2x optical zoom + 12 MP, f/2.4, 13mm (ultrawide)",
        "12.2 MP, f/1.7, 28mm (wide), 1/2.55\", 1.4µm, dual pixel PDAF, OIS + 16 MP, f/2.4, 45mm (telephoto), 1.0µm, PDAF, OIS, 2x optical zoom",
        "12.2 MP, f/1.7, 28mm (wide), 1/2.55\", 1.4µm, dual pixel PDAF, OIS + 16 MP, f/2.4, 45mm (telephoto), 1.0µm, PDAF, OIS, 2x optical zoom",
        "12 MP, f/1.5-2.4, 27mm (wide), 1/2.55\", 1.4µm, Dual Pixel PDAF, OIS\n 12 MP, f/2.1, 52mm (telephoto), 1/3.6\", 1.0µm, PDAF, OIS, 2x optical zoom\n 16 MP, f/2.2, 12mm (ultrawide), 1.0µm, Super Steady video\n TOF 3D VGA camera",
        "12 MP, f/1.5-2.4, 26mm (wide), 1/2.55\", 1.4µm, Dual Pixel PDAF, OIS\n 12 MP, f/2.4, 52mm (telephoto), 1/3.6\", 1.0µm, AF, OIS, 2x optical zoom\n 16 MP, f/2.2, 12mm (ultrawide), 1.0µm, Super Steady video",
        "40 MP, f/1.6, 27mm (wide), 1/1.7\", PDAF, OIS\n 8 MP, f/2.4, 80mm (telephoto), 1/4\", PDAF, OIS, 3x optical zoom\n 40 MP, f/1.8, 18mm (ultrawide), 1/1.54\", PDAF\n 3D TOF camera",
        "12 MP, f/1.6, 26mm (wide), 1/2.6\", 1.4µm, predictive Dual Pixel PDAF, 5-axis OIS\n2 MP, f/2.4, 52mm (telephoto), 1/3.4\", 1.0µm, predictive PDAF, 2x optical zoom, 5-axis OIS\n12 MP, f/2.4, 16mm (ultrawide), 1/3.4\", 1.0µm",
        "108 MP, f/1.7, (wide), 1/1.33\", 0.8µm, PDAF, Laser AF\n12 MP, f/2.0, 54mm (telephoto), 1/2.55\", 1.4µm, Dual Pixel PDAF, Laser AF, 2x optical zoom\n20 MP, f/2.2, 13mm (ultrawide), 1/2.8\", 1.0µm, Laser AF"
    )

    private val smartphoneRearCameraVideo = arrayOf(
        "2160p@24/30/60fps, 1080p@30/60/120/240fps, HDR, stereo sound rec.",
        "2160p@24/30/60fps, 1080p@30/60/120/240fps, HDR, stereo sound rec.",
        "2160p@24/30/60fps, 1080p@30/60/120/240fps, HDR, stereo sound rec.",
        "2160p@30fps, 1080p@30/60/120fps, 1080p@30fps (gyro-EIS)",
        "2160p@30fps, 1080p@30/60/120fps, 1080p@30fps (gyro-EIS)",
        "2160p@30/60fps, 1080p@30/60/240fps, 720p@960fps, HDR10+, dual-video rec., stereo sound rec., gyro-EIS & OIS",
        "2160p@60fps (no OIS/EIS), 2160p@30fps, 1080p@30/60/240fps, 720p@960fps, HDR10+, dual-video rec., stereo sound rec., gyro-EIS & OIS",
        "2160p@30/60fps, 1080p@30/60/120fps, 1080p@960fps, 720p@7680fps, gyro-EIS",
        "2160p@24/30fps HDR, 1080p@60fps, 1080p@30fps (5-axis gyro-EIS)",
        "3240p@30fps, 2160p@30/60fps, 1080p@30/120/240fps, 1080p@960fps"
    )

    private val smartphoneFrontCamera = arrayOf(
        "12 MP, f/2.2, 23mm (wide) + SL 3D camera",
        "12 MP, f/2.2, 23mm (wide) + SL 3D camera",
        "12 MP, f/2.2, 23mm (wide) + SL 3D camera",
        "8 MP, f/2.0, 22mm (wide), 1.22µm, no AF + TOF 3D camera",
        "8 MP, f/2.0, 22mm (wide), 1.22µm, no AF + TOF 3D camera",
        "10 MP, f/2.2, 26mm (wide), 1.22µm, Dual Pixel PDAF",
        "10 MP, f/1.9, 26mm (wide), 1.22µm, Dual Pixel PDAF\n 8 MP, f/2.2, 22mm (wide), 1.12µm, depth sensor",
        "32 MP, f/2.0, (wide)\n 3D TOF camera",
        "8 MP, f/2.0, 24mm (wide), 1/4\", 1.12µm",
        "No - uses main camera"
    )

    private val smartphoneFrontCameraVideo = arrayOf(
        "2160p@24/30/60fps, 1080p@30/60/120fps, gyro-EIS",
        "2160p@24/30/60fps, 1080p@30/60/120fps, gyro-EIS",
        "2160p@24/30/60fps, 1080p@30/60/120fps, gyro-EIS",
        "1080p@30fps",
        "1080p@30fps",
        "2160p@30fps",
        "2160p@30fps, 1080p@30fps",
        "1080p@30fps",
        "1080p@30fps (5-axis gyro-EIS)",
        "3240p@30fps, 2160p@30/60fps, 1080p@30/120/240fps, 1080p@960fps"
    )

    /* -----------------------------Other--------------------------- */
    private val smartphonePrice = intArrayOf(
        660,
        999,
        1099,
        799,
        899,
        867,
        650,
        743,
        726,
        2800
    )

    val listSmartphone : ArrayList<Smartphone>
        get() {
            val list = arrayListOf<Smartphone>()
            for (position in smartphoneName.indices){
                val smartphone = Smartphone()
                // general
                smartphone.name = smartphoneName[position]
                smartphone.manufactur = smartphoneManufacture[position]
                smartphone.announced_date = smartphoneAnnouncedDate[position]
                smartphone.market_status = smartphoneMarketStatus[position]
                smartphone.detail = smartphoneDetail[position]
                smartphone.photo = smartphoneImage[position]
                //body
                smartphone.dimensions = smartphoneDimensions[position]
                smartphone.weight = smartphoneWeight[position]
                smartphone.sim = smartphoneSIM[position]
                smartphone.resistance = smartphoneResistance[position]
                //display
                smartphone.type = smartphoneTypeDisplay[position]
                smartphone.size = smartphoneSizeDisplay[position]
                smartphone.resolution = smartphoneResolution[position]
                //platform
                smartphone.os = smartphoneOS[position]
                smartphone.chipset = smartphoneChipset[position]
                smartphone.cpu = smartphoneCPU[position]
                smartphone.gpu = smartphoneGPU[position]
                smartphone.internal_memory = smartphoneInternal[position]
                smartphone.card_slot = smartphoneCardSlot[position]
                //feature
                smartphone.wifi = smartphoneWifi[position]
                smartphone.bluetooth = smartphoneBluetooth[position]
                smartphone.sensors = smartphoneSensors[position]
                smartphone.battery = smartphoneBattery[position]
                //camera
                smartphone.rear_camera = smartphoneRearCamera[position]
                smartphone.rear_camera_video = smartphoneRearCameraVideo[position]
                smartphone.front_camera = smartphoneFrontCamera[position]
                smartphone.front_camera_video = smartphoneFrontCameraVideo[position]
                //other
                smartphone.price = smartphonePrice[position]

                list.add(smartphone)
            }
            return list
        }
}