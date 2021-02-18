package com.example.visitablepattern.ui.viewholder

import android.annotation.SuppressLint
import android.view.View
import androidx.annotation.LayoutRes
import com.example.visitablepattern.R
import com.example.visitablepattern.base.AbstractViewHolder
import com.example.visitablepattern.data.Gopay
import com.example.visitablepattern.databinding.ItemGopayBinding

class GopayViewHolder(
    view: View
) : AbstractViewHolder<Gopay>(view) {

    private val binding = ItemGopayBinding.bind(view)

    @SuppressLint("SetTextI18n")
    override fun onBind(data: Gopay) {
        binding.txtAmount.text = "Rp. ${data.amount},-"
    }

    companion object {
        @LayoutRes const val LAYOUT = R.layout.item_gopay
    }
}