package vn.edu.hust.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val rollButton1: Button = findViewById(R.id.button1);
        val rollButton2: Button = findViewById(R.id.button2);
        val text1: TextView = findViewById(R.id.textView1);
        val text2: TextView = findViewById(R.id.textView2);
        rollButton1.setOnClickListener{
            rollDice(text1);
        }
        rollButton2.setOnClickListener {
            rollDice(text2);
        }
    }
    private fun rollDice(text123: TextView) {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        text123.text = diceRoll.toString()
        toast.show();
    }
}