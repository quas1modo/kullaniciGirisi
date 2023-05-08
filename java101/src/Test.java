import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a;
        String userName, password, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else if(userName.equals("patika") && password!="java123") {
            System.out.print("Şifre yanlış, yeni şifre oluşturun: ");

            newPassword = input.nextLine();
            if (newPassword.equals(password)) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }
            else {
                System.out.printf("Şifre oluşturuldu");
            }
        }
         else {
            System.out.println("Bilgileriniz Yanlış!");
        }
    }
}
