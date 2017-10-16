import java.util.Scanner;

public class Tarea4While{

  public static void main(String[] args){

    Scanner lector = new Scanner(System.in);

    System.out.println("Escribe un número: ");
    int n = lector.nextInt();
    String out = "";

    int i = 1;

    while(i<=n){
      int j = 1;
      while(j<=i){
        System.out.print(j);
        j++;
      }
      System.out.println("");
      i++;
    }

    int k = (n-1);
    while(k>0){
      int a = 1;
      while(a<=k){
        System.out.print(a);
        a++;
      }
      System.out.println("");
      k--;

    }

  }

}
