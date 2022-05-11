package com.example.todolist

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContentProviderCompat.requireContext
import com.bumptech.glide.Glide
import com.example.todolist.data.TodoData
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import kotlinx.android.synthetic.main.activity_detail_todo.*
import kotlinx.android.synthetic.main.item_todo_list.*
import kotlinx.android.synthetic.main.item_todo_list.textViewTodo
import java.nio.file.Files.delete

class DetailTodoActivity : AppCompatActivity() {

    lateinit var todoData : TodoData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_todo)
        todoData = intent.getSerializableExtra("todoData") as TodoData
        setupEvents()
        setValues()
    }

    private fun setValues() {
        textViewTodo.text = todoData.todo
        textViewPlace.text=todoData.place
        ratingbarDetail.rating = todoData.rating.toFloat()    }

    private fun setupEvents() {
        btnDelete.setOnClickListener {
           Toast.makeText(this,"삭제하였습니다",Toast.LENGTH_SHORT).show()
    }

}}