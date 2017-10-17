public class e4t2{
  public static void main(String[] args) {

    int b,k;
    k=0;
    for (int j = 1 ;k<80 ;j++ ) {
        b=0;

        for (int d = 1 ; d<=1000000 ; d++ ) {
          if (j%d == 0) {
              b=b+1;
          }
        }
          if (b==2) {
            System.out.printf("El número %d es primo.%n ",j);
            k = k+1;
      }
    }
  }
}
