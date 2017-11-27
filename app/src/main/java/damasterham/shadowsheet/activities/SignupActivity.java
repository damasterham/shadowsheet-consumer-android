package damasterham.shadowsheet.activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import damasterham.shadowsheet.R;
import damasterham.shadowsheet.entities.User;
import damasterham.shadowsheet.viewmodels.UserViewModel;

public class SignupActivity extends AppCompatActivity
{
    UserViewModel userVM;
    //RestHandler rest = RestHandler.getInstance();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);


        userVM = ViewModelProviders.of(this).get(UserViewModel.class);
        userVM.getUser().observe(this, new Observer<User>()
        {
            @Override
            public void onChanged(@Nullable User user)
            {

            }
        });

        // Signup
        findViewById(R.id.signupButton).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //userVM.createUser(setUser());
            }
        });

    }



    private User setUser()
    {
        User user = new User();
        Switch useEmail = (Switch)findViewById(R.id.signupUseEmailAsUsername);
        user.setEmailUsername(useEmail.isChecked());
        if (!user.isEmailUsername())
        {
            EditText name = (EditText)findViewById(R.id.signupUsername);
            user.setName(name.getText().toString());
        }
        EditText email = (EditText)findViewById(R.id.signupEmail);
        user.setEmail(email.toString());
        EditText pass = (EditText)findViewById(R.id.signupPassword);
        user.setPassword(pass.getText().toString());

        return user;
    }


}
