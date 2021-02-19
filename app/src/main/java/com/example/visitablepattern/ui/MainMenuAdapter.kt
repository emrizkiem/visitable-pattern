package com.example.visitablepattern.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.visitablepattern.R
import com.example.visitablepattern.data.Menu
import com.example.visitablepattern.databinding.ItemMenuBinding

class MainMenuAdapter(
    private val items: List<Menu> = arrayListOf()
) : RecyclerView.Adapter<MainMenuAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val binding = ItemMenuBinding.bind(view)

        fun onBind(menu: Menu) {
            binding.txtMenu.text = menu.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return ViewHolder(layoutInflater)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(items[position])
    }
}