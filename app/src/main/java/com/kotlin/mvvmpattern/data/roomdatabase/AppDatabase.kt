package com.kotlin.mvvmpattern.data.roomdatabase

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kotlin.mvvmpattern.base.BaseApplication
import com.kotlin.mvvmpattern.data.roomdatabase.userdata.UserDataDao
import com.kotlin.mvvmpattern.data.roomdatabase.userdata.UserDataItem

@Database(
    entities = [UserDataItem::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    companion object {

        private var SINGLETON_INSTANCE: AppDatabase? = null

        fun getDatabase(): AppDatabase {
            synchronized(AppDatabase::class.java) {
                if (SINGLETON_INSTANCE == null) {
                    SINGLETON_INSTANCE = Room.databaseBuilder(
                        BaseApplication.SINGLETON_INSTANCE,
                        AppDatabase::class.java, "demo_database"
                    ).fallbackToDestructiveMigration().build()
                }
            }
            return SINGLETON_INSTANCE!!
        }
    }

    abstract fun getUserDetailDao(): UserDataDao
}
