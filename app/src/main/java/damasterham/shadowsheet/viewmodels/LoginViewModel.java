package damasterham.shadowsheet.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import javax.annotation.Nullable;
import javax.inject.Inject;

import damasterham.shadowsheet.LoginCallback;
import damasterham.shadowsheet.entities.User;
import damasterham.shadowsheet.repos.UserRepo;

public class LoginViewModel extends ViewModel
{
    public UserRepo userRepo;

//    public LoginViewModel()
//    {
//    }

    @Inject
    public LoginViewModel(UserRepo userRepo)
    {
        this.userRepo = userRepo;
    }


    public void login(String username, LoginCallback callback)
    {
        LiveData<User> user = userRepo.login(username);



    }

//    public  getUser()
//    {
//        if (this.user == null)
//            this.user = new MutableLiveData<User>();
//        return this.user;
//    }


}
