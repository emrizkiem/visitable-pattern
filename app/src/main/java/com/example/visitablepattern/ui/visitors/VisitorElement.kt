package com.example.visitablepattern.ui.visitors

import android.view.View
import com.example.visitablepattern.base.AbstractViewHolder
import com.example.visitablepattern.data.Banner
import com.example.visitablepattern.data.Gopay
import com.example.visitablepattern.data.MainMenu

interface VisitorElement {

    fun visit(gopay: Gopay): Int
    fun visit(menu: MainMenu): Int
    fun visit(banner: Banner): Int

    // Factory
    fun createViewHolder(parent: View, type: Int) : AbstractViewHolder<*>
}