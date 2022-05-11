package com.example.todolist

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_setting.*

class SettingFragment : Fragment() {

    private val CHANGE_NICK = 1004

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_setting, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnChange.setOnClickListener {

            val myIntent = Intent(requireContext(), EditNickNameActivity::class.java)
            startActivityForResult(myIntent, CHANGE_NICK)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                CHANGE_NICK -> {
                    textViewNick.text = data?.getStringExtra("inputNick")
                }
            }
        }
    }

}