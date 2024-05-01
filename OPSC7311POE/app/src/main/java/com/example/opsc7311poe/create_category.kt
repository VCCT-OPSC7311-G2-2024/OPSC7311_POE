package com.example.opsc7311poe

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.method.CharacterPickerDialog
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import yuku.ambilwarna.AmbilWarnaDialog
import yuku.ambilwarna.AmbilWarnaDialog.OnAmbilWarnaListener

class create_category : AppCompatActivity() {
    private val navBar = Navbar()

    @SuppressLint("MissingInflatedId")
    private var mDefaultColour = 0
    private var ivColourPicker: ImageView = findViewById(R.id.iv_Pick_Colour)
    private var vColourPreview: View = findViewById(R.id.v_Colour_Preview)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_category)
        val HomeOpenActivity = findViewById<TextView>(R.id.tv_Home)
        val ProfileOpenActivity = findViewById<TextView>(R.id.tv_Profile)
        val CalendarOpenActivity = findViewById<TextView>(R.id.tv_calendar)
        val TimerOpenActivity = findViewById<TextView>(R.id.tv_timer)

        HomeOpenActivity.setOnClickListener()
        {
            navBar.OpenHomeButton()
        }

        ProfileOpenActivity.setOnClickListener()
        {
            navBar.OpenProfileButton()
        }

        CalendarOpenActivity.setOnClickListener()
        {
            navBar.OpenCalendarButton()
        }

        TimerOpenActivity.setOnClickListener()
        {
            navBar.OpenTimerButton()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mDefaultColour = 0

        ivColourPicker.setOnClickListener {
            fun onClick(v: View?) {
                openColorPickerDialogue()
            }
        }


    }


    fun openColorPickerDialogue() {
        val colorPickerDialogue = AmbilWarnaDialog(this, mDefaultColour, object :
            OnAmbilWarnaListener {
            override fun onCancel(dialog: AmbilWarnaDialog?) {

            }

            override fun onOk(dialog: AmbilWarnaDialog?, colour: Int) {
                mDefaultColour = colour
                vColourPreview.setBackgroundColor((mDefaultColour))
            }
        })
        colorPickerDialogue.show()
    }

}