package com.example.todolist.data

import java.io.Serializable

class TodoData(
    val todo: String,
    val rating: Double,
    var checked: Boolean,
    val place : String
) : Serializable {
}
