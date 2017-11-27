package damasterham.shadowsheet.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import damasterham.shadowsheet.R;
import damasterham.shadowsheet.nonused.webapi.Data;

public class MainActivity extends AppCompatActivity
{
    private Data data = Data.getInstance();
    //private NetworkFragment

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private MainSectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    //private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new MainSectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                data.getOneRunnerInfo().setRealName("Carl");
                //TextView runnerText = (TextView) mSectionsPagerAdapter.runnerActivity.getView().findViewById(R.id.runner_data);
                //runnerText.setText("Bla");
             /*   Runner runner = rest.getForObject(URL + "/runner/1/", Runner.class);

                runnerText.setText("Runner id: " + runner.getId());*/

                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        /*TextView runnerText = (TextView) mSectionsPagerAdapter.runnerActivity.getView().findViewById(R.id.runner_data);

        runnerText.setText("Bla");*/

        // Gets runner info, binds it to data and set textview to observe
        //new GetOneRunnerInfo().execute();
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    /*public static class PlaceholderFragment extends Fragment
    {
        *//**
         * The fragment argument representing the section number for this
         * fragment.
         *//*
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment()
        {
        }

        *//**
         * Returns a new instance of this fragment for the given section
         * number.
         *//*
        public static PlaceholderFragment newInstance(int sectionNumber)
        {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState)
        {
            int sectionId = getArguments().getInt((ARG_SECTION_NUMBER));

            View rootView = inflater.inflate(R.layout.campaigns_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));


            TextView runnerView = (TextView) rootView.findViewById(R.id.runner_data);
            //runnerView.setText();

            return rootView;
        }
    }*/



  /*  private class UIBind extends AsyncTask<Void, Void, Info> implements Observer
    {

        // Gets static info from background
        @Override
        protected Info doInBackground(Void... voids)
        {
            MainActivity.info.setRealName("Carl");
            return MainActivity.info;
        }

        // Make object notify observers
        @Override
        protected void onPostExecute(Info info)
        {
            info.notifyObservers();
        }

        //  On observable change, change the text in the view
        @Override
        public void update(Observable observable, Object o)
        {
            TextView view = (TextView) findViewById(R.id.runner_data);
            if (observable != null)
            {
                view.setText(observable.toString());
            }
            else
                view.setText("Something went wrong with Observer Update");

        }
    }*/
}
