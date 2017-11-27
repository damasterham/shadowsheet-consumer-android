package damasterham.shadowsheet.nonused.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import damasterham.shadowsheet.entities.User;

@Database(entities = {
        User.class
},
version = 1)
public abstract class LocalRunnerDb extends RoomDatabase
{
    public abstract UserDao userDao();
}
