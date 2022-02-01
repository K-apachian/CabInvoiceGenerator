package com.wipro.bean;

public class CabBean {

    private String bookingID;

    private int userID;

    private String username;

    private String cabType;

    private int kmsUsed;

    private float totalAmount;

    private int receiptNo;

    public CabBean() {
    }

    public CabBean(String bookingID, int userID, String username, String cabType, int kmsUsed, float totalAmount, int receiptNo) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.username = username;
        this.cabType = cabType;
        this.kmsUsed = kmsUsed;
        this.totalAmount = totalAmount;
        this.receiptNo = receiptNo;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public int getKmsUsed() {
        return kmsUsed;
    }

    public void setKmsUsed(int kmsUsed) {
        this.kmsUsed = kmsUsed;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }

    @Override
    public String toString() {
        return "CabBean{" +
                "bookingID='" + bookingID + '\'' +
                ", userID=" + userID +
                ", username='" + username + '\'' +
                ", cabType='" + cabType + '\'' +
                ", kmsUsed='" + kmsUsed + '\'' +
                ", totalAmount=" + totalAmount +
                ", receiptNo=" + receiptNo +
                '}';
    }
}
