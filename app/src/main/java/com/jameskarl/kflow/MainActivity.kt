package com.jameskarl.kflow

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jameskarl.flow.Utils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        content.text = Utils.dog()
    }
}
