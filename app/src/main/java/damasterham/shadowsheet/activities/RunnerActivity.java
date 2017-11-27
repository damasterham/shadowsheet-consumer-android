package damasterham.shadowsheet.activities;

import android.support.v4.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.springframework.web.client.RestTemplate;

import damasterham.shadowsheet.R;

public class RunnerActivity extends Fragment
{

/*
    private int viewId;
    private FragmentManager fm;

    public RunnerActivity(FragmentManager fm)
    {
        this.fm = fm;
    }

    public Fragment getFragment()
    {
        return fm.findFragmentById(viewId);
    }

    @Nullable
    @Override
    public View getView()
    {
        return null; //super.getView();
    }
*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.runners_main, container, false);
        //viewId = view.getId();
        return view;
    }
}
