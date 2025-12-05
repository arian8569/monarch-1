import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k , l ;

        System.out.print("به برنامه خود امدید ");
        System.out.println("۲ عدد وارد کنید");

        System.out.print("Enter Your First Number: ");
        int fa = input.nextInt();

        System.out.print("Enter Your Second Number: ");
        int fb = input.nextInt();

        System.out.println("عملیات مورد نطر خود را وارد کنید ");
        System.out.println("1: جمع کردن 2: تفریق کردن 3:ضرب کردن 4:تقسیم کردن");
        System.out.println("5: گرفتن باقی مانده 6: به توان رساندن 7:گرفتن مجموع 8:فاکتوریل ۲عدد");
        System.out.print("عدد عملیات را وارد کنید:");
        int w = input.nextInt();

        switch (w) {
            case 1:
                k = Calculator.sum(fa, fb);
                System.out.println("...");
                System.out.println("جمع " + k );
                break;

            case 2:
                k = Calculator.sub(fa, fb);
                System.out.println("...");
                System.out.println("تفریق " + k );
                break;

            case 3:
                k = Calculator.mul(fa, fb);
                System.out.println("...");
                System.out.println("ضرب " + k );
                break;

            case 4:
                k = Calculator.div(fa, fb);
                System.out.println("...");
                System.out.println("تقسیم " + k );
                break;

            case 5:
                k = Calculator.mod(fa, fb);
                System.out.println("...");
                System.out.println("باقی مانده " + k );
                break;

            case 6:
                k = Calculator.pow(fa, fb);
                System.out.println("...");
                System.out.println("توان مورد نظر " + k );
                break;

            case 7:
                k = Calculator.jok(fa, fb);
                System.out.println("...");
                System.out.println("مجموع اعداد " + k );
                break;

            case 8:
                k = Calculator.factorial(fa);
                l = Calculator.factorial(fb);
                System.out.println("...");
                System.out.println("factorial a is " + k );
                System.out.println("...");
                System.out.println("factorial b is " + l );
                break;
        }

        System.out.println(":)");


    }
}