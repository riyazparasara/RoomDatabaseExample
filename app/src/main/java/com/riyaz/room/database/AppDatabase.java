package com.riyaz.room.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.riyaz.room.interfaces.TaskDao;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}