package com.mozhimen.crashk_native

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CrashKNativeLib.init(this.cacheDir.absolutePath)
        findViewById<TextView>(R.id.main_btn_crash).setOnClickListener {
            CrashKNativeLib.testNativeCrash()
        }
    }
}