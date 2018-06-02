package com.espino.android.kotlincleanandroidskeleton.domain.executor.impl

import com.espino.android.kotlincleanandroidskeleton.domain.executor.Executor
import com.espino.android.kotlincleanandroidskeleton.domain.interactor.base.AbstractInteractor
import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit


/**
 * This singleton (objects are singleton in kotlin) will make sure that each interactor operation gets a background thread.
 */
object ThreadExecutor : Executor {
    private const val CORE_POOL_SIZE = 3
    private const val MAX_POOL_SIZE = 5
    private const val KEEP_ALIVE_TIME = 120
    private val TIME_UNIT: TimeUnit = TimeUnit.SECONDS
    private val WORK_QUEUE: BlockingQueue<Runnable> = LinkedBlockingQueue<Runnable>()

    private val threadPoolExecutor = ThreadPoolExecutor(
            CORE_POOL_SIZE,
            MAX_POOL_SIZE,
            KEEP_ALIVE_TIME.toLong(),
            TIME_UNIT,
            WORK_QUEUE
    )

    override fun execute(interactor: AbstractInteractor) {
        threadPoolExecutor.submit {
            //run the main logic
            interactor.run()

            //mark it as finished
            interactor.onFinished()

        }
    }
}