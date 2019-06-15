package com.seigneur.gauvain.avdplane

import android.graphics.drawable.AnimatedVectorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAnimBtn.setOnClickListener {
            (mAVDTakeOff.drawable as AnimatedVectorDrawable).start()
        }
    }
}
