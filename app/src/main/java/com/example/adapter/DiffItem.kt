package com.example.adapter

interface DiffItem {
    val content: Any
    val id: String

    fun id(): String {
        return id
    }

    fun content(): Any {
        return content
    }
}