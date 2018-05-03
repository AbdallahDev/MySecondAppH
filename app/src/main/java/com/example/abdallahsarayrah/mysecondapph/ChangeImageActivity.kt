package com.example.abdallahsarayrah.mysecondapph

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class ChangeImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_image)

        var index = 0

        fun changeImage(v: View) {
            if (index == 0) {
                imageView.setImageResource(R.drawable.b)
                index = 1
            } else {
                imageView.setImageResource(R.drawable.a)
                index = 0
            }
        }

    }


}
