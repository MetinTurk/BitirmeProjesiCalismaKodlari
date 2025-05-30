package com.example.yemekbitirmeodevi.ui.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Handler
import android.os.Looper
import android.widget.TextView
import com.example.yemekbitirmeodevi.R
import java.util.Timer
import java.util.TimerTask

class LoadingDialog(context: Context) : Dialog(context) {
    private var dots = 0
    private val timer = Timer()
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var textViewLoading: TextView

    init {
        setContentView(R.layout.loading_layout)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setCancelable(false)
        textViewLoading = findViewById(R.id.textViewLoading)
        startDotAnimation()
    }

    private fun startDotAnimation() {
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                handler.post {
                    dots = (dots + 1) % 4
                    val text = "Yükleniyor" + ".".repeat(dots)
                    textViewLoading.text = text
                }
            }
        }, 0, 500) // Her 500ms'de bir güncelle
    }

    override fun dismiss() {
        timer.cancel()
        super.dismiss()
    }

    fun showWithDelay(delayMillis: Long = 2000) {
        show()
        handler.postDelayed({ dismiss() }, delayMillis)
    }
} 