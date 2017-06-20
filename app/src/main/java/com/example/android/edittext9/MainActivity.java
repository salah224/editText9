package com.example.android.edittext9;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText FirsrName, LastName, password, e_mail, date, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirsrName = (EditText)findViewById(R.id.text1);
        LastName =  (EditText)findViewById(R.id.text2);
        password = (EditText)findViewById(R.id.text3);
        e_mail = (EditText)findViewById(R.id.text4);
        date = (EditText)findViewById(R.id.text5);
        phone = (EditText)findViewById(R.id.text6);
        submit = (Button)findViewById(R.id.button);

        submit.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                if (FirsrName.getText().toString().isEmpty() || LastName.getText().toString().isEmpty() ||
                        password.getText().toString().isEmpty() || e_mail.getText().toString().isEmpty() ||
                        date.getText().toString().isEmpty() || phone.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter the data", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), " FirsrName " +  FirsrName.getText().toString() +
                    "\n" + " LastName " +  LastName.getText().toString() + "\n" + " password " +  password.getText().toString() +
                    "\n" + " e_mail " +  e_mail.getText().toString() + "\n" + " date " +  date.getText().toString() + "\n" +
                    " phone " +  phone.getText().toString(), Toast.LENGTH_SHORT).show();

                }
            }
        });






    }
}
