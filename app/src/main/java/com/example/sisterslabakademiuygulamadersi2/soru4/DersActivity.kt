package com.example.sisterslabakademiuygulamadersi2.soru4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sisterslabakademiuygulamadersi2.R
import com.example.sisterslabakademiuygulamadersi2.databinding.ActivityDersBinding
import com.google.android.material.snackbar.Snackbar

class DersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDersBinding
    private lateinit var lessonAdapter: LessonAdapter
    private lateinit var lessonList: ArrayList<Lesson>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDersBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.lessonRv.setHasFixedSize(true)
        binding.lessonRv.layoutManager = LinearLayoutManager(this)
        lessonList = ArrayList<Lesson>()
        lessonAdapter = LessonAdapter()
        binding.lessonRv.adapter = lessonAdapter

        binding.saveListButton.setOnClickListener {
            val lessonName = binding.lessonNameEt.text.toString()
            val lessonColor = binding.lessonColorEt.text.toString()
            if (lessonName.isEmpty() || lessonColor.isEmpty()) {
                Snackbar.make(it, "Boş alanları doldurunuz!", Snackbar.LENGTH_SHORT).show()
            } else {
                addData(lessonName, lessonColor)
            }
        }
    }

    private fun addData(lessonName: String, lessonColor: String) {

        val color = when (lessonColor) {
            "kirmizi" -> R.color.kirmizi
            "mavi" -> R.color.mavi
            "turuncu" -> R.color.turuncu
            "mor" -> R.color.mor
            "sari" -> R.color.sari
            "yesil" -> R.color.yesil
            else -> R.color.black
        }
        val lesson = Lesson(lessonName, color)
        lessonList.add(lesson)
        lessonAdapter.changeData(lesson)
    }
}