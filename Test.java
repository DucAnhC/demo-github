/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai2;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //init object
        Address ad = new Address();
        //check methods
        boolean check = false;
        while(!check) {
            try {
            //input
                System.out.println("Nhap vao dia chi");
                System.out.println("Nhap vao thon: ");
                String thon = sc.nextLine();
                ad.setThon(thon);
                System.out.println("Nhap vao xa: ");
                String xa = sc.nextLine();
                ad.setXa(xa);
                System.out.println("Nhap vao huyen: ");
                String huyen = sc.nextLine();
                ad.setHuyen(huyen);
                System.out.println("Nhap vao tinh: ");
                String tinh = sc.nextLine();
                ad.setTinh(tinh);
                break; //Test den day thoi
            } catch(Exception e) {
                System.out.println("Nhap vao ko hop le: " + e.getMessage());
                sc.nextLine(); //xuong dong de nhap lai
            }
        }
        //display
        System.out.println("In ra thong tin dia chi: \n" + ad.toString());
    }
}
