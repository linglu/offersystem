package com.linky.offersystem.support.utils;

import android.widget.LinearLayout;
import android.widget.Toast;

import com.linky.offersystem.MyApp;

/**
 * Created by Linky on 16-9-22.
 */
public class ToastUtils {

    public static void showShortToast(String msg) {
        Toast toast = Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT);
        LinearLayout toastView = (LinearLayout) toast.getView();
        toastView.findViewById(android.R.id.message).setBackgroundResource(android.R.color.transparent);
        toast.show();
    }

    public static void showLongToast(String msg) {
        Toast toast = Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_LONG);
        LinearLayout toastView = (LinearLayout) toast.getView();
        toastView.findViewById(android.R.id.message).setBackgroundResource(android.R.color.transparent);
        toast.show();
    }
}
