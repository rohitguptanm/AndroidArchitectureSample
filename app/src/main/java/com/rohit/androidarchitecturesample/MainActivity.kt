package com.rohit.androidarchitecturesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // something change
        // new branch created
        // make practice for stash

        // new changes after merging in master

        // some changes in branch10 after merging
    }

    fun doSomeFun(){
        println("i am updating some value in branch10")
    }
}
