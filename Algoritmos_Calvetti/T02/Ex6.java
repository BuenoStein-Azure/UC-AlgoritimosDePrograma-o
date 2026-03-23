package Algoritmos_Calvetti.T02;

import java.util.Scanner;
public class Ex6 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double a = sc.nextDouble();
 double b = sc.nextDouble();
 double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
 System.out.println(h);
 }
}