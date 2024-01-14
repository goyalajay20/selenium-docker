package com.ajay.util;

import com.ajay.tests.vendorportal.model.VendorPortalTestData;

public class Demo1 {
    public static void main(String[] args) {
        VendorPortalTestData testData = JsonUtil.getTestData("test-data/vendor-portal/john.json",VendorPortalTestData.class);
        System.out.println(testData.monthlyEarning());
    }
}
