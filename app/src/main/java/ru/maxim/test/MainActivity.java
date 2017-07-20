package ru.maxim.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    TextView textView;
    TextView textView2;
    ToggleButton toggleButton;
    Switch aSwitch;
    Spinner spinner;
    Button buttonSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = (TextView) findViewById(R.id.textView2);
        textView = (TextView) findViewById(R.id.textView);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        aSwitch = (Switch) findViewById(R.id.switch1);
        spinner = (Spinner) findViewById(R.id.spinner);
        buttonSpinner = (Button) findViewById(R.id.button);

        aSwitch.setOnCheckedChangeListener(this);
        toggleButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.switch1:
                if(isChecked){
                    textView2.setText("Switch ВКЛ");
                }else{
                    textView2.setText("Switch ВЫКЛ");
                }
                break;
            case R.id.toggleButton:
                if(isChecked){
                    textView.setText("Кнопка ВКЛ");
                }else{
                    textView.setText("Кнопка ВЫКЛ");
                }
                break;

        }
    }

    public void onClickSpinnerButton(View view) {
        String text = String.valueOf(spinner.getSelectedItem());
        Toast toast = Toast.makeText(getApplicationContext(),"Выбран: " + text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickNextPage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
