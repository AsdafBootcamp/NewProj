package com.narims.newproj.view

import android.content.Context
import android.view.View
import android.widget.LinearLayout
import com.narims.newproj.R

class TodoListView(context: Context): LinearLayout(context) {
    init {
        View.inflate(getContext(), R.layout.todo_list, this)
    }

    fun setTodoList() {

    }

    fun appendTodoList() {

    }
}