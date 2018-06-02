package com.espino.android.kotlincleanandroidskeleton.presentation.presenters.base

import com.espino.android.kotlincleanandroidskeleton.domain.executor.Executor
import com.espino.android.kotlincleanandroidskeleton.domain.executor.MainThread

/**
 * This is a base class for all presenters which are communicating with interactors. This base class
 * will hold a reference to the executor and MainThread objects that are needed for running interactors
 * in a background thread.
 */
abstract class AbstractPresenter(executor: Executor, mainThread: MainThread)