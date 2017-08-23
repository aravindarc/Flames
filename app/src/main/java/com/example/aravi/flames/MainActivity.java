package com.example.aravi.flames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.aravi.flames";
    private static String boyName, girlName;
    EditText editText1, editText2;
    Intent intent;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText1.addTextChangedListener( watcher );
        editText2.addTextChangedListener( watcher );
        button = (Button) findViewById(R.id.button);
        button.setEnabled( false );//Initially the button is not enabled
    }

    //only when both the fields are not empty will the button be enabled
    private final TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if( editText1.length() == 0 || editText2.length() == 0 )
                button.setEnabled( false );
            else
                button.setEnabled( true );
        }
    };

    //when the button is pressed the displayMessage activity is started
    public void sendMessage(View view)
    {
        boyName = editText1.getText().toString();
        girlName = editText2.getText().toString();
        intent = new Intent(this, DisplayMessageActivity.class);
        FlamesStriker flamesStrikerObject = new FlamesStriker();
        String message = flamesStrikerObject.flamesStrikerMethod(boyName.toLowerCase(), girlName.toLowerCase());
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
