import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println(zadanie2());
        System.out.println(zadanie3());
        System.out.println(zadanie4());

    }

    public static String zadanie2() {

        System.out.println("Zadanie 2.");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj a: ");
        int a = input.nextInt();
        System.out.print("Podaj b: ");
        int b = input.nextInt();
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        int suma = a + b;
        int roznica = a - b;
        int iloczyn = a * b;
        float iloraz = (float) a / (float) b;
        String sumaoutput = ("Suma liczb a=" + a + "oraz b=" + b + "jest rówan" + suma + "\n");
        String roznicaoutput = ("Różnica liczb a=" + a + "oraz b=" + b + "jest rówan" + roznica + "\n");
        String iloczynoutput = ("Iloczyn liczb a=" + a + "oraz b=" + b + "jest rówan" + iloczyn + "\n");
        String ilorazoutput = ("Iloraz liczb a=" + a + "oraz b=" + b + "jest rówan" + iloraz + "\n");
        return sumaoutput + roznicaoutput + ilorazoutput + iloczynoutput;
    }
    public static String zadanie3() {
        System.out.println("zadanie 3");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba = input.nextInt();
        if (liczba % 2 == 0) {
            System.out.format("liczba %d jest parzysta\n", liczba);
            return "true";
        } else {
            System.out.format("liczba %d jest nieparzysta\n", liczba);
            return "false";
        }
    }
    public static String zadanie4()
    {

        System.out.println("zadanie 4");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba2 = input.nextInt();
        if (liczba2 % 3 == 0 && liczba2 % 5 == 0) {
            System.out.format("Liczba %d dzieli sie przez 3 i 5\n", liczba2);
            return "true";
        } else {
            System.out.format("Liczba %d niedzieli sie przez 3 i 5\n", liczba2);
            return "false";
        }
    }
}