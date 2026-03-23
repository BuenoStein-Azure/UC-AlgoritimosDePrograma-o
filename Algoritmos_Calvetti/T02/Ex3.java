package Algoritmos_Calvetti.T02;

import java.util.Scanner;
public class Ex3 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double r = sc.nextDouble();
 double h = sc.nextDouble();
 double volume = Math.PI * Math.pow(r, 2) * h;
 System.out.println(volume);
 }
}
