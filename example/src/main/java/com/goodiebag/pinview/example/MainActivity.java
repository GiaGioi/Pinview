package com.goodiebag.pinview.example;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.goodiebag.pinview.Pinview;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private EditText edT1;
    private EditText edT2;
    private EditText edT3;
    private EditText edT4;
    private EditText edT5;
    private EditText edT6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linear_text_change);
        edT1 = findViewById(R.id.edT1);
        edT2 = findViewById(R.id.edT2);
        edT3 = findViewById(R.id.edT3);
        edT4 = findViewById(R.id.edT4);
        edT5 = findViewById(R.id.edT5);
        edT6 = findViewById(R.id.edT6);

        EditText[] edit = {edT1, edT2, edT3, edT4, edT5, edT6};

        edT1.addTextChangedListener(new GenericTextWatcher(edT1, edit));
        edT2.addTextChangedListener(new GenericTextWatcher(edT2, edit));
        edT3.addTextChangedListener(new GenericTextWatcher(edT3, edit));
        edT4.addTextChangedListener(new GenericTextWatcher(edT4, edit));
        edT5.addTextChangedListener(new GenericTextWatcher(edT5, edit));
        edT6.addTextChangedListener(new GenericTextWatcher(edT6, edit));


    }
}
