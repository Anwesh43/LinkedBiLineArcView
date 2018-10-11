package com.anwesh.uiprojects.linkedbilinearcview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.bilinearcview.BiLineArcView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiLineArcView.create(this)
    }
}
