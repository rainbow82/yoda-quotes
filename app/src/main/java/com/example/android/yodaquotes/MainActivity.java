package com.example.android.yodaquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private QuoteBook quoteBook = new QuoteBook();
    private TextView quoteTextView;
    private Button getQuoteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quote);
        getQuoteButton = findViewById(R.id.newQuoteButton);


        /*
            when button is clicked, select a new randomly generated quote
         */
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quote = quoteBook.getQuote();
                quoteTextView.setText(quote);
            }
        };
        getQuoteButton.setOnClickListener(listener);


    }

}
