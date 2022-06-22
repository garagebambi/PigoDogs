package com.cyberlink.pigodogs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_game_menu.*
import kotlinx.android.synthetic.main.activity_game_zone.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.times

class GameZone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_zone)
        val weapon = intent.getIntExtra("Weapon", 0)
        val sloj = intent.getIntExtra("Sloj", 0)
        var zaderjka = 0
        var pig1 = 0
        var pig2=  0
        var pig3 = 0
        var counter = 0
        var firstM = mutableListOf(img11, img21, img31, img41, img51, img61)
        var secondM = mutableListOf(img12, img22, img32, img42, img52, img62)
        var thirdM = mutableListOf(img13, img23, img33, img43, img53, img63)


        if (sloj == 0){
            zaderjka = 1350
        }else{
            zaderjka = 900
        }

//            start.setOnClickListener {

//                start.isInvisible = true
                GlobalScope.launch(Dispatchers.Main) {

                    while (true) {
                        firstM.forEach {
                            it.isInvisible = true
                        }
                        firstM[pig1].isInvisible = false
                        pig1 = (pig1 + 1) % firstM.size
                        delay(zaderjka.toLong())
                        if (!firstM[5].isInvisible){

                            firstM.forEach{
                                it.isEnabled = false
                            }
                            restart.isInvisible = false
                            loser.isInvisible = false
                        }
                    }

                }

                    GlobalScope.launch(Dispatchers.Main) {

                        while (true) {
                            secondM.forEach{
                                it.isInvisible = true
                            }
                            secondM[pig2].isInvisible = false
                            pig2 = (pig2 + 1)%secondM.size
                            delay(zaderjka.toLong())
                            if (!secondM[5].isInvisible){

                                secondM.forEach{
                                    it.isEnabled = false
                                }
                                restart.isInvisible = false
                                loser.isInvisible = false
                            }
                        }

                    }

                GlobalScope.launch(Dispatchers.Main) {

                    while (true) {
                        thirdM.forEach{
                            it.isInvisible = true
                        }
                        thirdM[pig3].isInvisible = false
                        pig3 = (pig3 + 1)%thirdM.size
                        delay(zaderjka.toLong())
                        if (!thirdM[5].isInvisible){

                            thirdM.forEach{
                                it.isEnabled = false
                            }
                            restart.isInvisible = false
                            loser.isInvisible = false
                        }

                    }

                }

                    for (i in firstM.indices) {
                        firstM[i].setOnClickListener {
                            zaderjka -= 20
                            GlobalScope.launch(Dispatchers.Main) {
                                if (weapon == 1) {
                                    firstM[i].setImageResource(R.drawable.newboomunitaz)
                                    delay(zaderjka.toLong())
                                    firstM.forEach {
                                        it.setImageResource(R.drawable.enemy)
                                    }
                                }else{
                                    firstM[i].setImageResource(R.drawable.newboomsteralka)
                                    delay(zaderjka.toLong())
                                    firstM.forEach {
                                        it.setImageResource(R.drawable.enemy)
                                    }
                                }
                            }
                            pig1 = 0
                            count.isInvisible = false
                            counter++
                            count.text = counter.toString()
                            if (zaderjka < 800)zaderjka = 800
                        }

                    }
                for (i in secondM.indices) {
                    secondM[i].setOnClickListener {
                        zaderjka -= 20
                        GlobalScope.launch(Dispatchers.Main) {
                            if (weapon == 1) {
                                secondM[i].setImageResource(R.drawable.newboomunitaz)
                                delay(zaderjka.toLong())
                                secondM.forEach {
                                    it.setImageResource(R.drawable.enemy)
                                }
                            }else{
                                secondM[i].setImageResource(R.drawable.newboomsteralka)
                                delay(zaderjka.toLong())
                                secondM.forEach {
                                    it.setImageResource(R.drawable.enemy)
                                }
                            }
                        }
                        pig2 = 0
                        count.isInvisible = false
                        counter++
                        count.text = counter.toString()
                        if (zaderjka < 800)zaderjka = 800
                    }

                }
                for (i in thirdM.indices) {
                    thirdM[i].setOnClickListener {
                        zaderjka -= 20
                        GlobalScope.launch(Dispatchers.Main) {
                            if (weapon == 1) {
                                thirdM[i].setImageResource(R.drawable.newboomunitaz)
                                delay(zaderjka.toLong())
                                thirdM.forEach {                                    it.setImageResource(R.drawable.enemy)
                                }
                            }else{
                                thirdM[i].setImageResource(R.drawable.newboomsteralka)
                                delay(zaderjka.toLong())
                                thirdM.forEach {
                                    it.setImageResource(R.drawable.enemy)
                                }
                            }

                        }
                        count.isInvisible = false
                        pig3 = 0
                        counter++
                        count.text = counter.toString()
                        if (zaderjka < 800)zaderjka = 800
                    }

                }

//            }

        restart.setOnClickListener {
            zaderjka = 1100
            val intent = Intent(this@GameZone , PredStart::class.java)
            startActivity(intent)
        }

    }
}