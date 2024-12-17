package com.tusharkant.cancerprediction

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main) // Set the XML layout
//
//        // Find the button by its ID
//        val registerImageView: ImageView = findViewById(R.id.REGISTER)
//
//        // Set an onClickListener to handle button clicks
//        registerImageView.setOnClickListener {
//            // Start RegisterActivity when the ImageView is clicked
//            val intent = Intent(this, RegisterActivity::class.java)
//            startActivity(intent)
//        }
//        // Find the button by its ID
//        val loginImageView: ImageView = findViewById(R.id.LOGIN)
//
//        // Set an onClickListener to handle button clicks
//        loginImageView.setOnClickListener {
//            // Start RegisterActivity when the ImageView is clicked
//            val intent = Intent(this, Login::class.java)
//            startActivity(intent)
//        }
//    }
//}

class MainActivity : AppCompatActivity() {
    private var currentScreenIndex = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        loadFragment(currentScreenIndex)
    }

    private fun loadFragment(screenIndex: Int) {
        val layoutId = getLayoutResourceId(screenIndex)
        val fragment = BaseScreenFragment.newInstance(layoutId)

        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }

    private fun getLayoutResourceId(screenIndex: Int): Int {
        return when (screenIndex) {
            1 -> R.layout.activity_home
            2 -> R.layout.two
            3 -> R.layout.three
            4 -> R.layout.four
            5 -> R.layout.five
            6 -> R.layout.six
            7 -> R.layout.seven
            8 -> R.layout.eight
            9 -> R.layout.nine
            10 -> R.layout.ten
            11 -> R.layout.eleven
            12 -> R.layout.twelve
            13 -> R.layout.thirteen
            14 -> R.layout.fourteen
            15 -> R.layout.fifteen
            16 -> R.layout.sixteen
            17 -> R.layout.seventeen
            18 -> R.layout.eighteen
            19 -> R.layout.nineteen
            20 -> R.layout.twenty
            21 -> R.layout.tone
            22 -> R.layout.ttwo
            23 -> R.layout.tthree
            24 -> R.layout.tfour
            25 -> R.layout.tfive
            26 -> R.layout.tsix
            27 -> R.layout.tseven
            28 -> R.layout.teight
            29 -> R.layout.tnine
            30 -> R.layout.tten
            31 -> R.layout.fone
            32 -> R.layout.ftwo
            33 -> R.layout.fthree
            34 -> R.layout.ffour
            35 -> R.layout.ffive
            36 -> R.layout.fsix
            37 -> R.layout.fseven
            38 -> R.layout.feight
            39 -> R.layout.fnine
            40 -> R.layout.ften
            41 -> R.layout.fione
            42 -> R.layout.fitwo
            43 -> R.layout.fithree
            44 -> R.layout.fifour
            45 -> R.layout.fifive
            46 -> R.layout.fisix
            47 -> R.layout.fiseven
            48 -> R.layout.fieight
            49 -> R.layout.finine
            50 -> R.layout.fiten
            51 -> R.layout.sone
            52 -> R.layout.stwo
            53 -> R.layout.sthree
            54 -> R.layout.sfour
            55 -> R.layout.sfive
            56 -> R.layout.ssix
            57 -> R.layout.sseven
            58 -> R.layout.seight
            59 -> R.layout.snine
            60 -> R.layout.sten
            61 -> R.layout.seone
            62 -> R.layout.setwo
            63 -> R.layout.sethree
            64 -> R.layout.sefour
            65 -> R.layout.sefive
            66 -> R.layout.sesix
            67 -> R.layout.seseven
            68 -> R.layout.seeight
            69 -> R.layout.senine
            70 -> R.layout.seten
            71 -> R.layout.eone
            72 -> R.layout.etwo
            73 -> R.layout.ethree
            74 -> R.layout.efour
            75 -> R.layout.efive
            76 -> R.layout.esix
            77 -> R.layout.eseven
            78 -> R.layout.eeight
            79 -> R.layout.enine
            80 -> R.layout.eten
            81 -> R.layout.none
            82 -> R.layout.ntwo
            83 -> R.layout.nthree
            84 -> R.layout.nfour
            85 -> R.layout.nfive
            86 -> R.layout.nsix
            87 -> R.layout.nseven
            88 -> R.layout.neight
            89 -> R.layout.nnine
            90 -> R.layout.nten
            else -> R.layout.one
        }
    }

    //can use a hashmap to define the next button logic like 1 to 2 2 to 5 kinda shit @Arman
    //implement required ordering nav
    fun goToNextScreen() {
        if (currentScreenIndex < TOTAL_SCREENS) {
            currentScreenIndex++
            loadFragment(currentScreenIndex)
        }
    }

    fun goToPreviousScreen() {
        if (currentScreenIndex > 1) {
            currentScreenIndex--
            loadFragment(currentScreenIndex)
        }
    }

    companion object {
        private const val TOTAL_SCREENS = 90
    }
}
