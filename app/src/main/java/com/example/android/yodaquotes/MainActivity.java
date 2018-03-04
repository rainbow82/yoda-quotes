package com.example.android.yodaquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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
                String[] quotes = {
                    "Once you start down the dark path, forever will it dominate your destiny, consume you it will.",
                    "Luminous beings are we, not this crude matter.",
                    "In a dark place we find ourselves, and a little more knowledge lights our way.",
                    "Fear is the path to the dark side. Fear leads to anger. Anger leads to hate. Hate leads to suffering.",
                    "Patience you must have, my young padawan.",
                    "When nine hundred years old you reach, look as good you will not.",
                    "Truly wonderful, the mind of a child is.",
                    "A Jedi uses the Force for knowledge and defense, never for attack.",
                    "Adventure. Excitement. A Jedi craves not these things.",
                    "No! Try not! Do or do not, there is no try.",
                    "Judge me by my size, do you?",
                    "Wars not make one great.",
                    "Clear your mind must be, if you are to find the villains behind this plot.",
                    "Always two there are, no more, no less. A master and an apprentice.",
                    "Always pass on what you have learned.",
                    "Mind what you have learned. Save you it can.",
                    "To answer power with power, the Jedi way this is not.",
                    "In this war, a danger there is, of losing who we are.",
                    "Attachment leads to jealously. The shadow of greed, that is."
                };

                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(quotes.length);
                String quote = quotes[randomNumber];
                quoteTextView.setText(quote);
            }
        };
        getQuoteButton.setOnClickListener(listener);


    }

}
