package com.example.sisterslabakademiuygulamadersi2.soru4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sisterslabakademiuygulamadersi2.databinding.LessonItemBinding

class LessonAdapter :
    RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    private val lessonList: MutableList<Lesson> = arrayListOf()

    inner class LessonViewHolder(val binding: LessonItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val binding = LessonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LessonViewHolder(binding)
    }

    override fun getItemCount(): Int = lessonList.size

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val lesson = lessonList[position]
        val binding = holder.binding
        binding.cardLessonTv.text = lesson.lessonName
        binding.lessonCardView.setBackgroundResource(lesson.lessonColor)
    }

    fun changeData(lesson: Lesson) {
        lessonList.add(lesson)
        notifyItemChanged(lessonList.size - 1)

    }
}