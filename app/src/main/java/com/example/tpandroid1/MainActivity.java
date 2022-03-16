package com.example.tpandroid1;

import static android.R.layout.simple_list_item_1;
import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;
import static android.widget.LinearLayout.HORIZONTAL;
import static android.widget.LinearLayout.VERTICAL;
import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.makeText;
import static com.example.tpandroid1.R.array.countries;
import static com.example.tpandroid1.R.drawable.student;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
//        implements View.OnClickListener
{

    public static final String COLON = " :";
    // layout params
    public static final LayoutParams PARAMS_MATCH_HORIZONTAL = new LayoutParams(
            MATCH_PARENT,
            WRAP_CONTENT);
    public static final LayoutParams PARAMS_WRAP = new LayoutParams(
            WRAP_CONTENT,
            WRAP_CONTENT);

    public static final int PADDING_LEFT = 20;
    public static final int PADDING_RIGHT = 20;
    public static final int PADDING_TOP = 20;
    public static final int PADDING_BOTTOM = 20;

    //layout
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
    private TextView countriesSelectionTextView;
    private Spinner countrySpinner;
    private ArrayAdapter countryArrayAdapter;

    // date
    private TextView dateTextView;
    private EditText dateEditText;

    // student image
    private ImageView academyImageView;

    // send button
    private Button sendButton;

    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialise Layout
        globalLayout = new LinearLayout(this);
        globalLayout.setOrientation(VERTICAL);
        globalLayout.setPadding(PADDING_LEFT,
                0,
                PADDING_RIGHT,
                0);

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
        LinearLayout formationLayout = new LinearLayout(this);
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


        // family situation
        LinearLayout familySituationLayout = new LinearLayout(this);
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


        // countriesSelection
        LinearLayout countriesSelectionLayout = new LinearLayout(this);
        countriesSelectionTextView = new TextView(this);
        countriesSelectionTextView.setText("Pays");
        globalLayout.addView(countriesSelectionTextView);

        countrySpinner = new Spinner(this);
        countryArrayAdapter = new ArrayAdapter(this,
                simple_list_item_1,
                getResources().getStringArray(countries));
        countrySpinner.setAdapter(countryArrayAdapter);
        globalLayout.addView(countrySpinner);

        // date
        LinearLayout dateLayout = new LinearLayout(this);
        dateTextView = new TextView(this);
        dateTextView.setText("Date");
        globalLayout.addView(dateTextView);
        dateEditText = new EditText(this);
        globalLayout.addView(dateEditText);

        // academy image
        LinearLayout academyImageLayout = new LinearLayout(this);
        academyImageView = new ImageView(this);
        academyImageView.setImageResource(student);
//        globalLayout.addView(academyImageView);

        // send bouton
        sendButton = new Button(this);
        sendButton.setText("envoyer");
//        sendButton.setOnClickListener(this);
        sendButton.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        makeText(getBaseContext(),
                                "information etudiant envoyé",
                                LENGTH_LONG).show();
                    }
                }

        );
        sendButton.setId(Integer.valueOf(1));
        globalLayout.addView(sendButton);


        button1 = new Button(this);
        button1.setText("enregistrer");
//        button1.setOnClickListener(this);
        button1.setId(Integer.valueOf(2));
        globalLayout.addView(button1);

        // affiche la UI
        setContentView(globalLayout);
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case 1:
//                makeText(this,
//                        "information etudiant envoyé",
//                        LENGTH_LONG).show();
//            case 2:
//                makeText(this,
//                        "information etudiant enregistré",
//                        LENGTH_LONG).show();
//
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + view.getId());
//        }
//    }
}