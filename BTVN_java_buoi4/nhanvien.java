import java.util.Scanner;

public class nhanvien {
    private String Manv;
    private String Tennv;
    private int tuoi;
    private String diachi;
    private String bophan;Scanner input = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhap ma nhan vien: ");
        Manv = input.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        Tennv = input.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = input.nextInt();
        input.nextLine();
        System.out.print("Nhap dia chi: ");
        diachi = input.nextLine();
        System.out.print("Nhap bo phan: ");
        bophan = input.nextLine();
    }
    public void xuat(){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n",Manv,Tennv,tuoi,diachi,bophan);
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nhan vien can nhap thong tin: ");
        int n;
        n = input.nextInt();
        nhanvien[] nv= new nhanvien[n];
        for(int i = 0;i < n ; i++){
            System.out.println("Nhap thong tin cho nhan vien thu "+(i+1));
            nv[i]=new nhanvien();
            nv[i].nhap();
        }
        System.out.println("\t\tBANG THONG TIN NHAN VIEN");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Manv","TenNV","Tuoi","DiaChi","BoPhan");
        for(int i=0;i<n;i++){
            nv[i].xuat();
        }

    }
}
