package com.denny.hexiaogang.kotlingank

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.denny.hexiaogang.kotlingank.android.AndroidFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, AndroidFragment()).commit()
    }
}
