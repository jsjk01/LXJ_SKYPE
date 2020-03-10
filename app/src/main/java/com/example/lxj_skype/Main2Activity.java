package com.example.lxj_skype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private EditText userdetail,passwddetail;
    private Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        signin = (Button) findViewById(R.id.SignInBtn);
        userdetail = (EditText) findViewById(R.id.userdetail);
        passwddetail = (EditText) findViewById(R.id.passwddetail);



        signin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String userdetail1 = userdetail.getText().toString();
                String passwddetail1 = passwddetail.getText().toString();
                if(userdetail1.length() != 0 && passwddetail1.length() >= 6){
                    Toast.makeText(getApplicationContext(),"账户创建成功！",Toast.LENGTH_SHORT).show();
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(),"请输入正确的用户或密码！",Toast.LENGTH_SHORT).show();
                    userdetail.setText("");
                    passwddetail.setText("");
                }


            }
        });

    }
}
