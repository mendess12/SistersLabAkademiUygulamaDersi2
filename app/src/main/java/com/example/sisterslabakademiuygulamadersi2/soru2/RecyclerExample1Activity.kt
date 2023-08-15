package com.example.sisterslabakademiuygulamadersi2.soru2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sisterslabakademiuygulamadersi2.databinding.ActivityRecyclerExample1Binding

class RecyclerExample1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerExample1Binding
    private lateinit var adapter: HobbyAdapter
    private lateinit var hobbyList: ArrayList<Hobbies>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerExample1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)
        addData()
    }

    private fun addData() {
        val hobby1 = Hobbies("Futbol Oynamak")
        val hobby2 = Hobbies("Masa Tenisi Oynamak")
        val hobby3 = Hobbies("Müzik Dinlemek")
        val hobby4 = Hobbies("Dans Etmek")
        val hobby5 = Hobbies("Basketbol Oynamak")
        val hobby6 = Hobbies("Gezmek")
        val hobby7 = Hobbies("Balık tutmak")
        val hobby8 = Hobbies("Kitap okumak")
        val hobby9 = Hobbies("Resim yapmak")
        val hobby10 = Hobbies("Okçuluk")

        hobbyList = ArrayList<Hobbies>()

        hobbyList.add(hobby1)
        hobbyList.add(hobby2)
        hobbyList.add(hobby3)
        hobbyList.add(hobby4)
        hobbyList.add(hobby5)
        hobbyList.add(hobby6)
        hobbyList.add(hobby7)
        hobbyList.add(hobby8)
        hobbyList.add(hobby9)
        hobbyList.add(hobby10)

        adapter = HobbyAdapter(hobbyList)
        binding.rv.adapter = adapter
    }
}