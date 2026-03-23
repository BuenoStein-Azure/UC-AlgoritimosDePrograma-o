package Algoritmos_Calvetti.T02;

import java.util.Scanner;
public class Ex1 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double distancia = sc.nextDouble();
 double tempo = sc.nextDouble();
 double velocidade = distancia / tempo;
 System.out.println(velocidade);
 }
}
