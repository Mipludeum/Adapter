package com.example.adapter

import com.example.adapter.databinding.ItemDateBinding
import com.livermor.delegateadapter.delegate.ViewBindingDelegateAdapter

class OneDelegate :
    ViewBindingDelegateAdapter<Model.DateModel, ItemDateBinding>(
        ItemDateBinding::inflate
    ) {

    override fun isForViewType(item: Any): Boolean {
        return item is Model.DateModel
    }

    override fun Model.DateModel.getItemId(): Any {
        return id()
    }

    override fun ItemDateBinding.onBind(item: Model.DateModel) {
        with(this) {
            tvDate.text = item.text
        }
    }
}