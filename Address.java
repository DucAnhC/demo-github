/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2;

/**
 *
 * @author ASUS
 */
public class Address {
    //attributes
    private String thon;
    private String xa;
    private String huyen;
    private String tinh;
    //constructor
    public Address() {
        //default
    }
    
    public Address(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }
    //methods

    public String getThon() {
        return thon;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public String getXa() {
        return xa;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }
    //display

    @Override
    public String toString() {
        return "Address{" + "thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + '}';
    }
    
    
}
