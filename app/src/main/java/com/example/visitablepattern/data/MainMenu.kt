package com.example.visitablepattern.data

import com.example.visitablepattern.base.VisitorUIModel
import com.example.visitablepattern.ui.visitors.VisitorElement

data class MainMenu(
    val menus: List<Menu>
) : VisitorUIModel() {

    override fun type(type: VisitorElement): Int {
        return type.visit(this)
    }
}

data class Menu(
    val icon: Int,
    val title: String
)