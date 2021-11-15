import java.util.*;
class test1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Введите первое число - ");
        int a= sc.nextInt();
        System.out.print("Введите второе число - ");
        int b= sc.nextInt();
        System.out.print("Введите третье число - ");
        int c= sc.nextInt();
        System.out.print("Введите четвертое число - ");
        int d= sc.nextInt();
        if (a <= b && a <= c && a <= d) {
            System.out.println("Наименьшее число = " + a);
        }
        else if (b <= c && b <= d) {
            System.out.println("Наименьшее число = " + b);
        }
        else if (c <= d) {
            System.out.println("Наименьшее число = " + c);
        } else {
            System.out.println("Наименьшее число = " + d);
        }
    }
}
//zad1