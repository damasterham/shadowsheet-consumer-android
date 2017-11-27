package damasterham.shadowsheet.nonused.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import damasterham.shadowsheet.entities.User;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface UserDao
{
    @Insert(onConflict = REPLACE)
    void save(User user);

    @Query("SELECT * FROM [user] WHERE name = :name")// & password = :password")
    LiveData<User> load(@Nonnull String name);//, @Nullable String password);

//    @Query("SELECT CASE WHEN EXISTS " +
//            "(SELECT * FROM [User] " +
//            "WHERE name = :name " +
//            "AND password = :pass  )")

//    @Query()
//
//     userExist(String name, String password);
}
