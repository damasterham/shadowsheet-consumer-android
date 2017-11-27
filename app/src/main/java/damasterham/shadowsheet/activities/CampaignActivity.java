package damasterham.shadowsheet.activities;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import damasterham.shadowsheet.R;

public class CampaignActivity extends Fragment
{
   /* private int viewId;

    public int getViewId()
    {
        return viewId;
    }

    public void setViewId(int viewId)
    {
        this.viewId = viewId;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.campaigns_main, container, false);
        //setViewId(view.getId());
        return view;
    }
}
