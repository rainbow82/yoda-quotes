package com.example.android.yodaquotes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private QuoteBook quoteBook = new QuoteBook();
    private ColorWheel colorWheel = new ColorWheel();
    private TextView quoteTextView;
    private Button getQuoteButton;
    private RelativeLayout rootLayout;
    private CardView card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quote);
        getQuoteButton = findViewById(R.id.newQuoteButton);
        rootLayout = findViewById(R.id.rootLayout);
        card = findViewById(R.id.cardView);

        /*
            when button is clicked, select a new randomly generated quote
         */
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quote = quoteBook.getQuote();
                int color = colorWheel.getColor();
                quoteTextView.setText(quote);
                rootLayout.setBackgroundColor(color);
                getQuoteButton.setTextColor(color);
                card.setCardBackgroundColor(color);
            }
        };
        getQuoteButton.setOnClickListener(listener);

        Toast.makeText(this, getString(R.string.toastMessage), Toast.LENGTH_SHORT).show();
    }

}
