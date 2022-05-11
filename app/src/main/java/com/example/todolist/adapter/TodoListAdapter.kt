package com.example.todolist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.TextView
import com.example.todolist.R
import com.example.todolist.data.TodoData
import com.willy.ratingbar.ScaleRatingBar

class TodoListAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<TodoData>
) : ArrayAdapter<TodoData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(resId, null)
        }
        val row = tempRow!!

        val data = mList[position]

        val todoTxt = row.findViewById<TextView>(R.id.textViewTodo)
        val placeTxt = row.findViewById<TextView>(R.id.textViewPlace)
        val ratingBar = row.findViewById<ScaleRatingBar>(R.id.ratingBar)
        val checkBox = row.findViewById<CheckBox>(R.id.checkboxTodo)

        todoTxt.text = data.todo
        ratingBar.rating = data.rating.toFloat()
        checkBox.isChecked = data.checked

        return row

    }

}
