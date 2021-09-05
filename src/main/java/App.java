import java.util.Scanner;
/*
    Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên
    trong đó có ít nhất 1 ký tự in hoa, 1 ký tự số, 1 ký tự đặc biệt như . - _ …
    Nếu mật khẩu ít hơn 10 ký tự thông báo mật khẩu yếu
    Nếu thiếu một trong các ký tự đặc biệt thì thông báo mật khẩu chưa đủ mạnh
     */

public class App {
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương: ");
        int a = new Scanner(System.in).nextInt();
        if (checkValidMonth(a)) {
            System.out.format("%d là một tháng trong năm\n", a);
            System.out.format("Tháng %d có %d ngày\n", a, checkDayofMonth(a));
        } else {
            System.out.format("%d không phải là một tháng trong năm\n", a);
        }
    }

    public static boolean checkValidMonth(int a) {
        return (a > 0 && a <= 12);
    }

    public static int checkDayofMonth(int a) {
        if (checkValidMonth(a)) {
            switch (a) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return 28;
            }
        }
        return 0;
    }
}
