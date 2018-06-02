package com.espino.android.kotlincleanandroidskeleton.threading

import android.os.Handler
import android.os.Looper
import com.espino.android.kotlincleanandroidskeleton.domain.executor.MainThread

/**
 * This class makes sure that the runnable we provide will be run on the main UI thread.
 */
object MainThreadImpl : MainThread {

    private val handler: Handler = Handler(Looper.getMainLooper())

    override fun post(runnable: Runnable) {
        handler.post(runnable)
    }
}