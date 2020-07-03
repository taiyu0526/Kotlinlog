package jp.techacademy.taiyu.kotlinglog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log //ここを追加

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  takesi= Human("たけし", 40, "平和")

        takesi.say()
        takesi.think()

        val tom = Human("トム", 18,"ガールフレンド")

        tom.say()
        tom.think()

        val kikuko = Human("キクコ", 88, "死")
        kikuko.say()
        kikuko.think()






    }
}
