package com.firdous.globalfonts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import com.firdous.globalfonts.GlobalFonts;
import com.firdous.globalfonts.GlobalFontsForSpinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout root = (RelativeLayout)findViewById(R.id.root);
        GlobalFonts.setFontstoAllViews(this, root, "Linotype - DINNextLTPro-UltraLight.otf", Color.BLACK);

        Button button=(Button)findViewById(R.id.button);
        Spinner s=(Spinner)findViewById(R.id.s);
        CheckBox checkBox=(CheckBox)findViewById(R.id.checkBox);
        String items[]={"Global ","Fonts"};
        s.setAdapter(new GlobalFontsForSpinner(this,R.layout.support_simple_spinner_dropdown_item,items,"Linotype - DINNextLTPro-UltraLight.otf"));
        GlobalFonts.setFontstoButton(this, button, "DINPro.otf", Color.BLACK);
        GlobalFonts.setFontstoCheckbox(this, checkBox, "segoeui.ttf", Color.BLACK);
    }
}
