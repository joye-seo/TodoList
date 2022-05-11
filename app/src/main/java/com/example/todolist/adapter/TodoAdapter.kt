package com.example.todolist.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.todolist.GoalFragment
import com.example.todolist.SettingFragment
import com.example.todolist.TodoListFragment

class TodoAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount() = 3

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> TodoListFragment()
            1 -> GoalFragment()
            else -> SettingFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "TodoList"
            1 -> "Goal"
            else -> "Setting"
        }
    }
}