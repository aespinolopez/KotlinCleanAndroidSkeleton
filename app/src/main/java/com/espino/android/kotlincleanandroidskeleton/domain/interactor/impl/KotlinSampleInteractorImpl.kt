package com.espino.android.kotlincleanandroidskeleton.domain.interactor.impl

import com.espino.android.kotlincleanandroidskeleton.domain.executor.Executor
import com.espino.android.kotlincleanandroidskeleton.domain.executor.MainThread
import com.espino.android.kotlincleanandroidskeleton.domain.interactor.KotlinSampleInteractor
import com.espino.android.kotlincleanandroidskeleton.domain.interactor.base.AbstractInteractor
import com.espino.android.kotlincleanandroidskeleton.domain.repository.Repository

class KotlinSampleInteractorImpl(threadExecutor: Executor, mainThread: MainThread, private val callback: KotlinSampleInteractor.Callback, private val repository: Repository<*, *>) : AbstractInteractor(threadExecutor, mainThread), KotlinSampleInteractor {

    override fun run() {
        //TODO: Implement this with your business logic
    }

}