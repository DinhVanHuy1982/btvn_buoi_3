/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phongmay;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class May {
    private String mamay;
    private String kieumay;
    private String tinhtrang;
    Scanner input = new Scanner(System.in);

    public String getMamay() {
        return mamay;
    }

    public String getKieumay() {
        return kieumay;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    

    public void nhapy() {
        System.out.print("Nhap ma may: ");
        this.mamay = this.input.nextLine();
        System.out.print("Nhap kieu may: ");
        this.kieumay = this.input.nextLine();
        System.out.print("Nhap tinh trang: ");
        this.tinhtrang = this.input.nextLine();
    }

    public void xuaty() {
        System.out.printf("%-10s%-10s%-10s\n", this.mamay, this.kieumay, this.tinhtrang);
    }
}
