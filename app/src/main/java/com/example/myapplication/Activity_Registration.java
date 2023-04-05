package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText firstNameEditText = findViewById(R.id.firstNameEditText);
        EditText lastNameEditText = findViewById(R.id.lastNameEditText);
        RadioGroup genderRadioGroup = findViewById(R.id.genderRadioGroup);
        RadioButton maleRadioButton = findViewById(R.id.maleRadioButton);
        RadioButton femaleRadioButton = findViewById(R.id.femaleRadioButton);
        EditText birthdateEditText = findViewById(R.id.birthdateEditText);
        EditText phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        EditText emailAddressEditText = findViewById(R.id.emailAddressEditText);
        Button clearButton = findViewById(R.id.clearButton);
        Button registerButton = findViewById(R.id.registerButton);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Clear input fields
                firstNameEditText.setText("");
                lastNameEditText.setText("");
                genderRadioGroup.clearCheck();
                birthdateEditText.setText("");
                phoneNumberEditText.setText("");
                emailAddressEditText.setText("");
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get values from input fields
                String firstName = firstNameEditText.getText().toString().trim();
                String lastName = lastNameEditText.getText().toString().trim();
                String name = firstName.concat(" ").concat(lastName);
                int genderRadioButtonId = genderRadioGroup.getCheckedRadioButtonId();
                String gender = "";
                if (genderRadioButtonId == maleRadioButton.getId()) {
                    gender = "Male";
                } else if (genderRadioButtonId == femaleRadioButton.getId()) {
                    gender = "Female";
                }
                String birthdate = birthdateEditText.getText().toString().trim();
                String phoneNumber = phoneNumberEditText.getText().toString().trim();
                String emailAddress = emailAddressEditText.getText().toString().trim();

                // Validate input fields
                if (firstName.isEmpty()) {
                    Toast.makeText(Activity_Registration.this, "Please enter first name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (lastName.isEmpty()) {
                    Toast.makeText(Activity_Registration.this, "Please enter last name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (gender.isEmpty()) {
                    Toast.makeText(Activity_Registration.this, "Please select gender", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (birthdate.isEmpty()) {
                    Toast.makeText(Activity_Registration.this, "Please enter birthdate", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (phoneNumber.isEmpty()) {
                    Toast.makeText(Activity_Registration.this, "Please enter phone number", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (emailAddress.isEmpty()) {
                    Toast.makeText(Activity_Registration.this, "Please enter email address", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Show success message to user
                Toast.makeText(Activity_Registration.this, "Registration Successful!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), Activity_Display.class);
                intent.putExtra("name_key", name);
                intent.putExtra("gender_key", gender);
                intent.putExtra("bdate_key", birthdate);
                intent.putExtra("phone_key", phoneNumber);
                intent.putExtra("email_key", emailAddress);
                startActivity(intent);
            }
        });
    }
}