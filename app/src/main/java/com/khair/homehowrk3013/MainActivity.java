package com.khair.homehowrk3013;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay=findViewById(R.id.tvDisplay);


        Shape Circle =new Circle(5);
        tvDisplay.append("\nCircle Area :"+Circle.getArea());
        tvDisplay.append("\n Circle Perimeter :"+Circle.getPerimeter());
        Shape Rectangle=new Rectangle(10,12);
        tvDisplay.append("\n\n Rectangle Area :"+Rectangle.getArea());
        tvDisplay.append("\n Rectangle Perimeter :"+Rectangle.getPerimeter());
        Shape Triangle=new Triangle(7,8,6);
        tvDisplay.append("\n\n Triangle Area :"+Triangle.getArea());
        tvDisplay.append("\n Triangle Perimeter :"+Triangle.getPerimeter());



    }
}