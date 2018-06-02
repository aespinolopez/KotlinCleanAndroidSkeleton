package com.espino.android.kotlincleanandroidskeleton.presentation.presenters.impl

import com.espino.android.kotlincleanandroidskeleton.domain.executor.Executor
import com.espino.android.kotlincleanandroidskeleton.domain.executor.MainThread
import com.espino.android.kotlincleanandroidskeleton.domain.interactor.KotlinSampleInteractor
import com.espino.android.kotlincleanandroidskeleton.presentation.presenters.KotlinSampleMainPresenter
import com.espino.android.kotlincleanandroidskeleton.presentation.presenters.base.AbstractPresenter

class KotlinSampleMainPresenterImpl(executor: Executor, mainThread: MainThread, view: KotlinSampleMainPresenter.View) : AbstractPresenter(executor, mainThread), KotlinSampleMainPresenter, KotlinSampleInteractor.Callback {


    override fun resume() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun pause() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun destroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}