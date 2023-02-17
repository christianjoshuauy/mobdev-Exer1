package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MyActivity_1_Circle extends AppCompatActivity {

    Button btnCalculate;
    TextView txtArea, txtCircumference;
    EditText txtRadius;
    Circle circle = new Circle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activity1_circle);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        txtRadius = (EditText) findViewById(R.id.txtRadius);
        txtArea = (TextView) findViewById(R.id.txtArea);
        txtCircumference = (TextView) findViewById(R.id.txtCircumference);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.##");

                // Set Radius
                double radius = Double.parseDouble(String.valueOf(txtRadius.getText()));
                circle.setRadius(radius);

                // Compute Area and Circumference
                double area = circle.getArea();
                double circumference = circle.getCircumference();

                txtArea.setText(df.format(area));
                txtCircumference.setText(df.format(circumference));

                Toast.makeText(MyActivity_1_Circle.this, "Area and Circumference of the circle has been computed!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}