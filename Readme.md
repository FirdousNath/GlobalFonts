# GlobalFonts
Many a times we are fed up to set different fonts to each element of the activity,so Global Font Library provides simplest way to set any Custom Font to any of the view throughout the Application.

Simple Views           |  Spinner
:-------------------------:|:-------------------------:
![](https://github.com/FirdousNath/GlobalFonts/blob/master/screenshots/Screenshot_2016-08-10-11-06-05-699_com.firdous.globalfonts.png)  |  ![](https://github.com/FirdousNath/GlobalFonts/blob/master/screenshots/Screenshot_2016-08-10-11-06-21-078_com.firdous.globalfonts.png)
-----------------------------------------------------------------------------------------------------------------------

##Download [GlobalFonts.jar](https://github.com/FirdousNath/GlobalFonts/blob/master/GlobalFonts.jar)
add jar to libs/ 

## Add Dependency 
add following lines in build.gradle (app module)
```
dependencies {
    compile fileTree(include: ['*.jar'], dir: 'libs')
    compile files('libs/GlobalFonts.jar')
}
```

##Add Fonts

Add your custom fonts to assets/
 
## Getting Started

##### Just call static method of class *GlobalFonts*  GlobalFonts.setFontstoAllViews

```
RelativeLayout root = (RelativeLayout)findViewById(R.id.root);
GlobalFonts.setFontstoAllViews(this,root,"Linotype - DINNextLTPro-UltraLight.otf", Color.BLACK);
```

### Set Custom Font to Spinner

```
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 Spinner spinner=(Spinner)findViewById(R.id.s);
 String items[]={"Global","Fonts"};

 s.setAdapter(new GlobalFontsForSpinner(this,
        R.layout.support_simple_spinner_dropdown_item,
        items,"Linotype - DINNextLTPro-UltraLight.otf"));
```
### Set Font to any CheckBox or Radio Button or Switch or Toggle Button just pass following Arguments in order :
- context   (Activity)
- View Id   (int)
- font-name (String)
- color     (int)
