package com.example.paint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.paint.PaintView.Companion.colorList
import com.example.paint.PaintView.Companion.currentBrush
import com.example.paint.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {
    companion object{
        var path=Path()
        var paintBrush=Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bluebtn=findViewById<ImageButton>(R.id.blueColor)
        val redbtn=findViewById<ImageButton>(R.id.redColor)
        val greenbtn=findViewById<ImageButton>(R.id.greenColor)
        val yellowbtn=findViewById<ImageButton>(R.id.yellowColor)
        val purplebtn=findViewById<ImageButton>(R.id.purpleColor)
        val eraser=findViewById<ImageButton>(R.id.whiteColor)
        bluebtn.setOnClickListener {
           Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.BLUE
            currentColor(paintBrush.color)
        }
        redbtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.RED
            currentColor(paintBrush.color)
        }
        greenbtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.GREEN
            currentColor(paintBrush.color)
        }
        yellowbtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.YELLOW
            currentColor(paintBrush.color)
        }
        purplebtn.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.MAGENTA
            currentColor(paintBrush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
    private fun currentColor(color:Int){
        currentBrush=color
        path=Path ()
    }
}