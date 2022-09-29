import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doDai = 20;
        int[] mang = new int[doDai];
        do {
            System.out.println("-----------MENU----------");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("4. In giá trị max, min các phần tử trong mảng");
            System.out.println("5. Sắp xếp mảng giảm dần");
            System.out.println("6. Thoát");
            int nhap = scanner.nextInt();

            switch (nhap) {
                case 1:
                    System.out.println("nhập độ dài của mảng:");
                    doDai = scanner.nextInt();
                    System.out.println("nhập các giá trị cho mảng:");
                    mang = new int[doDai];
                    for (int i = 0; i < doDai; i++) {
                        System.out.println("Nhập phần tử thứ " + i + " là:");
                        mang[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("mảng có các phần tử là: ");
                    for (int i = 0; i < doDai; i++) {
                        System.out.printf("%d\t", mang[i]);
                    }
                    System.out.println("\n");
                    break;

                case 3:
                    for (int i = 0; i < doDai; i++) {
                        if (mang[i]>2){
                            int so = (int) Math.sqrt(mang[i]);
                            for (int j = 2; j < so; j++) {
                                if (mang[i] % j == 0) {
                                    System.out.println(mang[i] + " không phải là số nguyên tố");
                                    break;
                                } else {
                                    System.out.println(mang[i] + "là số nguyên tố");
                                }
                            }
                        }else if (mang[i]==2){
                            System.out.println("2 là số nguyên tố");
                        }
                    }
                    break;
                case 4:
                    int min=mang[0];
                    for (int i = 0; i < doDai; i++) {
                        if (mang[i]<min){
                            min=mang[i];
                        }
                    }
                    System.out.println("Giá trị nhỏ nhất của mảng là: "+min);

                    int max=mang[0];
                    for (int i = 0; i < doDai; i++) {
                        if (mang[i]>max){
                            max=mang[i];
                        }
                    }
                    System.out.println("Giá trị nhỏ nhất của mảng là: "+max);

                    break;
                case 5:
                    int temp =mang[0];
                    for (int i = 0 ; i < doDai - 1; i++) {
                        for (int j = i + 1; j < doDai; j++) {
                            if (mang[i] < mang[j]) {
                                temp = mang[j];
                                mang[j] = mang[i];
                                mang[i] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < doDai; i++) {
                        System.out.print(mang[i] + " ");
                    }
                    System.out.println("\n");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("VUI LÒNG NHẬP TỪ 1-6");
            }
        }
        while (true);
    }
}
