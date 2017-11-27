package damasterham.shadowsheet.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class MainSectionsPagerAdapter extends FragmentPagerAdapter
{
    private RunnerActivity runnerActivity;
    private CampaignActivity campaignActivity;

    public RunnerActivity getRunnerActivity()
    {
        return runnerActivity;
    }

    public CampaignActivity getCampaignActivity()
    {
        return campaignActivity;
    }

    public MainSectionsPagerAdapter(FragmentManager fm)
    {
        super(fm);


        //fm.findFragmentById();
        //fm.findFragmentById(R.id.)
    }




    @Override
    public Fragment getItem(int position)
    {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //return PlaceholderFragment.newInstance(position + 1);

        switch (position)
        {
            case 0: runnerActivity = new RunnerActivity();
                return runnerActivity;
            case 1:  campaignActivity = new CampaignActivity();
                return campaignActivity;
            default: return null;
        }
    }

    @Override
    public int getCount()
    {
        // Show 3 total pages.
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        switch (position)
        {
            case 0:
                return "SECTION 1";
            case 1:
                return "SECTION 2";
            case 2:
                return "SECTION 3";
        }
        return null;
    }
}

