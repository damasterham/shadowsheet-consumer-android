package damasterham.shadowsheet.viewmodels;

import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import damasterham.shadowsheet.entities.User;
import damasterham.shadowsheet.repos.UserRepo;

public class SignupViewModel extends ViewModel
{
    private UserRepo userRepo;

//    LiveData<User> user;
//
//    public LiveData<User> getUser()
//    {
//        if (user == null)
//            user = new MutableLiveData<User>();
//        return user;
//    }


    @Inject
    public SignupViewModel(UserRepo userRepo)
    {
        this.userRepo = userRepo;
    }

    public void createUser(User user)
    {
        //this.userRepo.save(user);
    }
}
