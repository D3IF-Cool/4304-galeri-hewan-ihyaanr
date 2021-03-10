package org.d3if0004.galerihewan2

import Hewan
import MainAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if0004.galerihewan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        Log.d("MainActivity", "Jumlah data: " + getData().size)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }
    private fun getData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor", R.drawable.angsa, "Unggas"),
            Hewan("Ayam", "Gallus gallus", R.drawable.ayam, "Unggas"),
            Hewan("Bebek", "Cairina moschata", R.drawable.bebek, "Unggas"),
            Hewan("Domba", "Ovis ammon", R.drawable.domba, "Mammalia"),
            Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun, "Aves"),
            Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing, "Mammalia"),
            Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci, "Mammalia"),
            Hewan("Kerbau", "Bubalus bubalis", R.drawable.kerbau, "Mammalia"),
            Hewan("Kuda", "Equus caballus", R.drawable.kuda, "Mammalia"),
            Hewan("Sapi", "Bos taurus", R.drawable.sapi, "Mammalia"),

            )
    }
}