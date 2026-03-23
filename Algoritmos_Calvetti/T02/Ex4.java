package Algoritmos_Calvetti.T02;

import java.util.Scanner;
public class Ex4 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double potencia = sc.nextDouble();
 double horas = sc.nextDouble();
 double preco = sc.nextDouble();
 double consumoKwh = (potencia * horas * 30) / 1000;
 double custo = consumoKwh * preco;
 System.out.printf("%.2f", custo);
 }
}