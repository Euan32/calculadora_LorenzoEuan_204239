package euan.lorenzo.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var num = 0.0
    lateinit var tv_operacion: TextView
    lateinit var tv_resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_operacion = findViewById(R.id.tv_operacion)
        tv_resultado = findViewById(R.id.tv_resultado)

        val btnBorrar: Button = findViewById(R.id.btn_borrar)
        val btnResultado: Button = findViewById(R.id.btn_resultado)

        btnResultado.setOnClickListener{
            var num1: Double = tv_operacion.text.toString().toDouble()
            var resul: Double =0.0

            when(operacion){
                1 -> resul= num+num1
                2 -> resul = num-num1
                3 -> resul = num*num1
                4 -> resul = num/num1
            }
            tv_resultado.setText(resul.toString())
            tv_operacion.setText("")
        }

        btnBorrar.setOnClickListener{
            tv_operacion.setText("")
            tv_resultado.setText("")
            num=0.0
            operacion=0
        }
    }
    fun pushButton(view: View){
        val tv_operacion: TextView = findViewById(R.id.tv_operacion)
        var operacion: String = tv_operacion.text.toString()

        when(view.id){
            R.id.btn0 -> tv_operacion.setText(operacion + "0")
            R.id.btn1 -> tv_operacion.setText(operacion + "1")
            R.id.btn2 -> tv_operacion.setText(operacion + "2")
            R.id.btn3 -> tv_operacion.setText(operacion + "3")
            R.id.btn4 -> tv_operacion.setText(operacion + "4")
            R.id.btn5 -> tv_operacion.setText(operacion + "5")
            R.id.btn6 -> tv_operacion.setText(operacion + "6")
            R.id.btn7 -> tv_operacion.setText(operacion + "7")
            R.id.btn8 -> tv_operacion.setText(operacion + "8")
            R.id.btn9 -> tv_operacion.setText(operacion + "9")
            R.id.btn_punto -> tv_operacion.setText(operacion + ".")
        }
    }
        var operacion = 0
    fun clickOperacion(view: View){
        num = tv_operacion.text.toString().toDouble()
        var txt: String = tv_operacion.text.toString()
        tv_operacion.setText("")
        when(view.id){
            R.id.btn_suma -> {
                tv_resultado.setText(txt + "+")
                operacion=1
            }
            R.id.btn_resta -> {
                tv_resultado.setText(txt + "-")
                operacion=2
            }
            R.id.btn_multiplicar -> {
                tv_resultado.setText(txt + "*")
                operacion=3
            }
            R.id.btn_division -> {
                tv_resultado.setText(txt + "/")
                operacion=4
            }
        }
    }
}