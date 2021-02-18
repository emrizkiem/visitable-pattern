package com.example.visitablepattern.data

import com.example.visitablepattern.base.VisitorUIModel
import com.example.visitablepattern.ui.visitors.VisitorElement

data class Banner(
    val bannerUrl: String
) : VisitorUIModel() {
    override fun type(type: VisitorElement): Int {
        return type.visit(this)
    }
}