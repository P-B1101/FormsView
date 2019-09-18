package m.pedram.formview;

import android.content.Context;
import android.graphics.Typeface;

public class FormsViewUtils {

    private static FormsViewUtils mInstance = null;
    private static Typeface normal;
    private static Typeface bold;

    private FormsViewUtils(Context context) {
        bold = Typeface.createFromAsset(context.getAssets(), "fonts/bold.ttf");
        normal = Typeface.createFromAsset(context.getAssets(), "fonts/medium.ttf");
    }

    public static synchronized FormsViewUtils getInstance(Context context) {
        if (null == mInstance) {
            mInstance = new FormsViewUtils(context);
        }
        return mInstance;
    }

    private synchronized void setBold(Typeface typeface) {
        bold = typeface;
    }

    private synchronized void setNormal(Typeface typeface) {
        normal = typeface;
    }

    Typeface getFont(boolean isBold) {
        return isBold ? bold : normal;
    }


    public static class Builder {
        private Typeface normal;
        private Typeface bold;
        private final Context context;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setNormal(Typeface normal) {
            this.normal = normal;
            return this;
        }

        public Builder setBold(Typeface bold) {
            this.bold = bold;
            return this;
        }

        public void build() {
            getInstance(context).setBold(bold);
            getInstance(context).setNormal(normal);
        }
    }
}
