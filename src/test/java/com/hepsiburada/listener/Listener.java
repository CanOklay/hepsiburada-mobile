package com.hepsiburada.listener;

import com.hepsiburada.base.BasePage;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.hepsiburada.reports.ExtentLogger;
import com.hepsiburada.reports.ExtentReport;

import java.io.IOException;

/**
 * Created by Fatih Can Oklay
 * Date: 23.08.2023
 */

public class Listener implements ITestListener, ISuiteListener {

    BasePage basePage = new BasePage();

    @Override //before method
    public void onTestStart(ITestResult result) {
        ExtentReport.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName() + " is passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        try {
            basePage.screenShot("failScreenShot");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ExtentLogger.fail(result.getName() + " is failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getName() + " is skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override //before suite
    public void onStart(ITestContext context) {
        ExtentReport.initReports();
    }

    @Override //after suite
    public void onFinish(ITestContext context) {
        ExtentReport.tearDownReports();
    }
}
