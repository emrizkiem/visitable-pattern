package com.example.visitablepattern.ui.visitors

import android.view.View
import com.example.visitablepattern.base.AbstractViewHolder
import com.example.visitablepattern.data.Banner
import com.example.visitablepattern.data.Gopay
import com.example.visitablepattern.data.MainMenu
import com.example.visitablepattern.ui.viewholder.BannerViewHolder
import com.example.visitablepattern.ui.viewholder.GopayViewHolder

class VisitorElementFactory : VisitorElement {

    override fun visit(gopay: Gopay): Int {
        return GopayViewHolder.LAYOUT
    }

    override fun visit(menu: MainMenu): Int {
        return -1
    }

    override fun visit(banner: Banner): Int {
        return BannerViewHolder.LAYOUT
    }

    override fun createViewHolder(parent: View, type: Int): AbstractViewHolder<*> {
        return when(type) {
            GopayViewHolder.LAYOUT -> GopayViewHolder(parent)
            BannerViewHolder.LAYOUT -> BannerViewHolder(parent)
            else -> createViewHolder(parent, type)
        }
    }
}