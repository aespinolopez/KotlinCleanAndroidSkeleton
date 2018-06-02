package com.espino.android.kotlincleanandroidskeleton.domain.repository

interface Repository<T, in S> {

    fun insert(model: T): Boolean
    fun update(model: T): Boolean
    fun get(id: S): T
    fun delete(model: T): Boolean
}