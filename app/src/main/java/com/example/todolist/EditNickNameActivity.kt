package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_edit_nick_name.*
import kotlinx.android.synthetic.main.fragment_setting.*

class EditNickNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)
        setupEvents()
        setValues()
    }

    private fun setupEvents() {
        btnSave.setOnClickListener {
            val changeNick = editNickName.text.toString()
            if (changeNick.isBlank()) {
                Toast.makeText(this, "올바른 닉네임을 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val resultIntent = Intent()
            resultIntent.putExtra("inputNick", changeNick)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }


    private fun setValues() {
    }
}