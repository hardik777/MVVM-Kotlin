package com.kotlin.mvvmpattern.base

import androidx.lifecycle.ViewModel
import com.kotlin.mvvmpattern.data.datamanager.DataManager
import com.kotlin.mvvmpattern.data.preferences.IPreference
import com.kotlin.mvvmpattern.data.remote.ApiService
import com.kotlin.mvvmpattern.data.roomdatabase.AppDatabase

open class BaseViewModel : ViewModel() {

    fun getPreference(): IPreference {
        return DataManager.getInstance().getPreference()
    }

    fun getDatabase(): AppDatabase {
        return DataManager.getInstance().getDatabase()
    }

    fun getRemote(): ApiService {
        return DataManager.getInstance().getRemote()
    }
}