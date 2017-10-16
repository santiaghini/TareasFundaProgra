import java.util.Scanner;

public class Tarea4DoWhile{

  public static void main(String[] args){

    Scanner lector = new Scanner(System.in);

    System.out.println("Escribe un número: ");
    int n = lector.nextInt();
    String out = "";

    int i = 1;
    do {
      int j = 1;
      do{
        System.out.print(j);
        j++;
      } while(j<=i);
      System.out.println("");
      i++;
    } while (i<=n);

    int k = (n-1);

    do {
      int a = 1;
      do{
        System.out.print(a);
        a++;
      } while(a<=k);
      System.out.println("");
      k--;
    } while (k>0);


  }

}
