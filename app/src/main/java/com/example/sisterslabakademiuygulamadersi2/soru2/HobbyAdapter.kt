package com.example.sisterslabakademiuygulamadersi2.soru2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sisterslabakademiuygulamadersi2.databinding.RecyclerExample1RowBinding

class HobbyAdapter( private val hobbyList: List<Hobbies>) :
    RecyclerView.Adapter<HobbyAdapter.HobbyViewHolder>() {

    inner class HobbyViewHolder(val binding: RecyclerExample1RowBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {
        val binding =
            RecyclerExample1RowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HobbyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return hobbyList.size
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        val hobby = hobbyList[position]
        val binding = holder.binding
        binding.hobbyTv.text = hobby.name
    }

}