package com.example.adapter

sealed class Model : DiffItem {

    data class DateModel(
        val text: String
    ) : Model() {
        override val id: String = text
        override val content: Any = this
    }

    data class ItemModel(
        val date: String,
        val title: String?,
        val message: String?,
    ) : Model() {
        override val id: String = date
        override val content: Any = this
    }
}
