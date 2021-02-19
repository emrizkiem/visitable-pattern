package com.example.visitablepattern.ui.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.GridLayoutManager
import com.example.visitablepattern.R
import com.example.visitablepattern.base.AbstractViewHolder
import com.example.visitablepattern.data.MainMenu
import com.example.visitablepattern.databinding.ItemMainMenuBinding
import com.example.visitablepattern.ui.MainMenuAdapter

class MainMenuViewHolder(
    view: View
) : AbstractViewHolder<MainMenu>(view) {

    private val binding = ItemMainMenuBinding.bind(view)
    private lateinit var menuAdapter: MainMenuAdapter

    override fun onBind(data: MainMenu) {
        if (!::menuAdapter.isInitialized && data.menus.isNotEmpty()) {
            menuAdapter = MainMenuAdapter(data.menus)
            binding.lstMainMenu.layoutManager = GridLayoutManager(itemView.context, 3)
        }
        binding.lstMainMenu.adapter = menuAdapter
    }

    companion object {
        @LayoutRes const val LAYOUT = R.layout.item_main_menu
    }
}