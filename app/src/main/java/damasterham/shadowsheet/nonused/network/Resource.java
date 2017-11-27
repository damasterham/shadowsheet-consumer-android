package damasterham.shadowsheet.nonused.network;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static damasterham.shadowsheet.nonused.network.Status.ERROR;
import static damasterham.shadowsheet.nonused.network.Status.LOADING;
import static damasterham.shadowsheet.nonused.network.Status.SUCCESS;

public class Resource<T>
{
    @Nonnull public final Status status;
    @Nullable public final T data;
    @Nullable public final String message;

    public Resource(@Nonnull Status status, @Nullable T data, @Nullable String message)
    {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public static <T> Resource<T> success(@Nonnull T data)
    {
        return new Resource<T>(SUCCESS, data, null);
    }

    public static <T> Resource<T> error(String msg, @Nullable T data)
    {
        return new Resource<T>(ERROR, data, msg);
    }

    public static <T> Resource<T> loading(@Nullable T data)
    {
        return new Resource<T>(LOADING, data, null);
    }
}
