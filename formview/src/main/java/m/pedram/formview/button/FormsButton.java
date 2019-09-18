package m.pedram.formview.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import m.pedram.formview.FormsView;
import m.pedram.formview.R;

public class FormsButton extends AppCompatButton {

    private boolean isBold;


    public FormsButton(Context context) {
        super(context);
        setFont(context, null);
    }

    public FormsButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont(context, attrs);
    }

    public FormsButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont(context, attrs);
    }

    private void setFont(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray array = context.getTheme().obtainStyledAttributes(attrs, R.styleable.FormsTextView, 0, 0);
            isBold = array.getBoolean(R.styleable.FormsTextView_isBold, isBold);
            array.recycle();
        }
        new FormsView.Builder(context)
                .setIsBold(isBold)
                .build()
                .setFont(this);
        invalidate();
        requestLayout();
    }
}
