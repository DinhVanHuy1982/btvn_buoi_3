/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phongmay;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PhongMay {

    /**
     * @param args the command line arguments
     */
    private String maphong;
    private String tenphong;
    private float dientich;
    public Quanly x=new Quanly();
    public May y= new May();
    Scanner input = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap ma phong: ");
        maphong = input.nextLine();
        System.out.print("Nhap ten phong: ");
        tenphong= input.nextLine();
        System.out.print("Nhap dien tich: ");
        dientich= input.nextFloat();
        input.nextLine();
        
        x.nhapx();
        
        y.nhapy();
    }

    public String getMaphong() {
        return maphong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public float getDientich() {
        return dientich;
    }
    
    public void xuat(){
        System.out.printf("%-10s%-10s%-10s",maphong,tenphong,dientich);
        x.xuatx();
        y.xuaty();
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phong may can nhap thong tin: ");
        n = input.nextInt();
        PhongMay a[] = new PhongMay[n];
        for(int i=0;i<n;i++){
            a[i]=new PhongMay();
            a[i].nhap();
        }
        System.out.print("\t\tThong tin phong may\n");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n","MaPhong","TenPhong","DienTich","MaQuanLy","HoTen","MaMay","KieuMay","TinhTrang");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }
    }
    
}
