package kr.ac.yuhan.minn.kotlintest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kr.ac.yuhan.minn.kotlintest2.databinding.ActivityCalcBinding
import kr.ac.yuhan.minn.kotlintest2.databinding.ActivityMainBinding
import java.lang.String.format

class CalcActivity : AppCompatActivity() {
    val b by lazy {
        ActivityCalcBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(b.root)
        var btnArr = arrayOf<Button>(b.btnPlus, b.btnMinus, b.btnMulti, b.btnDvide)

        var i=0;
        for (btn in btnArr){
            btnArr[i++].setOnClickListener(btnListener)
        }
/*
        for(i in 0..btnArr.size){
        }

        for(i in 0..btnArr.size step 2){
        }
*/
    }

    val btnListener = View.OnClickListener{
        var eStr1 = b.edit1.text.toString()
        var eStr2 = b.edit2.text.toString()
        var num1 = eStr1.toDouble();
        var num2 = eStr2.toDouble();
        var result = 0.0;
        when(it.id){
            R.id.btnPlus -> result = num1 + num2
            R.id.btnMinus -> result = num1 - num2
            R.id.btnMulti -> result = num1 * num2
            R.id.btnDvide -> result = num1 / num2
        }
        b.textResult.setText(R.string.text_result)
        b.textResult.append(format("%.2f", result))
    }
}