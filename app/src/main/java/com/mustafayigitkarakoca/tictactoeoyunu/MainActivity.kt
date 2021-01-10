package com.mustafayigitkarakoca.tictactoeoyunu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var player1 =""
    var player2 =""
    var bitis= 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        textView1.setOnClickListener {
            if(player1==""){
                player1 ="X"
                textView1.text=player1
                player2=""
                textView1.isClickable=false
                bitis += 1
                //println(bitis)
                bitis(bitis)
            }else{
                if(player2==""){
                    player2="O"
                    textView1.text=player2
                    player1=""
                    textView1.isClickable=false
                    bitis +=1
                    //println(bitis)
                    bitis(bitis)
                }
            }
            //println(player1)
        }
        textView2.setOnClickListener {
            if(player1==""){
                player1 ="X"
                textView2.text=player1
                player2=""
                textView2.isClickable=false
                bitis +=1
                //println(bitis)
                bitis(bitis)
            }else{
                if(player2==""){
                    player2="O"
                    textView2.text=player2
                    player1=""
                    textView2.isClickable=false
                    bitis +=1
                    //println(bitis)
                    bitis(bitis)
                }
            }
        }
        textView3.setOnClickListener {
            if(player1==""){
                player1 ="X"
                textView3.text=player1
                player2=""
                textView3.isClickable=false
                bitis +=1
                //println(bitis)
                bitis(bitis)
            }else{
                if(player2==""){
                    player2="O"
                    textView3.text=player2
                    player1=""
                    textView3.isClickable=false
                    bitis +=1
                    //println(bitis)
                    bitis(bitis)
                }
            }
        }
        textView4.setOnClickListener {
            if(player1==""){
                player1 ="X"
                textView4.text=player1
                player2=""
                textView4.isClickable=false
                bitis +=1
                //println(bitis)
                bitis(bitis)
            }else{
                if(player2==""){
                    player2="O"
                    textView4.text=player2
                    player1=""
                    textView4.isClickable=false
                    bitis +=1
                    //println(bitis)
                    bitis(bitis)
                }
            }
        }
        textView5.setOnClickListener {
            if(player1==""){
                player1 ="X"
                textView5.text=player1
                player2=""
                textView5.isClickable=false
                bitis +=1
                //println(bitis)
                bitis(bitis)
            }else{
                if(player2==""){
                    player2="O"
                    textView5.text=player2
                    player1=""
                    textView5.isClickable=false
                    bitis +=1
                    //println(bitis)
                    bitis(bitis)
                }
            }
        }
        textView6.setOnClickListener {
            if(player1==""){
                player1 ="X"
                textView6.text=player1
                player2=""
                textView6.isClickable=false
                bitis +=1
                //println(bitis)
                bitis(bitis)
            }else{
                if(player2==""){
                    player2="O"
                    textView6.text=player2
                    player1=""
                    textView6.isClickable=false
                    bitis +=1
                    //println(bitis)
                    bitis(bitis)
                }
            }
        }
        textView7.setOnClickListener {
            if(player1==""){
                player1 ="X"
                textView7.text=player1
                player2=""
                textView7.isClickable=false
                bitis +=1
                //println(bitis)
                bitis(bitis)
            }else{
                if(player2==""){
                    player2="O"
                    textView7.text=player2
                    player1=""
                    textView7.isClickable=false
                    bitis +=1
                    //println(bitis)
                    bitis(bitis)
                }
            }
        }
        textView8.setOnClickListener {
            if(player1==""){
                player1 ="X"
                textView8.text=player1
                player2=""
                textView8.isClickable=false
                bitis +=1
                //println(bitis)
                bitis(bitis)
            }else{
                if(player2==""){
                    player2="O"
                    textView8.text=player2
                    player1=""
                    textView8.isClickable=false
                    bitis +=1
                   // println(bi)
                    bitis(bitis)
                }
            }
        }
        textView9.setOnClickListener {
            if (player1 == "") {
                player1 = "X"
                textView9.text = player1
                player2 = ""
                textView9.isClickable = false
                bitis += 1
                bitis(bitis)
                //println(bitis)
            } else {
                if (player2 == "") {
                    player2 = "O"
                    textView9.text = player2
                    player1 = ""
                    textView9.isClickable = false
                    bitis += 1
                    bitis(bitis)
                    //println(bitis)
                }
            }
        }

    }

    fun yenidenBaslat(view: View){
        player1=""
        player2=""
        bitis=0

        textView1.setText("")
        textView2.setText("")
        textView3.setText("")
        textView4.setText("")
        textView5.setText("")
        textView6.setText("")
        textView7.setText("")
        textView8.setText("")
        textView9.setText("")

        textView1.isClickable = true
        textView2.isClickable = true
        textView3.isClickable = true
        textView4.isClickable = true
        textView5.isClickable = true
        textView6.isClickable = true
        textView7.isClickable = true
        textView8.isClickable = true
        textView9.isClickable = true

        textView1.setBackgroundResource(R.color.black)
        textView1.setTextColor(Color.WHITE)
        textView2.setBackgroundResource(R.color.black)
        textView2.setTextColor(Color.WHITE)
        textView3.setBackgroundResource(R.color.black)
        textView3.setTextColor(Color.WHITE)
        textView4.setBackgroundResource(R.color.black)
        textView4.setTextColor(Color.WHITE)
        textView5.setBackgroundResource(R.color.black)
        textView5.setTextColor(Color.WHITE)
        textView6.setBackgroundResource(R.color.black)
        textView6.setTextColor(Color.WHITE)
        textView7.setBackgroundResource(R.color.black)
        textView7.setTextColor(Color.WHITE)
        textView8.setBackgroundResource(R.color.black)
        textView8.setTextColor(Color.WHITE)
        textView9.setBackgroundResource(R.color.black)
        textView9.setTextColor(Color.WHITE)

    }

    var oyuncu1Skor=0
    var oyuncu2Skor=0
    fun bitis(bitis:Int){

        if ((textView1.text == "X") && (textView2.text == "X") && (textView3.text == "X")) {
            oyuncu1Skor+=1
            //println(oyuncu1Skor)
            textView1.setBackgroundResource(R.color.white)
            textView1.setTextColor(Color.BLACK)
            textView2.setBackgroundResource(R.color.white)
            textView2.setTextColor(Color.BLACK)
            textView3.setBackgroundResource(R.color.white)
            textView3.setTextColor(Color.BLACK)
            Toast.makeText(this, "KAZANAN OYUNCU PLAYER1. YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            textview1Skor.text="SKOR: ${oyuncu1Skor}"

        }else if((textView1.text == "O") && (textView2.text == "O") && (textView3.text == "O")) {
            Toast.makeText(this, "Kazanan oyuncu player2 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            textView1.setBackgroundResource(R.color.white)
            textView1.setTextColor(Color.BLACK)
            textView2.setBackgroundResource(R.color.white)
            textView2.setTextColor(Color.BLACK)
            textView3.setBackgroundResource(R.color.white)
            textView3.setTextColor(Color.BLACK)
            oyuncu2Skor+=1
            textview2Skor.text="SKOR: ${oyuncu2Skor}"

        } else if ((textView4.text == "X") && (textView5.text == "X") && (textView6.text == "X")) {
            oyuncu1Skor+=1
            Toast.makeText(this, "Kazanan oyuncu player1 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            textView4.setBackgroundResource(R.color.white)
            textView4.setTextColor(Color.BLACK)
            textView5.setBackgroundResource(R.color.white)
            textView5.setTextColor(Color.BLACK)
            textView6.setBackgroundResource(R.color.white)
            textView6.setTextColor(Color.BLACK)
            textview1Skor.text="SKOR: ${oyuncu1Skor}"

        } else if ((textView4.text == "O") && (textView5.text == "O") && (textView6.text == "O")) {
            Toast.makeText(this, "Kazanan oyuncu player2 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            oyuncu2Skor+=1
            textView4.setBackgroundResource(R.color.white)
            textView4.setTextColor(Color.BLACK)
            textView5.setBackgroundResource(R.color.white)
            textView5.setTextColor(Color.BLACK)
            textView6.setBackgroundResource(R.color.white)
            textView6.setTextColor(Color.BLACK)
            textview2Skor.text="SKOR: ${oyuncu2Skor}"

        }else if ((textView7.text == "X") && (textView8.text == "X") && (textView9.text == "X")) {
            oyuncu1Skor+=1
            Toast.makeText(this, "Kazanan oyuncu player1 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            textView7.setBackgroundResource(R.color.white)
            textView7.setTextColor(Color.BLACK)
            textView8.setBackgroundResource(R.color.white)
            textView8.setTextColor(Color.BLACK)
            textView9.setBackgroundResource(R.color.white)
            textView9.setTextColor(Color.BLACK)
            textview1Skor.text="SKOR: ${oyuncu1Skor}"

        }else if((textView7.text == "O") && (textView8.text == "O") && (textView9.text == "O")){
            Toast.makeText(this, "Kazanan oyuncu player2 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            oyuncu2Skor+=1
            textView7.setBackgroundResource(R.color.white)
            textView7.setTextColor(Color.BLACK)
            textView8.setBackgroundResource(R.color.white)
            textView8.setTextColor(Color.BLACK)
            textView9.setBackgroundResource(R.color.white)
            textView9.setTextColor(Color.BLACK)
            textview2Skor.text="SKOR: ${oyuncu2Skor}"

        }else if ((textView1.text == "X") && (textView4.text == "X") && (textView7.text == "X")) {
            oyuncu1Skor+=1
            Toast.makeText(this, "Kazanan oyuncu player1 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            textView1.setBackgroundResource(R.color.white)
            textView1.setTextColor(Color.BLACK)
            textView4.setBackgroundResource(R.color.white)
            textView4.setTextColor(Color.BLACK)
            textView7.setBackgroundResource(R.color.white)
            textView7.setTextColor(Color.BLACK)
            textview1Skor.text="SKOR: ${oyuncu1Skor}"

        }else if((textView1.text == "O") && (textView4.text == "O") && (textView7.text == "O")){
            Toast.makeText(this, "Kazanan oyuncu player2 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            oyuncu2Skor+=1
            textView1.setBackgroundResource(R.color.white)
            textView1.setTextColor(Color.BLACK)
            textView4.setBackgroundResource(R.color.white)
            textView4.setTextColor(Color.BLACK)
            textView7.setBackgroundResource(R.color.white)
            textView7.setTextColor(Color.BLACK)
            textview2Skor.text="SKOR: ${oyuncu2Skor}"

        }else if ((textView2.text == "X") && (textView5.text == "X") && (textView8.text == "X")) {
            oyuncu1Skor+=1
            Toast.makeText(this, "Kazanan oyuncu player1 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            textView2.setBackgroundResource(R.color.white)
            textView2.setTextColor(Color.BLACK)
            textView5.setBackgroundResource(R.color.white)
            textView5.setTextColor(Color.BLACK)
            textView8.setBackgroundResource(R.color.white)
            textView8.setTextColor(Color.BLACK)
            textview1Skor.text="SKOR: ${oyuncu1Skor}"

        }else if ((textView2.text == "O") && (textView5.text == "O") && (textView8.text == "O")){
            Toast.makeText(this, "Kazanan oyuncu player2 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            oyuncu2Skor+=1
            textView2.setBackgroundResource(R.color.white)
            textView2.setTextColor(Color.BLACK)
            textView5.setBackgroundResource(R.color.white)
            textView5.setTextColor(Color.BLACK)
            textView8.setBackgroundResource(R.color.white)
            textView8.setTextColor(Color.BLACK)
            textview2Skor.text="SKOR: ${oyuncu2Skor}"

        }else if ((textView3.text == "X") && (textView6.text == "X") && (textView9.text == "X")) {
            oyuncu1Skor+=1
            Toast.makeText(this, "Kazanan oyuncu player1 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            textView3.setBackgroundResource(R.color.white)
            textView3.setTextColor(Color.BLACK)
            textView6.setBackgroundResource(R.color.white)
            textView6.setTextColor(Color.BLACK)
            textView9.setBackgroundResource(R.color.white)
            textView9.setTextColor(Color.BLACK)
            textview1Skor.text="SKOR: ${oyuncu1Skor}"


        }else if((textView3.text == "O") && (textView6.text == "O") && (textView9.text == "O")) {
            Toast.makeText(this, "Kazanan oyuncu player2 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            oyuncu2Skor+=1
            textView3.setBackgroundResource(R.color.white)
            textView3.setTextColor(Color.BLACK)
            textView6.setBackgroundResource(R.color.white)
            textView6.setTextColor(Color.BLACK)
            textView9.setBackgroundResource(R.color.white)
            textView9.setTextColor(Color.BLACK)
            textview2Skor.text="SKOR: ${oyuncu2Skor}"

        }else if ((textView1.text == "O") && (textView5.text == "O") && (textView9.text == "O")){
            Toast.makeText(this, "Kazanan oyuncu player2 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            oyuncu2Skor+=1
            textView1.setBackgroundResource(R.color.white)
            textView1.setTextColor(Color.BLACK)
            textView5.setBackgroundResource(R.color.white)
            textView5.setTextColor(Color.BLACK)
            textView9.setBackgroundResource(R.color.white)
            textView9.setTextColor(Color.BLACK)
            textview2Skor.text="SKOR: ${oyuncu2Skor}"

        }
        else if ((textView1.text == "X") && (textView5.text == "X") && (textView9.text == "X")){
            Toast.makeText(this, "Kazanan oyuncu player1 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            oyuncu1Skor+=1
            textView1.setBackgroundResource(R.color.white)
            textView1.setTextColor(Color.BLACK)
            textView5.setBackgroundResource(R.color.white)
            textView5.setTextColor(Color.BLACK)
            textView9.setBackgroundResource(R.color.white)
            textView9.setTextColor(Color.BLACK)
            textview1Skor.text="SKOR: ${oyuncu1Skor}"

        }
        else if ((textView3.text == "X") && (textView5.text == "X") && (textView7.text == "X")){
            Toast.makeText(this, "Kazanan oyuncu player1 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            oyuncu1Skor+=1
            textView3.setBackgroundResource(R.color.white)
            textView3.setTextColor(Color.BLACK)
            textView5.setBackgroundResource(R.color.white)
            textView5.setTextColor(Color.BLACK)
            textView7.setBackgroundResource(R.color.white)
            textView7.setTextColor(Color.BLACK)
            textview1Skor.text="SKOR: ${oyuncu1Skor}"

        }
        else if ((textView3.text == "O") && (textView5.text == "O") && (textView7.text == "O")){
            Toast.makeText(this, "Kazanan oyuncu player2 YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA TIKLAYIN", Toast.LENGTH_LONG).show()
            oyuncu2Skor+=1
            textView3.setBackgroundResource(R.color.white)
            textView3.setTextColor(Color.BLACK)
            textView5.setBackgroundResource(R.color.white)
            textView5.setTextColor(Color.BLACK)
            textView7.setBackgroundResource(R.color.white)
            textView7.setTextColor(Color.BLACK)
            textview2Skor.text="SKOR: ${oyuncu2Skor}"

        }
        if(bitis==9){
            Toast.makeText(this,"YENİDEN OYNAMAK İÇİN YENİDEN BAŞLATA BASINIZ",Toast.LENGTH_LONG).show()
        }

    }
    fun sifirla(view: View){
        
        finish()
        startActivity(getIntent())

    }
}

