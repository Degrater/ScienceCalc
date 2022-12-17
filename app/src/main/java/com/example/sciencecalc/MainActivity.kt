package com.example.sciencecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.sciencecalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.btnResult.setOnClickListener {
            val genderPerson: Int = bindingClass.genderPerson.text.toString().toInt()
            when(genderPerson){
                1 ->{
                    var mass : Double = bindingClass.mass.text.toString().toDouble()
                    var height : Double = bindingClass.height.text.toString().toDouble()
                    var year : Double = bindingClass.yearPerson.text.toString().toDouble()
                    Log.d("LogD","Result: $mass,$year,$height,$genderPerson")
                    var kalMen : Double = (10*mass)+(6.25*height)-(5*year)+5
                    bindingClass.Result.visibility = View.VISIBLE
                    bindingClass.Result.text = "Без физ. нагрузок вам необходимо ${kalMen.toString()} ккал"
                }
                2 ->{
                    var mass : Double = bindingClass.mass.text.toString().toDouble()
                    var height : Double = bindingClass.height.text.toString().toDouble()
                    var year : Double = bindingClass.yearPerson.text.toString().toDouble()
                    Log.d("LogD","Result: $mass,$year,$height,$genderPerson")
                    var kalWoman : Double = (10*mass)+(6.25*height)-(5*year)-161
                    bindingClass.Result.visibility = View.VISIBLE
                    bindingClass.Result.text = "Без физ. нагрузок вам необходимо ${kalWoman.toString()} ккал"
                }
            }
        }
    }
}