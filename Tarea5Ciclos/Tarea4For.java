import java.util.Scanner;

public class Tarea4For{

  public static void main(String[] args){

    Scanner lector = new Scanner(System.in);

    System.out.println("Escribe un número: ");
    int n = lector.nextInt();
    String out = "";

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j<=i; j++) {
        System.out.print(j);
      }

      System.out.println("");
    }

    for (int k = (n-1); k>0 ; k-- ) {
      for (int j = 1; j<=k; j++) {
        System.out.print(j);
      }
      System.out.println("");
    }


  }

}

/*
MacBook-Air-de-Manuel:Tarea5Ciclos hergutair$ java Tarea4For
Escribe un numero:
10
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
123456789
12345678
1234567
123456
12345
1234
123
12
1
*/
