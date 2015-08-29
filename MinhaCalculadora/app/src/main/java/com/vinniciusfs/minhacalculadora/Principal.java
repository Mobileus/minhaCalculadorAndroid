package com.vinniciusfs.minhacalculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Principal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    public void soma(View v){

        double num1,num2,res;

        EditText edt1 = (EditText) findViewById(R.id.edt1);
        EditText edt2 = (EditText) findViewById(R.id.edt2);

        num1 = Double.valueOf(edt1.getText().toString());
        num2 = Double.valueOf(edt2.getText().toString());
        res = num1 + num2;

        TextView txv = (TextView) findViewById(R.id.res);

        txv.setText(String.format("%.2f", res));

    }

    public void sub(View v){

        double num1,num2,res;

        EditText edt1 = (EditText) findViewById(R.id.edt1);
        EditText edt2 = (EditText) findViewById(R.id.edt2);

        num1 = Double.valueOf(edt1.getText().toString());
        num2 = Double.valueOf(edt2.getText().toString());
        res = num1 - num2;

        TextView txv = (TextView) findViewById(R.id.res);

        txv.setText(String.format("%.2f",res));

    }

    public void mult(View v){

        double num1,num2,res;

        EditText edt1 = (EditText) findViewById(R.id.edt1);
        EditText edt2 = (EditText) findViewById(R.id.edt2);

        num1 = Double.valueOf(edt1.getText().toString());
        num2 = Double.valueOf(edt2.getText().toString());
        res = num1 * num2;

        TextView txv = (TextView) findViewById(R.id.res);

        txv.setText(String.format("%.2f",res));

    }

    public void div(View v){

        double num1,num2,res;

        EditText edt1 = (EditText) findViewById(R.id.edt1);
        EditText edt2 = (EditText) findViewById(R.id.edt2);

        num1 = Double.valueOf(edt1.getText().toString());
        num2 = Double.valueOf(edt2.getText().toString());
        if (num2 != 0) {
            res = num1 / num2;

            TextView txv = (TextView) findViewById(R.id.res);

            txv.setText(String.format("%.2f",res));

        }

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
