package com.example.loginscreen2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView titleText, createAccount, account, accountCreate;
    private EditText userName, userPassword;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleText = findViewById(R.id.title_text);
        createAccount = findViewById(R.id.create_account);
        userName = findViewById(R.id.user_email);
        userPassword = findViewById(R.id.user_password);
        loginButton = findViewById(R.id.login_button);
        account = findViewById(R.id.account);
        accountCreate = findViewById(R.id.account_create);

        createAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                createAccount.setVisibility(View.INVISIBLE);
                account.setText("Already have an account");
                titleText.setVisibility(View.INVISIBLE);
                accountCreate.setVisibility(View.VISIBLE);
            }
        });

        account.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                createAccount.setVisibility(View.VISIBLE);
                account.setText("Don't have account ? ");
                titleText.setVisibility(View.VISIBLE);
                accountCreate.setVisibility(View.INVISIBLE);
            }
        });

    }


}
