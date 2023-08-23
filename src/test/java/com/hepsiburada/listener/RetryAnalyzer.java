package com.hepsiburada.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by Fatih Can Oklay
 * Date: 23.08.2023
 */

public class RetryAnalyzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 2;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount<maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
