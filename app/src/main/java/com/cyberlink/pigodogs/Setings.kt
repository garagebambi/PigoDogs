package com.cyberlink.pigodogs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_game_menu.*
import kotlinx.android.synthetic.main.activity_game_zone.*
import kotlinx.android.synthetic.main.activity_pred_start.*
import kotlinx.android.synthetic.main.activity_setings.*

class Setings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setings)
        var backs = listOf(backSetings,backGameMenu,backGameZone,backPredAct)

        night.setOnClickListener {

            backSetings.setBackgroundResource(R.color.black)
        }

    }
}