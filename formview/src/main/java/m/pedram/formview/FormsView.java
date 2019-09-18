package m.pedram.formview;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class FormsView {

    private Typeface bold;
    private Typeface normal;
    private boolean isBold;

    private FormsView(Builder builder) {
        this.isBold = builder.isBold;
        this.bold = builder.bold;
        this.normal = builder.normal;
    }

    public void setFont(TextView textView) {
        if (normal != null && bold != null)
            textView.setTypeface(isBold ? bold : normal);
    }


    public static class Builder {
        private Typeface bold;
        private Typeface normal;
        private boolean isBold;

        public Builder(Context context) {
            normal = FormsViewUtils.getInstance(context).getFont(false);
            bold = FormsViewUtils.getInstance(context).getFont(true);
        }

        public Builder setBold(Typeface bold) {
            this.bold = bold;
            return this;
        }

        public Builder setNormal(Typeface normal) {
            this.normal = normal;
            return this;
        }

        public Builder setIsBold(boolean bold) {
            isBold = bold;
            return this;
        }

        public Typeface getBold() {
            return bold;
        }

        public Typeface getNormal() {
            return normal;
        }

        public FormsView build() {
            return new FormsView(this);
        }
    }
}
