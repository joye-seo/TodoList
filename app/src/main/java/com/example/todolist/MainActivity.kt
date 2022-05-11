package com.example.todolist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todolist.adapter.TodoAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mTodoAdapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    private fun setupEvents() {


    }

    private fun setValues() {

//        멤버변수로 만들어놓은 어댑터를 실제로 초기화
        mTodoAdapter = TodoAdapter(supportFragmentManager)
//        xml에 만들어 놓은 뷰페이저 어댑터 연결
        mainViewPager.adapter = mTodoAdapter

        mainViewPager.offscreenPageLimit = 3

//        xml에 만들어 놓은 TabLayout에 뷰페이저 연결
        mainTabLayout.setupWithViewPager(mainViewPager)
    }

    }
