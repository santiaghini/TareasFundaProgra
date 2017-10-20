/* 6. Los resultados de las últimas elecciones a alcalde en el pueblo Santa Fe han sido los siguientes:
Distrito    Candidatos
            A     B     C     D
1          194   48    206    45
2          180   20    320    16
3          221   90    140    20
4          432   50    821    14
5          820   61    946    18
Escribir un programa que haga las siguiente tareas:
a) Imprimir la tabla anterior con cabeceras incluidas.
b) Calcular e imprimir el número total de votos recibidos por cada candidato y
el porcentaje del total de votos emitidos. Asimismo, visualizar el candidato más votado.
c) Si algún candidato recibe más de 50% de los datos, el programa imprimirá un mensaje
declarándole ganador.
d) Si ningún candidato recibe más de 50% de los datos, el programa debe imprimir
el nombre de los dos candidatos más votados, que serán los que pasen a la segunda
ronda de las elecciones.

_______________________________________________________________________
* Desarrollado por Santiago Hernández, Gerardo Anglada e Isaac Harari *
*            Tecnológico de Monterrey Campus Santa Fe                 *
_______________________________________________________________________


*/
import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class Arreglos6{

  /*
  Distrito    Candidatos
              A     B     C     D
  1          194   48    206    45
  2          180   20    320    16
  3          221   90    140    20
  4          432   50    821    14
  5          820   61    946    18
  */

  public static void main(String[] args) {

    Random numRandom = new Random();
    int conteo = 0;

    int[][] array = new int[5][4];

    for (int i = 0; i<array.length; i++) {
      for (int j = 0; j<array[0].length; j++) {

        array[i][j] = numRandom.nextInt(1001);
        System.out.printf("%d\t" , array[i][j]);
        conteo++;
      }
      System.out.println();
    }

    /*
    array[0][0] = 194;
    array[0][1] = 48;
    array[0][2] = 206;
    array[0][3] = 45;
    array[1][0] = 180;
    array[1][1] = 20;
    array[1][2] = 320;
    array[1][3] = 16;
    array[2][0] = 221;
    array[2][1] = 90;
    array[2][2] = 140;
    array[2][3] = 20;
    array[3][0] = 432;
    array[3][1] = 50;
    array[3][2] = 821;
    array[3][3] = 14;
    array[4][0] = 820;
    array[4][1] = 61;
    array[4][2] = 946;
    array[4][3] = 18;
    */

    imprimir(array);
    suma(array);

  }

  public static void imprimir(int[][] array){
    System.out.printf("Distrito\tCandidatos\t %n");
    System.out.printf("\tA\tB\tC\tD %n");
    for (int i = 0; i<array.length; i++) {
      System.out.printf("%d\t" , i+1);
      for (int j = 0; j<array[0].length; j++) {
        System.out.printf("%d\t" , array[i][j]);
      }
      System.out.println();
    }
  }

  public static void suma(int[][] array){
    int votosA = 0;
    int votosB = 0;
    int votosC = 0;
    int votosD = 0;

    for (int i = 0; i<array.length; i++) {
      votosA += array[i][0];
    }
    for (int i = 0; i<array.length; i++) {
      votosB += array[i][1];
    }
    for (int i = 0; i<array.length; i++) {
      votosC += array[i][2];
    }
    for (int i = 0; i<array.length; i++) {
      votosD += array[i][3];
    }

    double tot = votosA+votosB+votosC+votosD;

    double porA = porcentaje(votosA , tot);
    double porB = porcentaje(votosB , tot);
    double porC = porcentaje(votosC , tot);
    double porD = porcentaje(votosD , tot);

    System.out.println("El candidato A tuvo " + votosA + " votos, que es el " + porcentaje(votosA , tot) + "% de los votos.");
    System.out.println("El candidato B tuvo " + votosB + " votos, que es el " + porcentaje(votosB , tot) + "% de los votos.");
    System.out.println("El candidato C tuvo " + votosC + " votos, que es el " + porcentaje(votosC , tot) + "% de los votos.");
    System.out.println("El candidato D tuvo " + votosD + " votos, que es el " + porcentaje(votosD , tot) + "% de los votos.");

    Map<String, String> map = new HashMap<String, String>();
    map.put(String.valueOf(porA) , "A");
    map.put(String.valueOf(porB) , "B");
    map.put(String.valueOf(porC) , "C");
    map.put(String.valueOf(porD) , "D");

    double[] porcentajes = new double[4];
    porcentajes[0] = porA;
    porcentajes[1] = porB;
    porcentajes[2] = porC;
    porcentajes[3] = porD;

    double max = 0;
    double max2 = 0;

    for (int i = 0; i < porcentajes.length; i++) {
      double a = porcentajes[i];
      if(a > 50.0){
        System.out.println("El candidato " + map.get(String.valueOf(a)) +  " es ganador." + i);
      } else {
        if(a>max){
          max = a;

        }
        if(a>max2 && a<max){
          max2 = a;

        }
      }
    }

    System.out.println("Los candidatos "  + map.get(String.valueOf(max)) + " y " + map.get(String.valueOf(max2)) + " irán a segunda ronda.");

  }

  public static double porcentaje(int a , double tot){
    double per = (a*100)/tot;
    return per;
  }

}

/*
____________________RESULTADO EN TERMINAL____________________
MacBook-Air-de-Manuel:arreglos_2 hergutair$ java Arreglos6
792	703	535	771
987	768	695	995
159	624	851	423
343	785	992	790
568	847	181	141
Conteo: 20
Distrito	Candidatos
	      A   B   C   D
1	     792	703	535	771
2	     987	768	695	995
3	     159	624	851	423
4	     343	785	992	790
5	     568	847	181	141
El candidato A tuvo 2849 votos, que es el 22.0% de los votos.
El candidato B tuvo 3727 votos, que es el 28.77992277992278% de los votos.
El candidato C tuvo 3254 votos, que es el 25.127413127413128% de los votos.
El candidato D tuvo 3120 votos, que es el 24.092664092664094% de los votos.
Los candidatos B y C irán a segunda ronda.
