package com.example.adapter

import com.example.adapter.databinding.ItemSwipeableBinding
import com.livermor.delegateadapter.delegate.ViewBindingDelegateAdapter

class TwoDelegate() :
    ViewBindingDelegateAdapter<Model.ItemModel, ItemSwipeableBinding>(
        ItemSwipeableBinding::inflate
    ) {

    override fun isForViewType(item: Any): Boolean {
        return item is Model.ItemModel
    }

    override fun Model.ItemModel.getItemId(): Any {
        return id()
    }

    override fun ItemSwipeableBinding.onBind(item: Model.ItemModel) {
        with(this) {
            tvTitle.text = item.title
            tvMessage.text = item.message
            tvDate.text = item.date
        }
    }
}