package kr.ac.yuhan.minn.kotlintest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kr.ac.yuhan.minn.kotlintest2.databinding.ActivityMainBinding
import java.lang.String.format
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnResult.setOnClickListener(btnListener)
    }

    val btnListener = View.OnClickListener {
//        var w = binding.editWeight.text.toString().toInt();
        var weight:Double =binding.editWeight.text.toString().toDouble()
        var height:Double = binding.editHeight.text.toString().toDouble()
        var bmi:Double = weight / (height/100).pow(2)
        binding.textResult.text = format("%.2f", bmi)
    }
}