/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class DanhSachSinhVien {
    private List<SinhVien> danhsach = new ArrayList<>();

    /**
     *
     */
    public DanhSachSinhVien() {
        
    }

    public DanhSachSinhVien(List<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }
    
    
    public void themSinhVien(SinhVien sv) {
        this.danhsach.add(sv); 
    }
    public boolean kiemTraRong() {
        return danhsach.isEmpty();
    }
    public void inDanhSach() {
        if(danhsach.isEmpty()) {
            System.out.println("Danh sach rong");
        }
        else {
            for(SinhVien sinhvien : danhsach) {
                System.out.println(sinhvien); //For each
            }
        }
    }
    public int laySoLuongSinhVien() {
        if(danhsach.isEmpty()) {
            System.out.println("Danh sach rong");
        }
        return danhsach.size();
    }
    public SinhVien timSvQuaId(String id) {
        for(SinhVien sv : danhsach) {
            if(sv.getId().equals(id)) {
                return sv;
            }
        }
        return null;
    }
    public void lamRongDanhSach() {
        this.danhsach.removeAll(danhsach);
        System.out.println("Da lam rong danh sach");
    }
    
}
