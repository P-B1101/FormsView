package m.pedram.formsview;

import android.app.Application;
import android.graphics.Typeface;

import m.pedram.formview.FormsViewUtils;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Typeface bold = Typeface.createFromAsset(getAssets(), "IRAN-Sans-Bold.ttf");
        Typeface normal = Typeface.createFromAsset(getAssets(), "Aryana-Regular.ttf");
        new FormsViewUtils.Builder(this)
                .setBold(bold)
                .setNormal(normal)
                .build();
    }
}
