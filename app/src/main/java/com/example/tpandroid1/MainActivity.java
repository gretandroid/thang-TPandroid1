package com.example.tpandroid1;

import static android.R.layout.simple_list_item_1;
import static android.widget.LinearLayout.HORIZONTAL;
import static android.widget.LinearLayout.VERTICAL;
import static com.example.tpandroid1.R.array.countries;
import static com.example.tpandroid1.R.drawable.student;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;

    TextView lastNameTextView;
    TextView fistNameTextView;
    EditText fistNameEditText;
    EditText lastNameEditText;

    TextView formationTextView;
    CheckBox germanCheckBox;
    CheckBox englishCheckBox;
    CheckBox frenchCheckBox;
    CheckBox italianCheckBox;

    TextView familySituationTextView;
    RadioGroup familySituationRadioGroup;
    RadioButton marriedRadioButton;
    RadioButton singleRadioButton;
    RadioButton divorcedRadioButton;
    RadioButton widowerRadioButton;

    TextView countryListTextView;
    Spinner countrySpinner;
    ArrayAdapter countryArrayAdapter;

    TextView dateTextView;
    EditText dateEditText;

    ImageView studentImageView;

    LinearLayout.LayoutParams layoutParams;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        linearLayout = new LinearLayout(this);

        //identification
        lastNameTextView = new TextView(this);
        lastNameTextView.setText("Nom");
        linearLayout.addView(lastNameTextView);

        lastNameEditText = new EditText(this);
        linearLayout.addView(lastNameEditText);

        fistNameTextView = new TextView(this);
        fistNameTextView.setText("prénom");
        linearLayout.addView(fistNameTextView);

        fistNameEditText = new EditText(this);
        linearLayout.addView(fistNameEditText);


        //formation
        formationTextView = new TextView(this);
        formationTextView.setText("Formation");
        linearLayout.addView(formationTextView);

        germanCheckBox = new CheckBox(this);
        germanCheckBox.setText("Allemand");
        linearLayout.addView(germanCheckBox);

        englishCheckBox = new CheckBox(this);
        englishCheckBox.setText("Anglais");
        linearLayout.addView(englishCheckBox);

        frenchCheckBox = new CheckBox(this);
        frenchCheckBox.setText("Français");
        linearLayout.addView(frenchCheckBox);

        italianCheckBox = new CheckBox(this);
        italianCheckBox.setText("Italien");
        linearLayout.addView(italianCheckBox);


        //family situation
        familySituationTextView = new EditText(this);
        familySituationTextView.setText("Situation Familiale");
        linearLayout.addView(familySituationTextView);

        familySituationRadioGroup = new RadioGroup(this);
        familySituationRadioGroup.setOrientation(HORIZONTAL);
        linearLayout.addView(familySituationRadioGroup);

        marriedRadioButton = new RadioButton(this);
        marriedRadioButton.setText("Marié");
        familySituationRadioGroup.addView(marriedRadioButton);

        singleRadioButton = new RadioButton(this);
        singleRadioButton.setText("Célibataire");
        familySituationRadioGroup.addView(singleRadioButton);

        divorcedRadioButton = new RadioButton(this);
        divorcedRadioButton.setText("Divorcé");
        familySituationRadioGroup.addView(divorcedRadioButton);

        widowerRadioButton = new RadioButton(this);
        widowerRadioButton.setText("Veuf");
        familySituationRadioGroup.addView(widowerRadioButton);


        //country
        countryListTextView = new TextView(this);
        countryListTextView.setText("Pays");
        linearLayout.addView(countryListTextView);

        countrySpinner = new Spinner(this);
        countryArrayAdapter = new ArrayAdapter(this,
                simple_list_item_1,
                getResources().getStringArray(countries));
        countrySpinner.setAdapter(countryArrayAdapter);
        linearLayout.addView(countrySpinner);

        //date
        dateTextView = new TextView(this);
        dateTextView.setText("Date");
        linearLayout.addView(dateTextView);
        dateEditText = new EditText(this);
        linearLayout.addView(dateEditText);

        //image
        studentImageView = new ImageView(this);
        studentImageView.setImageResource(student);
        linearLayout.addView(studentImageView);

        linearLayout.setOrientation(VERTICAL);
        setContentView(linearLayout);
    }
}