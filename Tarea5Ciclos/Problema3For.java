import java.util.Scanner;

public class Problema3For {

//Calcular el promedio de calificaciones introducidas por teclado.

    public static void main(String[] args) {
        double numMat;
        int total=0;
        double prom, calif;
        Scanner lectura = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones vas a meter?: ");
        numMat = lectura.nextInt();

        for (int num=1; num<=numMat; num++){
            System.out.print("Calificacion " + num + ": ");
            calif=lectura.nextInt();
            total+=calif;
        }
        prom=total/numMat;
        System.out.printf("El promedio de estas "+numMat+" materias es: %.2f %n", prom);
    }//fin del main
}//fin de la clase
