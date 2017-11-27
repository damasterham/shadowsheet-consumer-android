package damasterham.shadowsheet.nonused.network;

import android.arch.lifecycle.LiveData;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public abstract class NetworkBoundResource<ResultType, RequestType>
{
    @WorkerThread
    protected abstract void saveCallResult(@Nonnull RequestType item);

    @MainThread
    protected abstract boolean shouldFetch(@Nullable ResultType data);

    @Nonnull @MainThread
    protected abstract LiveData<ResultType> loadFromDb();

//    @Nonnull @MainThread
//    protected abstract LiveData<ApiResponse>


}
