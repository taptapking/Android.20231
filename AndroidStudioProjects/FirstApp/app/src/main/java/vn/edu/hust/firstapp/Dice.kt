package vn.edu.hust.firstapp

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Dice  (private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }

}