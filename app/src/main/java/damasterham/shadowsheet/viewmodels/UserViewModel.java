package damasterham.shadowsheet.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import damasterham.shadowsheet.entities.User;


public class UserViewModel extends ViewModel
{
    private LiveData<User> user;

    public LiveData<User> getUser()
    {
        return user;
    }


}
