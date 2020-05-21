package br.com.cesar.replacecharacters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextPhrase = findViewById(R.id.edit_text_phrase);
        final Button buttonReplace = findViewById(R.id.button_replace);
        final TextView textViewResult = findViewById(R.id.text_view_result);

        buttonReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = Util.replaceWhiteSpaces(editTextPhrase.getText().toString(), "&32");
                textViewResult.setText(text);
            }
        });
    }

}