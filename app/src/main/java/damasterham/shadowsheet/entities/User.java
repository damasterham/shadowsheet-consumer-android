package damasterham.shadowsheet.entities;

import android.arch.persistence.room.Entity;

@Entity
public class User extends NamedEntity
{
    private String email;
    private String password;
    private boolean isEmailUsername;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
        if (isEmailUsername)
            setName(email);
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean isEmailUsername()
    {
        return isEmailUsername;
    }

    public void setEmailUsername(boolean emailUsername)
    {
        isEmailUsername = emailUsername;
    }
}
