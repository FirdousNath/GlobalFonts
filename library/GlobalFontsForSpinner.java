package com.firdous.globalfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GlobalFontsForSpinner
  extends ArrayAdapter<String>
{
  Context ctx;
  String[] items;
  LayoutInflater mInflater;
  String fontname;
  
  public GlobalFontsForSpinner(Context context, int textViewResourceId, String[] objects, String fontname)
  {
    super(context, textViewResourceId, objects);
    
    this.ctx = context;
    this.items = objects;
    this.fontname = fontname;
    
    this.mInflater = ((LayoutInflater)context.getSystemService("layout_inflater"));
  }
  
  public View getDropDownView(int position, View convertView, ViewGroup parent)
  {
    View v = super.getDropDownView(position, convertView, parent);
    
    Typeface externalFont = Typeface.createFromAsset(this.ctx.getAssets(), this.fontname);
    ((TextView)v).setTypeface(externalFont);
    return v;
  }
  
  public View getView(int position, View convertView, ViewGroup parent)
  {
    View v = super.getView(position, convertView, parent);
    
    Typeface externalFont = Typeface.createFromAsset(this.ctx.getAssets(), this.fontname);
    ((TextView)v).setTypeface(externalFont);
    return v;
  }
}
