package org.government.kdca.co;

import java.io.Serializable;

public class Patient implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String code;
    private String location;
    private String no;
    private String name;
    private String address;
    private String detailAddress;
    private String zipCode;
    private String confirmationDate;
    private String expectedDate;
    private String cardCompanyName;
    private String cardNo;

    public Patient() {
    }
    
    public Patient(String code, String location, String no, String name, String address, String detailAddress, 
    		String zipCode, String confirmationDate, String expectedDate, String cardCompanyName, String cardNo) {
        this.code = code;
        this.location = location;
        this.no = no;
        this.name = name;
        this.address = address;
        this.detailAddress = detailAddress;
        this.zipCode = zipCode;
        this.confirmationDate = confirmationDate;
        this.expectedDate = expectedDate;
        this.cardCompanyName = cardCompanyName;
        this.cardNo = cardNo;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return this.no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getDetailAddress() {
        return this.detailAddress;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setConfirmationDate(String confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public String getConfirmationDate() {
        return this.confirmationDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getExpectedDate() {
        return this.expectedDate;
    }

    public void setCardCompanyName(String cardCompanyName) {
        this.cardCompanyName = cardCompanyName;
    }

    public String getCardCompanyName() {
        return this.cardCompanyName;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return this.cardNo;
    }
}
