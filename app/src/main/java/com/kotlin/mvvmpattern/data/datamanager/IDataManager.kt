package com.kotlin.mvvmpattern.data.datamanager

import com.kotlin.mvvmpattern.data.preferences.IPreference
import com.kotlin.mvvmpattern.data.remote.ApiService
import com.kotlin.mvvmpattern.data.roomdatabase.AppDatabase

interface IDataManager {
    fun getPreference(): IPreference
    fun getDatabase(): AppDatabase
    fun getRemote(): ApiService
}