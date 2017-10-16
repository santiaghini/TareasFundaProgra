import java.util.Scanner;

public class Tarea5For{

  public static void main(String[] args){

    Scanner lector = new Scanner(System.in);

    System.out.println("Escribe un número de términos para calcular pi: ");
    int n = lector.nextInt();
    String out = "";
    double a = 0.0;

    for (int i = 1; i<=n; i+=2) {
      if (i%2==0) {
        a += -(1/i);
      } else{
        a += +(1/i);
      }

    }

    double pi = 4*(a);
    System.out.println("El resultado es:"  + pi);

  }

}
