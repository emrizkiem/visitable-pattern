package com.example.visitablepattern.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.visitablepattern.base.BaseAdapter
import com.example.visitablepattern.data.Banner
import com.example.visitablepattern.data.Gopay
import com.example.visitablepattern.data.MainMenu
import com.example.visitablepattern.data.Menu
import com.example.visitablepattern.databinding.ActivityMainBinding
import com.example.visitablepattern.ui.visitors.VisitorElementFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val _adapter by lazy {
        BaseAdapter(VisitorElementFactory(
            onClick = ::onBannerClicked
        ))
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
        val menus = MainMenu(listOf(
                Menu(0, "Send"),
                Menu(0, "Receive"),
                Menu(0, "History")
        ))
        val banner = Banner("")


        _adapter.addItem(listOf(gopay, menus, banner))
    }
    
    private fun onBannerClicked(banner: Banner) {
        Toast.makeText(this, "Ini Banner Android", Toast.LENGTH_SHORT).show()
    }
}