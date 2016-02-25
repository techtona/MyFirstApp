package id.techtona.myfirstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editPanjang;
    EditText editLebar;
    RadioButton radioPersegi;
    RadioButton radioSegitiga;
    Button reset;
    Button luas;
    Button keliling;
    TextView hasil;
    double dataPanjang;
    double dataLebar;
    double hah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        editPanjang = (EditText) findViewById(R.id.editTextPanjang);
        editLebar = (EditText) findViewById(R.id.editTextLebar);

        radioPersegi = (RadioButton) findViewById(R.id.radioButtonPersegi);
        radioSegitiga= (RadioButton) findViewById(R.id.radioButtonSegitiga);

        reset = (Button) findViewById(R.id.buttonReset);
        luas = (Button) findViewById(R.id.buttonLuas);
        keliling = (Button) findViewById(R.id.buttonKeliling);

        hasil = (TextView) findViewById(R.id.textViewHasil);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editPanjang.setText("");
                editLebar.setText("");

            }
        });

            if (radioPersegi.isChecked()){
                luas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dataLebar = Double.parseDouble(editLebar.getText().toString());
                        dataPanjang = Double.parseDouble(editPanjang.getText().toString());
                        hah = dataLebar*dataPanjang;
                        hasil.setText(hah+"");
                    }
                });
                keliling.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dataLebar = Double.parseDouble(editLebar.getText().toString());
                        dataPanjang = Double.parseDouble(editPanjang.getText().toString());
                        hah = (dataLebar+dataPanjang)*2;
                        hasil.setText(hah+"");
                    }
                });
            }
            else if(radioSegitiga.isChecked()){
                luas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dataLebar = Double.parseDouble(editLebar.getText().toString());
                        dataPanjang = Double.parseDouble(editPanjang.getText().toString());
                        hah = (dataLebar*dataPanjang)*0.5;
                        hasil.setText(hah+"");
                    }
                });
                keliling.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dataLebar = Double.parseDouble(editLebar.getText().toString());
                        dataPanjang = Double.parseDouble(editPanjang.getText().toString());
                        hah = dataPanjang+(dataLebar*2);
                        hasil.setText(hah+"");
                    }
                });
            }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
