package com.example.visitablepattern.data

import com.example.visitablepattern.base.VisitorUIModel
import com.example.visitablepattern.ui.visitors.VisitorElement

data class Gopay(
    val amount: Int
) : VisitorUIModel() {

    override fun type(type: VisitorElement): Int {
        return type.visit(this)
    }
}