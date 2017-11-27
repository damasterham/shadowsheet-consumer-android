package damasterham.shadowsheet;

import android.app.Application;

import damasterham.shadowsheet.dagger.component.DaggerNetComponent;
import damasterham.shadowsheet.dagger.component.NetComponent;
import damasterham.shadowsheet.dagger.module.AppModule;
import damasterham.shadowsheet.dagger.module.NetModule;

public class ShadowSheetApp extends Application
{
    private NetComponent mNetComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();
        // Configure stuff

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://192.168.0.13:42000"))
                .build();


    }

    public NetComponent getNetComponent()
    {
        return mNetComponent;
    }
}
