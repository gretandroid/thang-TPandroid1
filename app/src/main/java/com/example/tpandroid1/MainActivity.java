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
    private LinearLayout globalLayout;

    // identification
    private LinearLayout identificationLayout;
    private TextView lastNameTextView;
    private TextView fistNameTextView;
    private EditText fistNameEditText;
    private EditText lastNameEditText;

    // formation
    private TextView formationTextView;
    private CheckBox germanCheckBox;
    private CheckBox englishCheckBox;
    private CheckBox frenchCheckBox;
    private CheckBox italianCheckBox;

    // family situation
    private TextView familySituationTextView;
    private RadioGroup familySituationRadioGroup;
    private RadioButton marriedRadioButton;
    private RadioButton singleRadioButton;
    private RadioButton divorcedRadioButton;
    private RadioButton widowerRadioButton;

    // country list
    private TextView countryListTextView;
    private Spinner countrySpinner;
    private ArrayAdapter countryArrayAdapter;

    // date
    private TextView dateTextView;
    private EditText dateEditText;

    // student image
    private ImageView studentImageView;

    // layout params
    private LinearLayout.LayoutParams layoutParams;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        globalLayout = new LinearLayout(this);
        globalLayout.setOrientation(VERTICAL);

        //identification
        LinearLayout identificationLayout = new LinearLayout(this);
        lastNameTextView = new TextView(this);
        lastNameTextView.setText("Nom");
        identificationLayout.addView(lastNameTextView);

        lastNameEditText = new EditText(this);
        globalLayout.addView(lastNameEditText);

        fistNameTextView = new TextView(this);
        fistNameTextView.setText("prénom");
        globalLayout.addView(fistNameTextView);

        fistNameEditText = new EditText(this);
        globalLayout.addView(fistNameEditText);


        //formation
        formationTextView = new TextView(this);
        formationTextView.setText("Formation");
        globalLayout.addView(formationTextView);

        germanCheckBox = new CheckBox(this);
        germanCheckBox.setText("Allemand");
        globalLayout.addView(germanCheckBox);

        englishCheckBox = new CheckBox(this);
        englishCheckBox.setText("Anglais");
        globalLayout.addView(englishCheckBox);

        frenchCheckBox = new CheckBox(this);
        frenchCheckBox.setText("Français");
        globalLayout.addView(frenchCheckBox);

        italianCheckBox = new CheckBox(this);
        italianCheckBox.setText("Italien");
        globalLayout.addView(italianCheckBox);


        //family situation
        familySituationTextView = new EditText(this);
        familySituationTextView.setText("Situation Familiale");
        globalLayout.addView(familySituationTextView);


        familySituationRadioGroup = new RadioGroup(this);
        familySituationRadioGroup.setOrientation(HORIZONTAL);
        globalLayout.addView(familySituationRadioGroup);

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
        globalLayout.addView(countryListTextView);

        countrySpinner = new Spinner(this);
        countryArrayAdapter = new ArrayAdapter(this,
                simple_list_item_1,
                getResources().getStringArray(countries));
        countrySpinner.setAdapter(countryArrayAdapter);
        globalLayout.addView(countrySpinner);

        //date
        dateTextView = new TextView(this);
        dateTextView.setText("Date");
        globalLayout.addView(dateTextView);
        dateEditText = new EditText(this);
        globalLayout.addView(dateEditText);

        //image
        studentImageView = new ImageView(this);
        studentImageView.setImageResource(student);
        globalLayout.addView(studentImageView);


        setContentView(globalLayout);
    }
}