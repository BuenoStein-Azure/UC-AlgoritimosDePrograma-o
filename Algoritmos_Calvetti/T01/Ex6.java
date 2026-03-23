import java.util.Scanner;
public class Ex6 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double r = sc.nextDouble();
 double h = sc.nextDouble();
 double volume = Math.PI * r * r * h;
 double litros = volume * 1000;
 System.out.println(litros);
 }
}