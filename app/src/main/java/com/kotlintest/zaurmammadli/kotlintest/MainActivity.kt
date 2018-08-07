package com.kotlintest.zaurmammadli.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import model.TestClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, checkClass(testClass = TestClass()).name, Toast.LENGTH_LONG).show()
    }

    fun checkClass(testClass: TestClass): TestClass{
        testClass.d=5
        testClass.name="zaur"

        return testClass
    }
}
