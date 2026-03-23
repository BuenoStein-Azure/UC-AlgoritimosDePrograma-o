import java.util.Scanner;
public class Ex1 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double volume = sc.nextDouble();
 double consumo = sc.nextDouble();
 double totalKg = volume * consumo;
 double sacos = Math.ceil(totalKg / 50);
 System.out.println(sacos);
 }
}
