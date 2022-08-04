import java.util.Scanner;

public class bai4 {
    private String manv;
    private String name;
    private int tuoi;
    private int ngaycong;
    double salary;
    private static float price = 50;
    Scanner input = new Scanner(System.in);

//    public bai4(String manv, String name, int tuoi, int ngaycong) {
//        this.manv = manv;
//        this.name = name;
//        this.tuoi = tuoi;
//        this.ngaycong = ngaycong;
//    }



    public String getManv() {
        return manv;
    }

    public String getName() {
        return name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getNgaycong() {
        return ngaycong;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setNgaycong(int ngaycong) {
        this.ngaycong = ngaycong;
    }

    public double luong() {
        salary = ngaycong * price;
        return salary;
    }

    public void nhap() {
        System.out.print("Nhap ma nhan vien: ");
        manv = input.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        name = input.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = input.nextInt();
        input.nextLine();
        System.out.print("Nhap so ngay cong: ");
        ngaycong = input.nextInt();
    }

    public void xuat() {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", manv, name, tuoi, ngaycong, luong());
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nhan vien can nhap thong tin: ");
        n = input.nextInt();
        bai4[] nv = new bai4[n];
        for (int i = 0; i < n; i++) {
            nv[i] = new bai4();
            nv[i].nhap();
        }
        System.out.printf("\t\tBANG CONG NHAN VIEN\n");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "MaNV", "Ten", "Tuoi", "NgayCong", "Salary");
        for (int i=0;i<n;i++){
            nv[i].xuat();
        }
    }
}


