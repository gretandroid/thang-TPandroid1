package com.example.tpandroid1;

import static android.widget.LinearLayout.LayoutParams.MATCH_PARENT;
import static android.widget.LinearLayout.LayoutParams.WRAP_CONTENT;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
public class MainActivity extends AppCompatActivity {
    public static final String COLON = " :";
    public static final LinearLayout.LayoutParams PARAMS_MATCH_HORIZONTAL = new LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT);
    public static final LinearLayout.LayoutParams PARAMS_WRAP = new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT);
    public static final int PADDING_LEFT = 20;
    public static final int PADDING_RIGHT= 20;
    public static final int PADDING_TOP = 20;
    public static final int PADDING_BOTTOM= 20;
    public static final String SPACE = " ";
    public static final String EMPTY = "";
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

    // Button
    private Button sendButton;
    private Button saveButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // init layout
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(PADDING_LEFT, 0, PADDING_RIGHT, 0);

        // surname
        surnameLayout = new LinearLayout(this);
        surnameLayout.setPadding(PADDING_LEFT, PADDING_TOP, PADDING_RIGHT, 0);

        surnameLabel = new TextView(this);
        surnameLabel.setText(getString(R.string.surname) + COLON);
        surnameText = new EditText(this);
        surnameText.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        surnameLayout.addView(surnameLabel);
        surnameLayout.addView(surnameText);
        surnameLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        layout.addView(surnameLayout);

        // name
        nameLayout = new LinearLayout(this);
        nameLayout.setPadding(PADDING_LEFT, PADDING_TOP, PADDING_RIGHT, 0);

        nameLabel = new TextView(this);
        nameLabel.setText(getString(R.string.name) + COLON);
        nameText = new EditText(this);
        nameText.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        nameLayout.addView(nameLabel);
        nameLayout.addView(nameText);
        nameLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        layout.addView(nameLayout);

        // formation
        // TODO using for on a resource array string
        formationLayout = new LinearLayout(this);
        formationLayout.setPadding(PADDING_LEFT, PADDING_TOP, PADDING_RIGHT, 0);

        formationLabel = new TextView(this);
        formationLabel.setText(getString(R.string.formation) + COLON);
        formationLabel.setLayoutParams(PARAMS_MATCH_HORIZONTAL);

        formationCheckLayout = new LinearLayout(this);
        formationCheckLayout.setPadding(PADDING_LEFT, PADDING_TOP, PADDING_RIGHT, 0);

        englishCheck = new CheckBox(this);
        englishCheck.setText(R.string.english);
        frenchCheck = new CheckBox(this);
        frenchCheck.setText(R.string.french);
        italyCheck = new CheckBox(this);
        italyCheck.setText(R.string.italian);
        spainCheck = new CheckBox(this);
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
        marriageLayout = new LinearLayout(this);
        marriageLayout.setPadding(PADDING_LEFT, PADDING_TOP, PADDING_RIGHT, 0);

        marriageLabel = new TextView(this);
        marriageLabel.setText(getString(R.string.marriageStatus) + COLON);
        marriageLabel.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        marriageGroup = new RadioGroup(this);
        marriageGroup.setPadding(PADDING_LEFT, PADDING_TOP, PADDING_RIGHT, 0);

        marriedRadio = new RadioButton(this);
        marriedRadio.setText(R.string.married);
        singleRadio = new RadioButton(this);
        singleRadio.setText(R.string.single);
        divorcedRadio = new RadioButton(this);
        divorcedRadio.setText(R.string.divorced);
        widowerRadio = new RadioButton(this);
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
        countryLayout = new LinearLayout(this);
        countryLayout.setPadding(PADDING_LEFT, PADDING_TOP, PADDING_RIGHT, 0);

        countryLabel = new TextView(this);
        countryLabel.setText(getString(R.string.country) + COLON);
        countryLabel.setLayoutParams(PARAMS_WRAP);
        countrySpinner = new Spinner(this);
        countrySpinner.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries));
        countrySpinner.setLayoutParams(PARAMS_WRAP);
        countryLayout.addView(countryLabel);
        countryLayout.addView(countrySpinner);
        countryLayout.setLayoutParams(PARAMS_MATCH_HORIZONTAL);
        layout.addView(countryLayout);

        // date
        dateLayout = new LinearLayout(this);
        dateLayout.setPadding(PADDING_LEFT, PADDING_TOP, PADDING_RIGHT, 0);

        dateLabel = new TextView(this);
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
//        layout.addView(imageView);

        // Buttons
        sendButton = new Button(this);
        sendButton.setText("Send");
//        sendButton.setId((int)1);
//        sendButton.setOnClickListener(this); // use MainActivity.onClick
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Hello Send", Toast.LENGTH_LONG).show();
            }
        });

        layout.addView(sendButton);

        saveButton = new Button(this);
        saveButton.setText("Save");
//        sendButton.setId((int)2);
//        saveButton.setOnClickListener(this); // use MainActivity.onClick
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // name, surname
                String surname = surnameText.getText().toString();
                String name = nameText.getText().toString();

                // formation choices
                List<String> formationChoices = new ArrayList<>();
                if (englishCheck.isChecked()) {
                    formationChoices.add(englishCheck.getText().toString());
                }
                if (frenchCheck.isChecked()) {
                    formationChoices.add(frenchCheck.getText().toString());
                }
                if (italyCheck.isChecked()) {
                    formationChoices.add(italyCheck.getText().toString());
                }
                if (spainCheck.isChecked()) {
                    formationChoices.add(spainCheck.getText().toString());
                }

                // country selection
                String country = countrySpinner.getSelectedItem().toString();

                // compose info
                String info = name
                        + SPACE + surname
                        + (formationChoices.isEmpty() ? EMPTY : SPACE + formationChoices)
                        + SPACE + country;

                Toast.makeText(getBaseContext(), "Saved" + SPACE + info, Toast.LENGTH_LONG).show();

            }
        });
        layout.addView(saveButton);

//        setContentView(R.layout.activity_main);
        setContentView(layout);
    }

//    @Override
//    public void onClick(View view) {
//        if (view.getId() == sendButton.getId()) {
//            // Popup
//            Toast.makeText(this, "Hello Send", Toast.LENGTH_LONG).show();
//        }
//
//        if (view.getId() == saveButton.getId()) {
//            // Popup
//            Toast.makeText(this, "Hello Save", Toast.LENGTH_LONG).show();
//        }
//    }
}