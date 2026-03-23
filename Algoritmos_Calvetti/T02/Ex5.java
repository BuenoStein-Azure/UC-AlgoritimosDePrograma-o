package Algoritmos_Calvetti.T02;

import java.util.Scanner;
public class Ex5 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double raio = sc.nextDouble();
 double preco_m2 = sc.nextDouble();
 double area = Math.PI * Math.pow(raio, 2);
 double custo = area * preco_m2;
 System.out.println(area);
 System.out.println(custo);
 }
}
