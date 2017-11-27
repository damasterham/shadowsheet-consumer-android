package damasterham.shadowsheet.nonused.webapi;

import damasterham.shadowsheet.entities.Info;
import damasterham.shadowsheet.entities.User;

public class Data
{
    private static Data data;

    public static Data getInstance()
    {
        if (data == null)
            data = new Data();

        return data;
    }

    private User user;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    private Info oneRunnerInfo;

    public Info getOneRunnerInfo()
    {
        return oneRunnerInfo;
    }

    public void setOneRunnerInfo(Info oneRunnerInfo)
    {
        this.oneRunnerInfo = oneRunnerInfo;
    }
}
