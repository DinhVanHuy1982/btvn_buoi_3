/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {

    int n;
    public static void main(String[] args) {
        // TODO code application logic here
        prime kt = new prime();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap a: ");
	int a = sc.nextInt();
	System.out.println("Nhap n: ");
	long b = sc.nextLong();
	System.out.println("Nhap c: ");
	float c = sc.nextFloat();
	System.out.println("Nhap d: ");
	double d = sc.nextDouble();
	System.out.println(kt.isPrime(a));
	System.out.println(kt.isPrime(b));
	System.out.println(kt.isPrime(c));
	System.out.println(kt.isPrime(d));


    }
    
}
