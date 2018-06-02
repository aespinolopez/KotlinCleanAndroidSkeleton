package com.espino.android.kotlincleanandroidskeleton.presentation.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.espino.android.kotlincleanandroidskeleton.R
import com.espino.android.kotlincleanandroidskeleton.presentation.presenters.KotlinSampleMainPresenter

class KotlinSampleMainActivity : AppCompatActivity(), KotlinSampleMainPresenter.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}