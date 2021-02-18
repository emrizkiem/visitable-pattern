package com.example.visitablepattern.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.visitablepattern.ui.visitors.VisitorElement

class BaseAdapter constructor(
    /** as viewType Identifier **/
    private val viewTypeElement: VisitorElement,
    /** the items data **/
    private val items: ArrayList<VisitorUIModel> = arrayListOf()
) : RecyclerView.Adapter<AbstractViewHolder<VisitorUIModel>>() {

    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AbstractViewHolder<VisitorUIModel> {
        val layoutView = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        return viewTypeElement.createViewHolder(layoutView, viewType) as AbstractViewHolder<VisitorUIModel>
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return items[position].type(viewTypeElement)
    }

    override fun onBindViewHolder(holder: AbstractViewHolder<VisitorUIModel>, position: Int) {
        holder.onBind(items[position])
    }

    fun addItem(item: List<VisitorUIModel>) {
        this.items.addAll(item)
        notifyDataSetChanged()
    }

    fun removeItem(item: VisitorUIModel) {
        this.items.remove(item)
        notifyDataSetChanged()
    }
}