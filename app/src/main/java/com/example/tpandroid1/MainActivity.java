package com.example.tpandroid1;

import static android.widget.LinearLayout.LayoutParams.MATCH_PARENT;
import static android.widget.LinearLayout.LayoutParams.WRAP_CONTENT;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String COLON = " :";
    private LinearLayout layout;

    // surname
    private LinearLayout surnameLayout;
    private TextView surnameLabel;
    private EditText surnameText;

    // name
    private LinearLayout nameLayout;
    private TextView nameLabel;
    private EditText nameText;

    // formation
    private LinearLayout formationLayout;
    private TextView formationLabel;
    private LinearLayout formationCheckLayout;
    private CheckBox englishCheck;
    private CheckBox frenchCheck;
    private CheckBox italyCheck;
    private CheckBox spainCheck;

    // marriage status
    private LinearLayout marriageLayout;
    private TextView marriageLabel;
    private RadioGroup marriageGroup;
    private RadioButton marriedRadio;
    private RadioButton singleRadio;
    private RadioButton divorcedRadio;
    private RadioButton widowerRadio;

    // country
    private LinearLayout countryLayout;
    private TextView countryLabel;
    private Spinner countrySpinner;

    // date
    private LinearLayout dateLayout;
    private TextView dateLabel;
    private EditText dateText;

    // image
    private ImageView imageView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // init layout
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        // surname
        LinearLayout surnameLayout = new LinearLayout(this);
        TextView surnameLabel = new TextView(this);
        surnameLabel.setText(getString(R.string.surname) + COLON);
        EditText surnameText = new EditText(this);
        surnameText.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        surnameLayout.addView(surnameLabel);
        surnameLayout.addView(surnameText);
        surnameLayout.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        layout.addView(surnameLayout);

        // name
        LinearLayout nameLayout = new LinearLayout(this);
        TextView nameLabel = new TextView(this);
        nameLabel.setText(getString(R.string.name) + COLON);
        EditText nameText = new EditText(this);
        nameText.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        nameLayout.addView(nameLabel);
        nameLayout.addView(nameText);
        nameLayout.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        layout.addView(nameLayout);

        // formation
        LinearLayout formationLayout = new LinearLayout(this);
        TextView formationLabel = new TextView(this);
        formationLabel.setText(getString(R.string.formation) + COLON);
        formationLabel.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));

        LinearLayout formationCheckLayout = new LinearLayout(this);
        CheckBox englishCheck = new CheckBox(this);
        englishCheck.setText("English");
        CheckBox frenchCheck = new CheckBox(this);
        frenchCheck.setText("French");
        CheckBox italyCheck = new CheckBox(this);
        italyCheck.setText("Italian");
        CheckBox spainCheck = new CheckBox(this);
        spainCheck.setText("Spanish");
        formationCheckLayout.addView(englishCheck);
        formationCheckLayout.addView(frenchCheck);
        formationCheckLayout.addView(italyCheck);
        formationCheckLayout.addView(spainCheck);
        formationCheckLayout.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));

        formationLayout.addView(formationLabel);
        formationLayout.addView(formationCheckLayout);
        formationLayout.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        formationLayout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(formationLayout);

        // marriage status
        LinearLayout marriageLayout = new LinearLayout(this);
        TextView marriageLabel = new TextView(this);
        marriageLabel.setText(getString(R.string.marriageStatus) + COLON);
        marriageLabel.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        RadioGroup marriageGroup = new RadioGroup(this);
        RadioButton marriedRadio = new RadioButton(this);
        marriedRadio.setText("Married");
        RadioButton singleRadio = new RadioButton(this);
        singleRadio.setText("Single");
        RadioButton divorcedRadio = new RadioButton(this);
        divorcedRadio.setText("Divorced");
        RadioButton widowerRadio = new RadioButton(this);
        widowerRadio.setText("Widowner");
        marriageGroup.addView(marriedRadio);
        marriageGroup.addView(singleRadio);
        marriageGroup.addView(divorcedRadio);
        marriageGroup.addView(widowerRadio);
        marriageGroup.setOrientation(LinearLayout.HORIZONTAL);

        marriageLayout.addView(marriageLabel);
        marriageLayout.addView(marriageGroup);
        marriageLayout.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        marriageLayout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(marriageLayout);

        // country model
        String[] countries = getResources().getStringArray(R.array.countries);
        // country
        LinearLayout countryLayout = new LinearLayout(this);
        TextView countryLabel = new TextView(this);
        countryLabel.setText(getString(R.string.country) + COLON);
        countryLabel.setLayoutParams(new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
        Spinner countrySpinner = new Spinner(this);
        countrySpinner.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries));
        countrySpinner.setLayoutParams(new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
        countryLayout.addView(countryLabel);
        countryLayout.addView(countrySpinner);
        countryLayout.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        layout.addView(countryLayout);

        // date
        LinearLayout dateLayout = new LinearLayout(this);
        TextView dateLabel = new TextView(this);
        dateLabel.setText("Date" + COLON);
        dateLayout.setLayoutParams(new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
        dateText = new EditText(this);
        dateText.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        dateLayout.addView(dateLabel);
        dateLayout.addView(dateText);
        dateLayout.setLayoutParams(new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT));
        dateLayout.setOrientation(LinearLayout.HORIZONTAL);
        layout.addView(dateLayout);

        // image
        imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.raw);
        layout.addView(imageView);

//        setContentView(R.layout.activity_main);
        setContentView(layout);
    }
}