package com.firdous.globalfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class GlobalFonts
{
  public static void setFontstoAllViews(Context context, View v, String fontname, int color)
  {
    if ((v instanceof ViewGroup))
    {
      ViewGroup vg = (ViewGroup)v;
      for (int i = 0; i < vg.getChildCount(); i++)
      {
        View child = vg.getChildAt(i);
        setFontstoAllViews(context, child, fontname, color);
      }
    }
    else if ((v instanceof TextView))
    {
      ((TextView)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((TextView)v).setTextColor(color);
    }
    if ((v instanceof Button))
    {
      ((Button)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((Button)v).setTextColor(color);
    }
    if ((v instanceof EditText))
    {
      ((EditText)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((EditText)v).setTextColor(color);
    }
    if ((v instanceof CheckBox))
    {
      ((CheckBox)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((CheckBox)v).setTextColor(color);
    }
    if ((v instanceof RadioButton))
    {
      ((RadioButton)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((RadioButton)v).setTextColor(color);
    }
    if ((v instanceof Switch))
    {
      ((Switch)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((Switch)v).setTextColor(color);
    }
    if ((v instanceof ToggleButton))
    {
      ((ToggleButton)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((ToggleButton)v).setTextColor(color);
    }
  }
  
  public static void setFontstoTextview(Context context, View v, String fontname, int color)
  {
    if ((v instanceof ViewGroup))
    {
      ViewGroup vg = (ViewGroup)v;
      for (int i = 0; i < vg.getChildCount(); i++)
      {
        View child = vg.getChildAt(i);
        setFontstoTextview(context, child, fontname, color);
      }
    }
    else if ((v instanceof TextView))
    {
      ((TextView)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((TextView)v).setTextColor(color);
    }
  }
  
  public static void setFontstoButton(Context context, View v, String fontname, int color)
  {
    if ((v instanceof ViewGroup))
    {
      ViewGroup vg = (ViewGroup)v;
      for (int i = 0; i < vg.getChildCount(); i++)
      {
        View child = vg.getChildAt(i);
        setFontstoButton(context, child, fontname, color);
      }
    }
    else if ((v instanceof Button))
    {
      ((Button)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((Button)v).setTextColor(color);
    }
  }
  
  public static void setFontstoEditText(Context context, View v, String fontname, int color)
  {
    if ((v instanceof ViewGroup))
    {
      ViewGroup vg = (ViewGroup)v;
      for (int i = 0; i < vg.getChildCount(); i++)
      {
        View child = vg.getChildAt(i);
        setFontstoEditText(context, child, fontname, color);
      }
    }
    else if ((v instanceof EditText))
    {
      ((EditText)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((EditText)v).setTextColor(color);
    }
  }
  
  public static void setFontstoCheckbox(Context context, View v, String fontname, int color)
  {
    if ((v instanceof ViewGroup))
    {
      ViewGroup vg = (ViewGroup)v;
      for (int i = 0; i < vg.getChildCount(); i++)
      {
        View child = vg.getChildAt(i);
        setFontstoCheckbox(context, child, fontname, color);
      }
    }
    else if ((v instanceof CheckBox))
    {
      ((CheckBox)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((CheckBox)v).setTextColor(color);
    }
  }
  
  public static void setFontstoRadioButton(Context context, View v, String fontname, int color)
  {
    if ((v instanceof ViewGroup))
    {
      ViewGroup vg = (ViewGroup)v;
      for (int i = 0; i < vg.getChildCount(); i++)
      {
        View child = vg.getChildAt(i);
        setFontstoRadioButton(context, child, fontname, color);
      }
    }
    else if ((v instanceof RadioButton))
    {
      ((RadioButton)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((RadioButton)v).setTextColor(color);
    }
  }
  
  public static void setFontstoAllSwitch(Context context, View v, String fontname, int color)
  {
    if ((v instanceof ViewGroup))
    {
      ViewGroup vg = (ViewGroup)v;
      for (int i = 0; i < vg.getChildCount(); i++)
      {
        View child = vg.getChildAt(i);
        setFontstoAllSwitch(context, child, fontname, color);
      }
    }
    else if ((v instanceof Switch))
    {
      ((Switch)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((Switch)v).setTextColor(color);
    }
  }
  
  public static void setFontstoToggleButton(Context context, View v, String fontname, int color)
  {
    if ((v instanceof ViewGroup))
    {
      ViewGroup vg = (ViewGroup)v;
      for (int i = 0; i < vg.getChildCount(); i++)
      {
        View child = vg.getChildAt(i);
        setFontstoToggleButton(context, child, fontname, color);
      }
    }
    else if ((v instanceof ToggleButton))
    {
      ((ToggleButton)v).setTypeface(Typeface.createFromAsset(context.getAssets(), fontname));
      ((ToggleButton)v).setTextColor(color);
    }
  }
}
