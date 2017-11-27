package damasterham.shadowsheet.activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import damasterham.shadowsheet.LoginCallback;
import damasterham.shadowsheet.R;
import damasterham.shadowsheet.ShadowSheetApp;
import damasterham.shadowsheet.viewmodels.LoginViewModel;

public class LoginActivity extends AppCompatActivity
{
    private LoginViewModel viewModel;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        viewModel = ((ShadowSheetApp)getApplication()).getNetComponent().lvm(); //ViewModelProviders.of(this).get(LoginViewModel.class);

//        viewModel.getUser().observe(this, new Observer<User>()
//        {
//            @Override
//            public void onChanged(@Nullable User user)
//            {
//                // onChanged, is when the user has login in successfully
//                // Therfore, go to next activity
//                Intent intent = new Intent();
//
//            }
//        });

//        SharedPreferences settings = getSharedPreferences(CONFIG_FILE, 0);
//        String url = settings.getString("webApi", "0.0.0.0");
//
//        // Dagger building
//        carSupplier = DaggerCarSupplier.builder().build();
//
//        carSupplier.inject(this);


        setContentView(R.layout.login_layout);

        Button login = (Button)findViewById(R.id.loginButton);

        //String userID = savedInstanceState.getString("uid");

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String username = (((TextView)findViewById(R.id.loginUsername)).getText().toString());
                viewModel.login(username, new LoginCallback()
                {

                    @Override
                    public void onSuccess()
                    {
                        //  save user credentials and go to other activity
                    }
                });
            }
        });
        //login.setBackgroundColor(Color.CYAN);

        // Intent to goto SignupActivity

        Button gotoSignup = (Button)findViewById(R.id.gotoSingupButton);
        gotoSignup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                gotoSignup();
            }
        });
    }

    @Override
    protected void onStop()
    {
        super.onStop();

//        SharedPreferences settings = getSharedPreferences(CONFIG_FILE, 0);
//        SharedPreferences.Editor editor = settings.edit();
//        editor.putString("webApi", "0.0.0.0:42000");
//        editor.commit();

    }

    private void gotoSignup()
    {
        Intent singupIntent = new Intent(this, SignupActivity.class);
        startActivity(singupIntent);

    }


}
