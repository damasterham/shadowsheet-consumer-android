package damasterham.shadowsheet.entities;

import java.util.List;

public class Info extends BaseEntity
{
    private String realName;
    private List<Alias> aliases;
    private Metatype metatype;
    private String sex;
    private String ethnicity;
    private String description;
    private String background;
    private String imageURL;
    private Runner runner;

    public String getRealName()
    {
        return realName;
    }

    public void setRealName(String realName)
    {
        this.realName = realName;
    }

    public List<Alias> getAliases()
    {
        return aliases;
    }

    public void setAliases(List<Alias> aliases)
    {
        this.aliases = aliases;
    }

    public Metatype getMetatype()
    {
        return metatype;
    }

    public void setMetatype(Metatype metatype)
    {
        this.metatype = metatype;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getEthnicity()
    {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity)
    {
        this.ethnicity = ethnicity;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getBackground()
    {
        return background;
    }

    public void setBackground(String background)
    {
        this.background = background;
    }

    public String getImageURL()
    {
        return imageURL;
    }

    public void setImageURL(String imageURL)
    {
        this.imageURL = imageURL;
    }

    public Runner getRunner()
    {
        return runner;
    }

    public void setRunner(Runner runner)
    {
        this.runner = runner;
    }

    @Override
    public String toString()
    {
        return "Info{" +
                "realName='" + realName + '\'' +
                //", aliases=" + aliases +
                ", metatype=" + metatype +
                ", sex='" + sex + '\'' +
                ", ethnicity='" + ethnicity + '\'' +
                ", description='" + description + '\'' +
                ", background='" + background + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
