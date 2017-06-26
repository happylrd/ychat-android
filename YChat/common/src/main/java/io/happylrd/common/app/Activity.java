package io.happylrd.common.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initWindows();

        if (initArgs(getIntent().getExtras())) {
            getContentLayoutId();
            initWidget();
            initData();
        } else {
            finish();
        }
    }

    protected void initWindows() {

    }

    /**
     * 初始化相关参数
     */
    protected boolean initArgs(Bundle bundle) {
        return true;
    }

    protected abstract int getContentLayoutId();

    protected void initWidget() {

    }

    protected void initData() {

    }

    @Override
    public boolean onSupportNavigateUp() {
        // 当点击界面导航返回时, finish当前界面
        finish();
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
