package com.example.tpandroid1;

import static android.widget.LinearLayout.LayoutParams.MATCH_PARENT;
import static android.widget.LinearLayout.LayoutParams.WRAP_CONTENT;
import androidx.appcompat.app.AppCompatActivity;

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

public class MainActivity extends AppCompatActivity {
    public static final String COLON = " :";
    public static final LinearLayout.LayoutParams PARAMS_MATCH_HORIZONTAL = new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT);
    public static final LinearLayout.LayoutParams PARAMS_WRAP = new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT);
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
        surnameText.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        surnameLayout.addView(surnameLabel);
        surnameLayout.addView(surnameText);
        surnameLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        layout.addView(surnameLayout);

        // name
        LinearLayout nameLayout = new LinearLayout(this);
        TextView nameLabel = new TextView(this);
        nameLabel.setText(getString(R.string.name) + COLON);
        EditText nameText = new EditText(this);
        nameText.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        nameLayout.addView(nameLabel);
        nameLayout.addView(nameText);
        nameLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        layout.addView(nameLayout);

        // formation
        // TODO using for on a resource array string
        LinearLayout formationLayout = new LinearLayout(this);
        TextView formationLabel = new TextView(this);
        formationLabel.setText(getString(R.string.formation) + COLON);
        formationLabel.setLayoutParams(PARAMS_MATCH_HORIZONTAL);

        LinearLayout formationCheckLayout = new LinearLayout(this);
        CheckBox englishCheck = new CheckBox(this);
        englishCheck.setText(R.string.english);
        CheckBox frenchCheck = new CheckBox(this);
        frenchCheck.setText(R.string.french);
        CheckBox italyCheck = new CheckBox(this);
        italyCheck.setText(R.string.italian);
        CheckBox spainCheck = new CheckBox(this);
        spainCheck.setText(R.string.spanish);
        formationCheckLayout.addView(englishCheck);
        formationCheckLayout.addView(frenchCheck);
        formationCheckLayout.addView(italyCheck);
        formationCheckLayout.addView(spainCheck);
        formationCheckLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);

        formationLayout.addView(formationLabel);
        formationLayout.addView(formationCheckLayout);
        formationLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        formationLayout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(formationLayout);

        // marriage status
        // TODO using for on a resource array string
        LinearLayout marriageLayout = new LinearLayout(this);
        TextView marriageLabel = new TextView(this);
        marriageLabel.setText(getString(R.string.marriageStatus) + COLON);
        marriageLabel.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        RadioGroup marriageGroup = new RadioGroup(this);
        RadioButton marriedRadio = new RadioButton(this);
        marriedRadio.setText(R.string.married);
        RadioButton singleRadio = new RadioButton(this);
        singleRadio.setText(R.string.single);
        RadioButton divorcedRadio = new RadioButton(this);
        divorcedRadio.setText(R.string.divorced);
        RadioButton widowerRadio = new RadioButton(this);
        widowerRadio.setText(R.string.widowner);
        marriageGroup.addView(marriedRadio);
        marriageGroup.addView(singleRadio);
        marriageGroup.addView(divorcedRadio);
        marriageGroup.addView(widowerRadio);
        marriageGroup.setOrientation(LinearLayout.HORIZONTAL);

        marriageLayout.addView(marriageLabel);
        marriageLayout.addView(marriageGroup);
        marriageLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        marriageLayout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(marriageLayout);

        // country model
        String[] countries = getResources().getStringArray(R.array.countries);
        // country
        LinearLayout countryLayout = new LinearLayout(this);
        TextView countryLabel = new TextView(this);
        countryLabel.setText(getString(R.string.country) + COLON);
        countryLabel.setLayoutParams(PARAMS_WRAP);
        Spinner countrySpinner = new Spinner(this);
        countrySpinner.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries));
        countrySpinner.setLayoutParams(PARAMS_WRAP);
        countryLayout.addView(countryLabel);
        countryLayout.addView(countrySpinner);
        countryLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        layout.addView(countryLayout);

        // date
        LinearLayout dateLayout = new LinearLayout(this);
        TextView dateLabel = new TextView(this);
        dateLabel.setText("Date" + COLON);
        dateLayout.setLayoutParams(PARAMS_WRAP);
        dateText = new EditText(this);
        dateText.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        dateLayout.addView(dateLabel);
        dateLayout.addView(dateText);
        dateLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
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