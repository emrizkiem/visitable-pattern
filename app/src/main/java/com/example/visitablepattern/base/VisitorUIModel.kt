package com.example.visitablepattern.base

import com.example.visitablepattern.ui.visitors.VisitorElement

abstract class VisitorUIModel {
    abstract fun type(type: VisitorElement): Int
}