package com.linky.offersystem.view;

/**
 * Created by Linky on 16-11-30.
 */
public interface IntroView extends BaseView {

    void onInitDbComplete();    // 当初始化数据库完成
    void onInitDbFail(String msg);
}
