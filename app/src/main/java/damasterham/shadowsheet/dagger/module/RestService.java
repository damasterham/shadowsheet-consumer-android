package damasterham.shadowsheet.dagger.module;

import android.support.design.widget.TabLayout;

import java.util.List;

import dagger.Module;
import damasterham.shadowsheet.entities.Runner;
import damasterham.shadowsheet.entities.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
public interface RestService
{
    @POST("user")
    Call<User> createUser(@Body User user);

    @POST("login")
    Call<User> login(@Body String username);

    @GET("user/{id}/runner")
    Call<List<Runner>> runners(@Path("id") long userId);
}
