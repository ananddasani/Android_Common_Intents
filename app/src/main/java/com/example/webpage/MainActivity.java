package com.example.webpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText fetchURL;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchURL = findViewById(R.id.fetchURL);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

              @Override
              public void onClick(View v) {
                  //get the url form the user
                  String url = fetchURL.getText().toString();

                  //parse the url
                  Uri webpage = Uri.parse(url);

                  Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                  if (intent.resolveActivity(getPackageManager()) != null)
                      startActivity(intent);
              }
          }
        );
    }
}