package com.cyberlink.pigodogs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_menu.*

class GameMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_menu)

        goGame.setOnClickListener {
            val intent = Intent(this@GameMenu , PredStart::class.java)
            startActivity(intent)
        }

        setings.setOnClickListener {
            val intent = Intent(this@GameMenu , Setings::class.java)
            startActivity(intent)
        }


    }
}