import java.util.Scanner;
public class Ex3 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int atual = sc.nextInt();
 int minimo = sc.nextInt();
 if (atual < minimo) {
 System.out.println("Efetuar Compra");
 } else {
 System.out.println("Estoque OK");
 }
 }
}