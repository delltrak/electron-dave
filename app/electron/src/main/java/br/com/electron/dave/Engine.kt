package br.com.electron.dave

import android.content.Context

class Engine (context: Context) {

    // create context variable
    private var mContext: Context? = context

    // function return name
    fun getName(): String {
        return "Hello World"
    }

}