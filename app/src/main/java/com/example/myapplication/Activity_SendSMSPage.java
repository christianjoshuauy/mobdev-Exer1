package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_SendSMSPage extends AppCompatActivity {
    private EditText txtPhone;
    private EditText txtMessage;
    private Button btnSend;
    private Button btnClear;
    private String phoneNo;
    private String message;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_smspage);

        btnSend = findViewById(R.id.btnSend);
        txtPhone = findViewById(R.id.txtPhone);
        txtMessage = findViewById(R.id.txtMessage);
        btnClear = findViewById(R.id.btnClear);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtPhone.setText("");
                txtMessage.setText("");
            }
        });

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                phoneNo = txtPhone.getText().toString();
                message = txtMessage.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", phoneNo, null));
                intent.putExtra("sms_body", message);
                startActivity(intent);

                Toast.makeText(Activity_SendSMSPage.this, "SMS Sent", Toast.LENGTH_SHORT).show();
            }
        });
    }
}