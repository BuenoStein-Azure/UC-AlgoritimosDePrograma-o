package Algoritmos_Calvetti.T03;
public class Ex6 {
    public static void main(String[] args) {
    int totalSegundos = 3661;
    int horas = totalSegundos / 3600;
    int minutos = (totalSegundos % 3600) / 60;
    int segundos = totalSegundos % 60;
    System.out.println(horas + "h " + minutos + "m " + segundos + "s");
    }
   }