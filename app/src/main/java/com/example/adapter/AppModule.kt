package com.example.adapter

import org.koin.dsl.module

    val module = module {
    factory<Mapper> { MapperImpl() }
}