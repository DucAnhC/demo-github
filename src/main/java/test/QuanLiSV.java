/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test;
import java.util.Scanner;
import java.io.*;
import main.DanhSachSinhVien;
import main.SinhVien;

/**
 *
 * @author ASUS
 */
public class QuanLiSV {

    public static void main(String[] args) {
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println(" Nhap vao tuy chon");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Kiem tra danh sach co rong hay khong");
            System.out.println("3. Hien thi tat ca sinh vien");
            System.out.println("4. Lay so luong sinh vien");
            System.out.println("5. Lam rong danh sach");
            System.out.println("6. Tim sinh vien qua ID: ");
            System.out.println("7. Thoat.");
            System.out.print("Nhap vao lua chon cua ban: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Loi: Ban phai nhap 1 so nguyen hop le");
                continue;
            }
            
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Nhap vao ma sinh vien: ");
                        String id = sc.nextLine();
                        
                        System.out.print("Nhap vao ten sinh vien: ");
                        String name = sc.nextLine();
                        
                        System.out.print("Nhap vao tuoi sinh vien: ");
                        int age = Integer.parseInt(sc.nextLine());
                        
                        if(age <= 0 || age >= 110) {
                            throw new IllegalArgumentException("Tuoi phai la 1 so duong va nho hon 110");
                        }
                        
                        System.out.print("Nhap vao GPA: ");
                        double gpa = Double.parseDouble(sc.nextLine());
                        
                        if(gpa < 0 || gpa > 4) {
                            throw new IllegalArgumentException("GPA phai nam trong khoang tu 0 den 4");
                        }
                        
                        SinhVien sv = new SinhVien(id, name, age, gpa);
                        dssv.themSinhVien(sv);
                        System.out.println("Da them sinh vien");
                    } catch(NumberFormatException e) {
                        System.out.print("Loi: Ban phai nhap 1 so hop le");
                    } catch(IllegalArgumentException e) {
                        System.out.print("Loi: " + e.getMessage());
                    }
                    break;
                
                case 2:
                    if(dssv.kiemTraRong()) {
                        System.out.println("Danh sach sinh vien rong");
                    }
                    else {
                        System.out.println("Danh sach sinh vien hien tai khong rong");
                    }
                    break;
                
                case 3:
                    dssv.inDanhSach();
                    break;
                
                case 4:
                    System.out.println("So luong sinh vien hien tai la: " + dssv.laySoLuongSinhVien());
                    break;
                
                case 5:
                    dssv.lamRongDanhSach();
                    break;
                
                case 6:
                    System.out.print("Nhap vao ID cua sinh vien can tim: ");
                    String searchId = sc.nextLine();
                    SinhVien foundSV = dssv.timSvQuaId(searchId);
                    if(foundSV != null) {
                        System.out.println("Sinh vien can tim la: " + foundSV);
                    }
                    else {
                        System.out.println("Khong tim thay sinh vien voi ma " + searchId);
                    }
                    break;
                case 7:
                    System.out.print("Thoat khoi chuong trinh.");
                    sc.close();
                    return;
                
                default:
                    System.out.print("Loi: lua chon khong hop le");
                
            }   
        } 
    } 
}
