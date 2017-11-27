package damasterham.shadowsheet.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Observable;

@Entity
public abstract class BaseEntity
{
    @PrimaryKey
    private long id;

    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id = id;
    }


}
