package com.narims.newproj.view

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import com.narims.newproj.R
import kotlinx.android.synthetic.main.todo_item_view.view.*

class TodoItemView(context: Context): FrameLayout(context) {
    init {
        View.inflate(getContext(), R.layout.todo_item_view, this)
    }

    fun setText(text: String) {
        tvText.text = text
    }
}