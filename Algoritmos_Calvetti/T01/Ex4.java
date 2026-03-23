import java.util.Scanner;
public class Ex4 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double C = sc.nextDouble();
 double i = sc.nextDouble();
 double t = sc.nextDouble();
 double M = C + (C * i * t);
 System.out.println(M);
 }
}