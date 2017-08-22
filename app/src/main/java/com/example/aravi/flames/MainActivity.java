package com.example.aravi.flames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.aravi.flames";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view)
    {
        Intent intent = new Intent( this, DisplayMessageActivity.class );
        EditText editText1 = (EditText) findViewById(R.id.editText3);
        EditText editText2 = (EditText) findViewById(R.id.editText4);
        String boyName = editText1.getText().toString();
        String girlName = editText2.getText().toString();
        FlamesStriker flamesStrikerObject = new FlamesStriker();
        String message = flamesStrikerObject.flamesStrikerMethod(boyName.toLowerCase(), girlName.toLowerCase());
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
