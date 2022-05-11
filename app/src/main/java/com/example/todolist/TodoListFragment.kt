package com.example.todolist

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.todolist.adapter.TodoListAdapter
import com.example.todolist.data.TodoData
import kotlinx.android.synthetic.main.fragment_todo_list.*
import kotlinx.android.synthetic.main.item_todo_list.*
import kotlinx.android.synthetic.main.item_todo_list.view.*

class TodoListFragment : Fragment() {
    val todoList = ArrayList<TodoData>()
    lateinit var mTodoAdapter: TodoListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_todo_list, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        todoList.add(
            TodoData(
                "공부1",
                3.8,
                false,
                "집"
            )
        )
        todoList.add(
            TodoData(
                "공부2",
                4.4,
                true,
                "학원"
            )
        )

        mTodoAdapter = TodoListAdapter(requireContext(), R.layout.item_todo_list, todoList)
        listViewTodo.adapter = mTodoAdapter

        listViewTodo.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(context, DetailTodoActivity::class.java)
            intent.putExtra("todoData", todoList[i])
            startActivity(intent)
        }

//
//        listViewTodo.setOnItemLongClickListener { adapterView, view, i, l ->
//
//
//        }
    }

}

