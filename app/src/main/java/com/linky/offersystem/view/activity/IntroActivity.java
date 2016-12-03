package com.linky.offersystem.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.linky.offersystem.R;
import com.linky.offersystem.di.component.DaggerIntroComponent;
import com.linky.offersystem.di.module.IntroModule;
import com.linky.offersystem.helper.InitHelper;
import com.linky.offersystem.support.utils.ToastUtils;
import com.linky.offersystem.view.IntroView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Linky on 16-11-30.
 * 初始化数据库数据
 */
public class IntroActivity extends BaseActivity implements IntroView {

    @BindView(R.id.ll_loading)
    View mView;

    @BindView(R.id.tv_init_complete)
    TextView mTv;

    @Inject
    InitHelper mInitHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ButterKnife.bind(this);
        initInjector();
        mInitHelper.setBaseView(this);
        mInitHelper.initDbFromAsset();
    }

    private void initInjector() {
        DaggerIntroComponent.builder()
                .applicationComponent(getApplicationComponent())
                .introModule(new IntroModule())
                .build().inject(this);
    }

    @Override
    public void onInitDbComplete() {
        mView.setVisibility(View.GONE);
        mTv.setVisibility(View.VISIBLE);
        ToastUtils.showLongToast("初始化完成，2s 后自动跳转");
        new Handler().postDelayed(() -> {
           Intent intent = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 2000);
    }

    @Override
    public void onInitDbFail(String msg) {
        mView.setVisibility(View.GONE);
        ToastUtils.showLongToast(msg);
    }
}
