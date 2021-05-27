package com.example.adapter

data class Data(
    val date: String,
    val title: String,
    val message: String
) {

    sealed class Type(val objectId: Long) {
        class None(objectId: Long = NO_ID) : Type(objectId)
        class Order(objectId: Long) : Type(objectId)

        fun hasId() = objectId != NO_ID && objectId != 0L

        fun isOrder() = this is Order

        companion object {
            const val NO_ID = -1L
        }
    }
}