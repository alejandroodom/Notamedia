import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        double nota;
        do {
            System.out.println("¿Nota?");
            nota = input.nextDouble();
            if (nota != -1) {
                notas.add(nota);
            }
        } while (nota != -1);
        input.close();
        double suma = 0;
        for (Double n : notas) {
            suma += n;
        }
        double media = suma / notas.size();
        System.out.print("La media de las notas (");
        for (Double n : notas) {
            System.out.print(n + ";");
        }
        System.out.println(") es: " + media + ".");
    }
}
