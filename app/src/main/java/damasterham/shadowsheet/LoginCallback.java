package damasterham.shadowsheet;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import static android.arch.lifecycle.Lifecycle.Event.*;


public abstract class LoginCallback implements LifecycleObserver
{
    private LifecycleOwner source;

    public final void fullOnSuccess()
    {
        if (source != null)
        {
            Lifecycle.State state = source.getLifecycle().getCurrentState();
            if(!state.isAtLeast(Lifecycle.State.STARTED))
                return;

            onSuccess();
        }
        return;

    }

    protected abstract void onSuccess();

    @OnLifecycleEvent(ON_CREATE)
    void onCreated(LifecycleOwner source)
    {
        this.source = source;
    }
}