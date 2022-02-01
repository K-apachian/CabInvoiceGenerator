package com.wipro.service;

import com.wipro.bean.CabBean;
import com.wipro.validations.TripValidator;

public class MainClass {

    public static void main(String[] args) {

        CabBean cabBean = new CabBean();
        cabBean.setBookingID("AD12345");
        cabBean.setCabType("BMW");
        cabBean.setKmsUsed(120);
        cabBean.setUserID(1003);
        cabBean.setUsername("Hariprasath");

        String result = TripValidator.printBillAmount(cabBean);
        System.out.println(result);
    }
}
