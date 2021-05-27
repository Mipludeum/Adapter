package com.example.adapter

class MapperImpl :
    Mapper {

    override fun map(): List<DiffItem> {
        val list = mutableListOf<DiffItem>()
        list.add(Model.ItemModel(
            date = "date",
            title = "title",
            message = "message",
        ))
        list.add(Model.DateModel("14/14/20"))
        return list
    }

}