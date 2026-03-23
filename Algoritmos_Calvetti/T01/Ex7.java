import java.util.Scanner;
public class Ex7 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int codigo = sc.nextInt();
 if (codigo == 1234) {
 System.out.println("Acesso Permitido");
 } else {
 System.out.println("Acesso Negado");
 }
}
}