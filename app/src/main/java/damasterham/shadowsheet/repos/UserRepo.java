package damasterham.shadowsheet.repos;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.concurrent.Executor;

import javax.inject.Inject;
import javax.inject.Singleton;

import damasterham.shadowsheet.entities.User;
import damasterham.shadowsheet.dagger.module.RestService;
import damasterham.shadowsheet.nonused.dao.UserDao;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Singleton
public class UserRepo
{
    private RestService restService;
    private UserDao userDao;
    private Executor executor;

    @Inject
    public UserRepo(RestService restService)//, UserDao userDao, Executor executor)
    {
        this.restService = restService;
//        this.userDao = userDao;
//        this.executor = executor;
    }

    public LiveData<User> login(String username)
    {
        final MutableLiveData<User> data = new MutableLiveData<User>();

        restService.login(username).enqueue(new Callback<User>()
        {
            @Override
            public void onResponse(Call<User> call, Response<User> response)
            {
                if (response.isSuccessful())
                {
                    data.setValue(response.body());
                }
                else
                {
                    // has an error
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t)
            {
                // Failed response
            }
        });

        return data;
    }


//    public LiveData<User> save(User user)
//    {
//        userDao.save(user);
//    }



}
