package com.cyberlink.pigodogs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_pred_start.*

class PredStart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pred_start)

        btnGo.setBackgroundResource(R.drawable.gardient)


       var sloj = 0
       var weapon = 1


        strlLftSloj.setOnClickListener {
            if (choseSloj.text.equals("High")){
                choseSloj.text = "Low"
            }else{
                choseSloj.text = "High"
            }
        }

        strlRightSloj.setOnClickListener {
            if (choseSloj.text.equals("High")){
                choseSloj.text = "Low"
                sloj = 0
            }else{
                choseSloj.text = "High"
                sloj = 1
            }
        }

        strelkaRight.setOnClickListener {

            if (weapon == 0){
                choseWeapon.setImageResource(R.drawable.unitazz)
                weapon = 1
            }else{
                choseWeapon.setImageResource(R.drawable.steralka)
                weapon = 0
            }
        }
        strlekaLeft.setOnClickListener {

            if (weapon == 0){
                choseWeapon.setImageResource(R.drawable.unitazz)
                weapon = 1
            }else{
                choseWeapon.setImageResource(R.drawable.steralka)
                weapon = 0
            }
        }

        btnGo.setOnClickListener {
            if (weapon == 1){
                weapon = 1
            }else{
                weapon = 2
            }

            if (choseSloj.text.equals("LOW")){
                sloj = 0
            }else{
                sloj = 1
            }

            val intent = Intent(this@PredStart , GameZone::class.java)
            intent.putExtra("Weapon", weapon)
            intent.putExtra("Sloj", sloj)
            startActivity(intent)

        }
    }
}