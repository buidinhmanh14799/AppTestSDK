package com.example.testedoctorsdk.Model;

public interface WebViewLoadListener {
    void onPageStarted();
    void onPageFinished();
    void onPageError(int errorCode, String description);
}
