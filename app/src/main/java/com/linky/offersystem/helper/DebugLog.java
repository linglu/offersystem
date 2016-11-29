package com.linky.offersystem.helper;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * Created by Linky on 16-8-31.
 * Logger 日志输出格式
 */
public final class DebugLog {

    private static final String TAG = "message";
    private static final boolean mIsDebugMode = true;

    public static void init() {
        Logger
                .init(TAG)                      // 如果仅仅调用 init 不传递参数，默认标签是 PRETTYLOGGER
                .methodCount(2)                 // 显示调用方法链的数量，默认是 2
//                .hideThreadInfo()             // 隐藏线程信息，默认是显示
                .logLevel(LogLevel.FULL);       // 日志等级，其实就是控制是否打印，默认为 LogLevel.FULL
    }

    public static void e(String message) {
        if (!mIsDebugMode) return;
        Logger.e(message);
    }

    public static void w(String message) {
        if (!mIsDebugMode) return;
        Logger.w(message);
    }

    public static void i(String message) {
        if (!mIsDebugMode) return;
        Logger.i(message);
    }

    public static void d(String message) {
        if (!mIsDebugMode) return;
        Logger.d(message);
    }

    public static void v(String message) {
        if (!mIsDebugMode) return;
        Logger.v(message);
    }

    public static void json(String json) {
        if (!mIsDebugMode) return;
        Logger.json(json);
    }

}
