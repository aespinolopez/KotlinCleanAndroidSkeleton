package com.espino.android.kotlincleanandroidskeleton.domain.interactor.base

import com.espino.android.kotlincleanandroidskeleton.domain.executor.Executor
import com.espino.android.kotlincleanandroidskeleton.domain.executor.MainThread

/**
 * This abstract class implements some common methods for all interactors. Cancelling an interactor, check if its running
 * and finishing an interactor has mostly the same throughout so that is why this class was created.
 * Field methods are declared volatile as we might use these methods from different threads (mainly from UI).
 *
 * For example, when an activity is getting destroyed then we should probably cancel an interactor but
 * the request will come fro the UI thread unless the request was specifically assigned to a background thread.
 */
abstract class AbstractInteractor(protected val threadExecutor: Executor, protected val mainThread: MainThread) : Interactor {

    @Volatile protected var isCancelled: Boolean = false
    @Volatile protected var isRunning: Boolean = false

    fun cancel() {
        this.isCancelled = true
        this.isRunning = false
    }

    fun onFinished()  {
        this.isCancelled = false
        this.isRunning = false
    }

    override fun execute() {
        this.isRunning = true
        this.threadExecutor.execute(this)
    }

    /**
     * This method contains the actual business logic of the interactor. It SHOULD NOT BE USED DIRECTLY but, instead,
     * a developer should call the execute() method of an interactor to make sure the operation is done on a background
     * thread.
     *
     * This method should only be called directly while doing unit/integration tests. That is the only reason it is declared
     * public as to help with easier testing.
     */
    abstract fun run()

}