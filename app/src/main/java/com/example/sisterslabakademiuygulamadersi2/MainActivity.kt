package com.example.sisterslabakademiuygulamadersi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabakademiuygulamadersi2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.sendData.setOnClickListener {
            val text = binding.text.text.toString()
            if (text.isEmpty()) {
                Snackbar.make(it, "Bir metin giriniz!", Snackbar.LENGTH_SHORT).show()
            } else {
                val sendDataIntent = Intent(this@MainActivity, MainActivity2::class.java)
                sendDataIntent.putExtra("text", text)
                startActivity(sendDataIntent)
            }
        }
    }
}