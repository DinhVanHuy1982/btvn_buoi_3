import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        hinhchunhat hcn1 = new hinhchunhat();
        hcn1.nhap();
        System.out.println("Thong tin hinh chu nhat 1 La: ");
        System.out.println("chieu dai: "+hcn1.getChieudai());
        System.out.println("chieu rong: "+hcn1.getChieurong());
        System.out.println("Chu vi hinh chu nhat la: " + hcn1.cv());
        System.out.println("Dien tinh hinh chu nhat la: "+ hcn1.dt());

        hinhchunhat hcn2 = new hinhchunhat();
        hcn2.setChieudai(10);
        hcn2.setChieurong(20);
        System.out.println("Thong tin hinh chu nhat 2 La: ");
        System.out.println("chieu dai: "+hcn2.getChieudai());
        System.out.println("chieu rong: "+hcn2.getChieurong());
        System.out.println("Chu vi hinh chu nhat la: " + hcn2.cv());
        System.out.println("Dien tinh hinh chu nhat la: "+ hcn2.dt());

        if(hcn1.dt()>hcn2.dt()){
            System.out.println("Hinh 1 co dien tich lon hon hinh 2");
        }
        else{
            System.out.println("Hinh 2 co dien tich lon hon hinh 1");
        }
    }
}
