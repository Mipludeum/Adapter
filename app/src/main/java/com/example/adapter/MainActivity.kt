package com.example.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.livermor.delegateadapter.delegate.CompositeDelegateAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapper: Mapper = MapperImpl()

        val layoutManager = LinearLayoutManager(this)

        val adapter by lazy {
            CompositeDelegateAdapter(
                OneDelegate(),
                TwoDelegate()
            )
        }

        rvMain.adapter = adapter
        rvMain.layoutManager = layoutManager
        adapter.swapData(mapper.map())

    }
}