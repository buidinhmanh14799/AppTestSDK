package com.example.testedoctorsdk;

import android.content.Context;
import android.content.Intent;

import com.example.testedoctorsdk.Utils.Option;

public class TestEdoctorSDK {
    public static void openWebView(Context context, Option option) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra("option", option);
        context.startActivity(intent);
    }
}

