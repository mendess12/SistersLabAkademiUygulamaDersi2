package com.example.sisterslabakademiuygulamadersi2.soru3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabakademiuygulamadersi2.databinding.ActivityFilmBinding
import com.google.android.material.snackbar.Snackbar

class FilmActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFilmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        /*
        * Öğrencilere, kullanıcının film başlığı, yönetmeni ve puanını girebileceği ve bu bilgileri RecyclerView içinde görüntüleyebileceği bir uygulama yapmalarını isteyin.
        * */

        binding.saveListButton.setOnClickListener {
            val tag = binding.tagEt.text.toString()
            val director = binding.directorEt.text.toString()
            val point = binding.pointEt.text.toString()

            if (tag.isEmpty() || director.isEmpty() || point.isEmpty()) {
                Snackbar.make(it, "Boş alanları doldurunuz!", Snackbar.LENGTH_SHORT).show()
            } else {
                val filmIntent = Intent(this@FilmActivity, FilmListActivity::class.java)
                filmIntent.putExtra("tag", tag)
                filmIntent.putExtra("director", director)
                filmIntent.putExtra("point", point)
                startActivity(filmIntent)
            }


        }
    }
}