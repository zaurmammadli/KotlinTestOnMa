package com.kotlintest.zaurmammadli.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import model.TestClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            Toast.makeText(this, checkClass(testClass = TestClass()).name + classTest().toString(), Toast.LENGTH_LONG).show()
        }catch (e: Exception){
            Log.d("TAG", e.message.toString());
        }
    }

    fun checkClass(testClass: TestClass): TestClass{
        testClass.d=5
        testClass.name="zaur"

        return testClass
    }

    fun classTest():Int{
        return 100
    }
}
