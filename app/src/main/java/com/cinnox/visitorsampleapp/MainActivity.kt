package com.cinnox.visitorsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.m800.liveconnect.mobile.sdk.uikit.utils.CustomManager
import com.m800.maaiiconnect.mobile.client.CinnoxVisitorCore
import com.m800.maaiiconnect.mobile.client.CinnoxVisitorCoreListener

class MainActivity : AppCompatActivity() {
    companion object{
        const val serviceId = "210b.cx-tb.cinnox.com"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private val mCoreListener: CinnoxVisitorCoreListener = object : CinnoxVisitorCoreListener{
        override fun onInitializationEnd(success: Boolean, throwable: Throwable?) {
            //
        }
    }

    private fun init(){
        CinnoxVisitorCore.registerListener(mCoreListener)
        CinnoxVisitorCore.initialize(this, serviceId)
    }
}