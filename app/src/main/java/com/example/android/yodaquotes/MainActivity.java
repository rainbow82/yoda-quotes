package com.example.android.yodaquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView quoteTextView;
    private Button getQuoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quote);
        getQuoteButton = findViewById(R.id.newQuoteButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quote = "Luminous beings are we, not this crude matter.";
                quoteTextView.setText(quote);
            }
        };
        getQuoteButton.setOnClickListener(listener);


    }

}
