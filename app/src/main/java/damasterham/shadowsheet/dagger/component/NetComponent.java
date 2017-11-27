package damasterham.shadowsheet.dagger.component;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import damasterham.shadowsheet.activities.LoginActivity;
import damasterham.shadowsheet.activities.MainActivity;
import damasterham.shadowsheet.dagger.module.AppModule;
import damasterham.shadowsheet.dagger.module.NetModule;
import damasterham.shadowsheet.dagger.module.RestService;
import damasterham.shadowsheet.repos.UserRepo;
import damasterham.shadowsheet.viewmodels.LoginViewModel;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent
{
    void inject(LoginActivity loginActivity);
//    UserRepo userRepo();
//    RestService restService();
    LoginViewModel lvm();
}
