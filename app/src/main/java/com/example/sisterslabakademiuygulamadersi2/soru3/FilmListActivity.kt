package com.example.sisterslabakademiuygulamadersi2.soru3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sisterslabakademiuygulamadersi2.R
import com.example.sisterslabakademiuygulamadersi2.databinding.ActivityFilmListBinding

class FilmListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFilmListBinding
    private lateinit var filmAdapter: FilmAdapter
    private lateinit var filmList: ArrayList<Film>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.filmRv.setHasFixedSize(true)
        binding.filmRv.layoutManager = LinearLayoutManager(this)
        addFilmData()
    }


    private fun addFilmData() {

        val getTag = intent.getStringExtra("tag")
        val getDirectory = intent.getStringExtra("director")
        val getPoint = intent.getStringExtra("point")

        val film1 = Film("The Shawshank Redemption", "Frank Darabont", 9)
        val film2 = Film("The Shawshank Redemption", "Frank Darabont", 9)
        val film3 = Film("The Godfather", "Francis Ford Coppola", 7)
        val film4 = Film("Pulp Fiction", "Quentin Tarantino", 3)
        val film5 = Film("The Dark Knight", "Christopher Nolan", 9)
        val film6 = Film("Inception", "Christopher Nolan ", 8)
        val film7 = Film("Fight Club", "David Fincher", 8)
        val film8 = Film("Forrest Gump", "Robert Zemeckis ", 5)
        val film9 = Film(getTag, getDirectory, getPoint?.toInt())

        filmList = ArrayList<Film>()
        filmList.add(film1)
        filmList.add(film2)
        filmList.add(film3)
        filmList.add(film4)
        filmList.add(film5)
        filmList.add(film6)
        filmList.add(film7)
        filmList.add(film8)
        filmList.add(film9)

        filmAdapter = FilmAdapter(filmList)
        binding.filmRv.adapter = filmAdapter
    }
}