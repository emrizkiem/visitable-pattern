package com.example.visitablepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.visitablepattern.base.BaseAdapter
import com.example.visitablepattern.data.Banner
import com.example.visitablepattern.data.Gopay
import com.example.visitablepattern.databinding.ActivityMainBinding
import com.example.visitablepattern.ui.visitors.VisitorElementFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val _adapter by lazy {
        BaseAdapter(VisitorElementFactory())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        initView()
    }

    private fun initRecyclerView() {
        binding.lstGojek.let {
            it.layoutManager = LinearLayoutManager(this)
            it.adapter = _adapter
        }
    }

    private fun initView() {
        val gopay = Gopay(100000)
        val banner = Banner("")

        _adapter.addItem(listOf(gopay, banner))
    }
}