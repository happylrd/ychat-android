package io.happylrd.ychat;

import android.widget.TextView;

import butterknife.BindView;
import io.happylrd.common.app.Activity;

public class MainActivity extends Activity {

    @BindView(R.id.txt_test)
    TextView mTestText;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        mTestText.setText("Test Hello");
    }
}
