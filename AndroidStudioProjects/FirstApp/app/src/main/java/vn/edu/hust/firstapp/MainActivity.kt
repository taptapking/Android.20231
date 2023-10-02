package vn.edu.hust.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val editParam1: EditText = findViewById(R.id.edit1);
        val editParam2: EditText = findViewById(R.id.edit2);
        val textContent: TextView = findViewById(R.id.textView123);
        findViewById<Button>(R.id.button123).setOnClickListener{
            try {
                val param1 = editParam1.text.toString().toDouble();
                val param2 = editParam2.text.toString().toDouble();
                val result = param1 + param2;
                textContent.text = result.toString();
            } catch (ex: Exception) {
                textContent.text = R.string.error.toString();
            }
        }
    }
}