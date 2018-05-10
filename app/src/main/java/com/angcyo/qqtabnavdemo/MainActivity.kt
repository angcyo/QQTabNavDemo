package com.angcyo.qqtabnavdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TouchMoveGroupLayout>(R.id.touch_nav_layout).listener = object : TouchMoveGroupLayout.OnSelectorPositionListener {
            override fun onSelectorPosition(targetView: TouchMoveView, position: Int) {
                findViewById<TextView>(R.id.text_view).text = "onSelectorPosition : $position"
            }

            override fun onRepeatSelectorPosition(targetView: TouchMoveView, position: Int) {
                findViewById<TextView>(R.id.text_view).text = "onRepeatSelectorPosition : $position"
                when (position) {
                    0 -> targetView.noReadNum = 0
                    1 -> targetView.noReadNum = 99
                    2 -> targetView.noReadNum = 10
                }
            }

        }
    }
}
