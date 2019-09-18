# FormsView
an easy way to set normal and bold fonts to editText, Button and TextView

## Getting Started

### Installing
add code below to project level build.gradle
```
maven { url 'https://jitpack.io' }
```

and this line to app level build.gradle
```
implementation 'com.github.P-B1101:FormsView:1.0.0'
```
### usage

create your typeface like this

```
Typeface bold = Typeface.createFromAsset(getAssets(), "bold.ttf");
Typeface normal = Typeface.createFromAsset(getAssets(), "normal.ttf");
```
and then pass them to the Builder in Application oncreate method
```
new FormsViewUtils.Builder(this)
                .setBold(bold)
                .setNormal(normal)
                .build();
```
now you can use textview and button and edittext like this
```
<m.pedram.formview.textview.FormsTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="این یک تست است"
        app:isBold="true" // for normal text use false or not set at all/>
```
congratulations :)
