package com.example.visitablepattern.ui.viewholder

import android.view.View
import androidx.annotation.LayoutRes
import com.example.visitablepattern.R
import com.example.visitablepattern.base.AbstractViewHolder
import com.example.visitablepattern.data.Banner
import com.example.visitablepattern.databinding.ItemBannerBinding

class BannerViewHolder(
    view: View
) : AbstractViewHolder<Banner>(view) {

    private val binding = ItemBannerBinding.bind(view)

    override fun onBind(data: Banner) {}

    companion object {
        @LayoutRes const val LAYOUT = R.layout.item_banner
    }
}