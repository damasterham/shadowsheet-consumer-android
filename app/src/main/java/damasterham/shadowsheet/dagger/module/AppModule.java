package damasterham.shadowsheet.dagger.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule
{
    Application mApplcation;

    public AppModule(Application mApplcation)
    {
        this.mApplcation = mApplcation;
    }

    @Provides
    @Singleton
    Application provideApplication()
    {
        return mApplcation;
    }
}
