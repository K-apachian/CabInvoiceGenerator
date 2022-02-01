package com.wipro.validations;

import com.wipro.bean.CabBean;
import com.wipro.userexceptions.MainException;

import java.util.Random;

public class TripValidator {

    public static int[] amountGenerator(int kmsUsed, String cabType){

        int arr[] = new int[2];

        //GENERATION OF THE RECEIPT NUMBER
        Random r = new Random();
        int receiptId = r.nextInt(99999);
        arr[0] = receiptId;

        //GENERATION OF THE BILL AMOUNT
        int totalBill = 0;
        switch(cabType){
            case "Tata Indica":
                totalBill = 12 * kmsUsed;
                break;

            case "Tata Indigo":
                totalBill = 10 * kmsUsed;
                break;

            case "BMW":
                totalBill = 45 * kmsUsed;
                break;

            case "Logan":
                totalBill = 31 * kmsUsed;
                break;

            default:
                totalBill = 0;
                break;
        }

        arr[1] = totalBill;
        System.out.print("CAB INVOICE GENERATED");
        return arr;
    }

    public static String printBillAmount(CabBean cabBean){


        int count = 0;
        int[] newArr = new int[amountGenerator(cabBean.getKmsUsed(),cabBean.getCabType()).length];

        try{
            if(cabBean.getBookingID().startsWith("AD") && cabBean.getBookingID().substring(1,6).length()==5)
                count++;
            else
                throw new MainException("Invalid Booking ID");

            if(cabBean.getUserID() >= 1001 && cabBean.getUserID()<=1500)
                count++;
            else
                throw new MainException("Invalid User ID");

            if(cabBean.getCabType().equalsIgnoreCase("Tata Indica")
                    || (cabBean.getCabType().equalsIgnoreCase("Tata Indigo"))
                    || (cabBean.getCabType().equalsIgnoreCase("BMW"))
                    ||(cabBean.getCabType().equalsIgnoreCase("Logan"))){
                count++;
            }else
                throw new MainException("Invalid Cab Type");

            if(cabBean.getKmsUsed()>=0)
                count++;
            else
                throw new MainException("Invalid Kilometers");

        } catch (MainException ex) {
            System.out.println(ex.getMessage());
        }finally{
            if(count == 4){
                newArr = amountGenerator(cabBean.getKmsUsed(), cabBean.getCabType());
            }
        }
        return "Total Amount : "+newArr[0]+", Receipt ID : "+newArr[1];
    }
}
