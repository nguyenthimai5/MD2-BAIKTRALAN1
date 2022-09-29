import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soDong=20;
        int soCot=20;
        int[][] mang2Chieu = new int[soDong][soCot];
        int i=10;
        int j=10;
        int m=0;
        int n=0;
        int v=soCot-1;
        int phanTuDau=mang2Chieu[m][n];
        int phanTuCuoi=mang2Chieu[m][v];
        int temp;
        do {
            System.out.println("-----------MENU----------");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. In giá trị các phần tử của mảng theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng");
            System.out.println("4. Sắp xếp mảng tăng dần theo cột");
            System.out.println("5. Thoát");
            int nhap = scanner.nextInt();

            switch (nhap) {
                case 1:
                    do {
                        System.out.println("số dòng của mảng:");
                        soDong = scanner.nextInt();
                    } while (soDong <= 0);
                    do {
                        System.out.println("nhập số cột");
                        soCot = scanner.nextInt();
                    } while (soCot <= 0);
                    System.out.println("nhập các giá trị của một dòng :");
                    mang2Chieu = new int[soDong][soCot];
                    System.out.print("Nhập các phần tử của mảng: \n");
                    for ( i = 0; i < soDong; i++) {
                        for ( j = 0; j < soCot; j++) {
                            System.out.printf("Giá trị phần tử tại hàng %d và cột %d là: ", i + 1, j + 1);
                            mang2Chieu[i][j] = scanner.nextInt();
                        }
                    }

                    break;
                case 2:
                    System.out.println("Mảng được in ra theo ma trận là: ");
                    for ( i = 0; i < soDong; i++) {
                        for ( j = 0; j < soCot; j++) {
                            System.out.printf("%d\t", mang2Chieu[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    if (soDong==soCot){
                        int tong=0;
                        for ( i = 0; i < soDong; i++) {
                            for ( j = 0; j < soCot; j++) {
                                if (i==j){
                                    tong +=mang2Chieu[i][j];
                                    System.out.println("Các giá trị ở đường chéo chính là: "+mang2Chieu[i][j]);
                                }
                            }
                        }
                        System.out.println("tổng của đường chéo chính là "+tong);
                        int tong2=0;
                        for ( i = 0; i < soDong; i++) {
                            for ( j = 0; j < soCot; j++) {
                                int c=i+j;
                                int d=soCot-1;
                                if (c==d){
                                    tong2 +=mang2Chieu[i][j];
                                    System.out.println("Các giá trị ở đường chéo phụ là: "+mang2Chieu[i][j]);
                                }
                            }
                        }
                        System.out.println("tổng của đường chéo phụ là"+tong2);
                    }else {
                        System.out.println("Vui lòng nhập lại số dòng phải bằng số cột");
                    }
                    break;
                case 4:
                    for ( i = 0 ; i < soDong - 1;i++ ) {
                        for (j = i + 1; j < soCot; j++ ) {
                            temp =mang2Chieu[phanTuDau][phanTuCuoi];
                            if ( mang2Chieu[i][j]>temp) {
                             temp=mang2Chieu[i][j];
                             mang2Chieu[i][j]=temp;
                            }
                            v-=1;
                        }
                        m +=1;
                    }
                    for ( i = 0; i< soDong; i++) {
                        for ( j=0;j<soCot;j++){
                            System.out.print(mang2Chieu[i][j] + "\t");
                        }
                        System.out.println("\n");
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("VUI LÒNG NHẬP TRONG KHOẢNG 1-5!");
            }
        }while (true);
    }
}
