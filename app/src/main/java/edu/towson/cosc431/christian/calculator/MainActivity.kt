package edu.towson.cosc431.christian.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputone : String? = null
        var symbol : String? = null
        var inputtwo : String? = null
        var dotflag = false
        var inputtran : String? = null
        var symtran : String? = null
        var dottran = false

        one_btn.setOnClickListener {

            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "1"
                }else{
                    val temp = "1"
                    inputone += temp
                }


                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "1"
                }else{
                    val temp = "1"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        two_btn.setOnClickListener {

            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "2"
                }else{
                    val temp = "2"
                    inputone += temp
                }

                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "2"
                }else{
                    val temp = "2"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        three_btn.setOnClickListener {


            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "3"
                }else{
                    val temp = "3"
                    inputone += temp
                }

                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "3"
                }else{
                    val temp = "3"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        four_btn.setOnClickListener {


            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "4"
                }else{
                    val temp = "4"
                    inputone += temp
                }

                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "4"
                }else{
                    val temp = "4"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        five_btn.setOnClickListener {


            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "5"
                }else{
                    val temp = "5"
                    inputone += temp
                }

                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "5"
                }else{
                    val temp = "5"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        six_btn.setOnClickListener {


            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "6"
                }else{
                    val temp = "6"
                    inputone += temp
                }

                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "6"
                }else{
                    val temp = "6"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        seven_btn.setOnClickListener {


            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "7"
                }else{
                    val temp = "7"
                    inputone += temp
                }

                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "7"
                }else{
                    val temp = "7"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        eight_btn.setOnClickListener {


            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "8"
                }else{
                    val temp = "8"
                    inputone += temp
                }

                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "8"
                }else{
                    val temp = "8"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        nine_btn.setOnClickListener {

            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "9"
                }else{
                    val temp = "9"
                    inputone += temp
                }

                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "9"
                }else{
                    val temp = "9"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        zero_btn.setOnClickListener {

            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "0"
                }else{
                    val temp = "0"
                    inputone += temp
                }

                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "0"
                }else{
                    val temp = "0"
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        dot_btn.setOnClickListener {

            dotflag = true

            if (symbol.equals(null)){
                if(inputone.equals(null)){
                    inputone = "."
                }else{
                    val temp = "."
                    inputone += temp
                }
                inputtran = null
                result_txt.text = inputone
            }else{
                if(inputtwo.equals(null)){
                    inputtwo = "."
                }else{
                    val temp = "."
                    inputtwo += temp
                }

                result_txt.text = inputtwo
            }
        }

        add_btn.setOnClickListener {
            if (!inputtran.equals(null)){
                if (symtran.equals("/") || dottran){
                    dotflag = true
                    symtran = null
                    dottran = false
                }
                inputone = inputtran
                symbol = "+"
                result_txt.text = symbol
            }else if (!inputone.equals(null)){
                symbol = "+"
                result_txt.text = symbol
            }

        }

        sub_btn.setOnClickListener {
            if (!inputtran.equals(null)){
                if (symtran.equals("/") || dottran){
                    dotflag = true
                    symtran = null
                    dottran = false
                }
                inputone = inputtran
                symbol = "-"
                result_txt.text = symbol
            }else if (!inputone.equals(null)){
                symbol = "-"
                result_txt.text = symbol
            }
        }

        mul_btn.setOnClickListener {
            if (!inputtran.equals(null)){
                if (symtran.equals("/") || dottran){
                    dotflag = true
                    symtran = null
                    dottran = false
                }
                inputone = inputtran
                symbol = "*"
                result_txt.text = symbol
            }else if (!inputone.equals(null)){
                symbol = "*"
                result_txt.text = symbol
            }
        }

        div_btn.setOnClickListener {
            if (!inputtran.equals(null)){
                if (symtran.equals("/") || dottran){
                    dotflag = true
                    dottran = false
                    symtran = null
                }
                inputone = inputtran
                symbol = "/"
                result_txt.text = symbol
            }else if (!inputone.equals(null)){
                symbol = "/"
                result_txt.text = symbol
            }
        }

        //Checks if the number is an int or double, then performes the the needed opporation

        eq_btn.setOnClickListener {


            if (!inputone.equals(null) && !symbol.equals(null) && !inputtwo.equals(null)){

                if (dotflag || symbol.equals("/")) {
                    val valone = inputone!!.toDouble()
                    val valtwo = inputtwo!!.toDouble()

                    if (symbol.equals("+")) {
                        val result = valone + valtwo
                        result_txt.text = result.toString()
                        inputtran = result.toString()
                    } else if (symbol.equals("*")) {
                        val result = valone * valtwo
                        result_txt.text = result.toString()
                        inputtran = result.toString()
                    } else if (symbol.equals("-")) {
                        val result = valone - valtwo
                        result_txt.text = result.toString()
                        inputtran = result.toString()
                    } else if (symbol.equals("/")) {
                        if (valtwo.equals(0.0) || valtwo.equals(0)) {
                            result_txt.text = "ERROR"
                        } else {
                            val result = valone / valtwo
                            result_txt.text = result.toString()
                            inputtran = result.toString()
                        }
                    }
                    symtran = symbol
                    dottran = dotflag
                    dotflag = false
                    inputone = null
                    inputtwo = null
                    symbol = null

                }else{
                    val valone = inputone!!.toInt()
                    val valtwo = inputtwo!!.toInt()

                    if (symbol.equals("+")) {
                        val result = valone + valtwo
                        result_txt.text = result.toString()
                        inputtran = result.toString()
                    } else if (symbol.equals("*")) {
                        val result = valone * valtwo
                        result_txt.text = result.toString()
                        inputtran = result.toString()
                    } else if (symbol.equals("-")) {
                        val result = valone - valtwo
                        result_txt.text = result.toString()
                        inputtran = result.toString()
                    }
                    symtran = symbol
                    dottran = dotflag
                    dotflag = false
                    inputone = null
                    inputtwo = null
                    symbol = null
                }
            }

        }

        clear_btn.setOnClickListener {
            inputone = null
            inputtwo = null
            inputtran = null
            symbol = null
            symtran = null
            dotflag = false
            dottran = false
            result_txt.text = null
        }

    }

}
