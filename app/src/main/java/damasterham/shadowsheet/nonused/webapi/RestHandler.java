package damasterham.shadowsheet.nonused.webapi;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import damasterham.shadowsheet.activities.MainActivity;
import damasterham.shadowsheet.entities.User;

public class RestHandler
{
    private static final int PORT = 42000;
    private static final String API_URL = "http://192.168.0.27:" + PORT + "/api";  //"http://10.111.179.252:42000/api";

    private RestTemplate rest;
    private Data data = Data.getInstance();

    private static RestHandler restHandler;

    private static ClientHttpRequestFactory getClientHttpRequestFactory()
    {
        int timeout = 5000;
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        clientHttpRequestFactory.setConnectTimeout(timeout);
        return clientHttpRequestFactory;
    }

    public RestHandler()
    {
        // Create rest template for http json calls, with request factory
        rest = new RestTemplate();//getClientHttpRequestFactory());
        //List<HttpMessageConverter<?>> list = rest.getMessageConverters();

        // Configure JSON converter
        rest.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
    }

    public static RestHandler getInstance()
    {
        if (restHandler == null)
            restHandler = new RestHandler();

        return restHandler;
    }


    public void SignupAsync(User user, Activity activity)
    {
        new SignupAsync().execute(user, activity);
    }

    private class SignupAsync extends AsyncTask<Object, Void, Void>
    {
        @Override
        protected Void doInBackground(Object... objects)
        {
            if (objects.length == 2)
            {
                //HttpEntity<User> request = new HttpEntity<>((User)objects[0]);
                User user = rest.postForObject(API_URL + "/user", (User)objects[0], User.class);

                if (user != null)
                {
                    Activity act = (Activity)objects[1];
                    Intent intent = new Intent(act, MainActivity.class);
                    data.setUser(user);
                    act.startActivity(intent);
                }
            }
            return null;
        }
    }

    // Start test

/*
    private class GetOneRunnerInfo extends AsyncTask<Void, Void, Info>
    {
        @Override
        protected Info doInBackground(Void... voids)
        {
            try
            {
                final String runnerInfo = URL + "/runner/1/info";
                Info info = rest.getForObject(runnerInfo, Info.class);
                Log.d("Get Runner Info: ", info.toString());
                return info;
            }
            catch (Exception e)
            {
                Log.e(this.getClass().getName(), "doInBackground: " + e.getMessage(), e);
            }

            return null;
        }

        @Override
        protected void onPostExecute(Info info)
        {
            ObserverTextView view = (ObserverTextView) findViewById(R.id.runner_data);
            if (info != null)
            {
                // set info object
                data.setOneRunnerInfo(info);

                // Add textview as observer
                data.getOneRunnerInfo().addObserver(view);

                data.getOneRunnerInfo().notifyObservers();
                //view.setText(info.toString());
                */
/*bindInfo = new UIBind();
                info.addObserver(bindInfo);
                info.notifyObservers();

                MainActivity.info = info;*//*


            }
            else
                view.setText("No Data Received");
        }
    }
*/



}
