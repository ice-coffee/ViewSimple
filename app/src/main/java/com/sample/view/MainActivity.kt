package com.sample.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sample.hilt.AHiltActivity
import com.sample.jetpack.JetpackActivity
import com.sample.mvvm.LoginActivity

/**
 * @date: 2020/9/6
<p>
 * @author: ice_coffee
<p>
 * @remark:
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun jumpView(view: View) {
        startActivity(Intent(this, ViewActivity::class.java))
    }

    fun jumpJetpack(view: View) {
        startActivity(Intent(this, JetpackActivity::class.java))
    }

    fun jumpMvvm(view: View) {
        startActivity(Intent(this, LoginActivity::class.java))
    }

    fun jumpHilt(view: View) {
        startActivity(Intent(this, AHiltActivity::class.java))
    }
}