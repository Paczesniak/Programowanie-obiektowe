import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wybory;
        do {
            System.out.println("\n--------Wybierz numer zadanie--------");
            System.out.println("[1] - z1");
            System.out.println("[2] - z2");
            System.out.println("[5] - z5");
            System.out.println("[6] - z6");
            System.out.println("[7] - z7");
            System.out.println("[0] - Wyjście\n");

            wybory = scanner.nextInt();

            switch (wybory) {
                case 1:
                    System.out.println(zadanie1());
                    break;
                case 2:
                    System.out.println(zadanie2());
                    break;
                case 5:
                    System.out.println(zadanie5());
                    break;
                case 6:
                    System.out.println(zadanie6());
                    break;
                case 7:
                    System.out.println(zadanie7());
                    break;
                case 0:
                    System.out.println("Do widzenia!");
                    break;
                default:
                    System.out.println("Niepoprawny numer zadania!");
                    break;
            }
        } while (wybory != 0);
        }


    

    public static String zadanie1() {
        System.out.println("--------Zadanie 1--------");
        System.out.println("[Delta]");
        double a, b, c;
        Scanner klaw = new Scanner(System.in);
        System.out.println("liczba a=");
        a = klaw.nextFloat();
        System.out.println("liczba b=");
        b = klaw.nextFloat();
        System.out.println("liczba c=");
        c = klaw.nextFloat();
        if (a == 0)
            liniowe(b, c);
        else {
            double delta;
            delta = b * b - 4 * a * c;
            System.out.println("\nWynik delty to: " + delta);
            if (delta < 0)
                System.out.println("Barak rozwiązania");
            else if (delta == 0) {
                double x;
                x = -b / (2 * a);
                System.out.println("Jedno rozwiązanie");
                System.out.println(x);
            } else {
                double x1, x2;
                x1 = (-b + sqrt(delta)) / (2 * a);
                x2 = (-b - sqrt(delta)) / (2 * a);
                System.out.print("x1 = ");
                System.out.println(x1);
                System.out.print("x2 = ");
                System.out.println(x2);
            }
        }
        return "\nzadanie zakończone!!!!!\n";
    }

    static void liniowe(double a, double b) {
        if (a == 0)
            if (b == 0)
                System.out.println("Rownanie tozsamosciowe");
            else
                System.out.println("Rownanie sprzeczne");
        else {
            double x;
            x = -b / a;
            System.out.print("Rownanie liniowe, x = ");
            System.out.println(x);
        }
    }


    public static String zadanie2() {
        System.out.println("--------Zadanie 2--------");
        double a, b, wynik;
        Scanner scanner = new Scanner(System.in);
        int wybor;

        do {
            System.out.println("\n--------KALKULATOR--------\n");
            System.out.println("[1]. Suma");
            System.out.println("[2]. Różnica");
            System.out.println("[3]. Iloczyn");
            System.out.println("[4]. Iloraz");
            System.out.println("[5]. Potęga");
            System.out.println("[6]. Pierwiastek");
            System.out.println("[7]. Sinus");
            System.out.println("[8]. Cosinus");
            System.out.println("[9]. Tangens");
            System.out.println("[10]. Cotangens");
            System.out.println("[0]. Wyjście");
            System.out.print("\nWybierz opcję: \n");
            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("\nSuma\n");
                    System.out.print("Podaj pierwszą liczbę: ");
                    a = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    b = scanner.nextDouble();
                    wynik = a + b;
                    System.out.println("Wynik: " + wynik);
                    break;
                case 2:
                    System.out.println("\nRóżnica\n");
                    System.out.print("Podaj pierwszą liczbę: ");
                    a = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    b = scanner.nextDouble();
                    wynik = a - b;
                    System.out.println("Wynik: " + wynik);
                    break;
                case 3:
                    System.out.println("\nIloczyn\n");
                    System.out.print("Podaj pierwszą liczbę: ");
                    a = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    b = scanner.nextDouble();
                    wynik = a * b;
                    System.out.println("Wynik: " + wynik);
                    break;
                case 4:
                    System.out.println("\nIloraz\n");
                    System.out.print("Podaj pierwszą liczbę: ");
                    a = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    b = scanner.nextDouble();
                    if (b == 0) {
                        System.out.println("Nie można dzielić przez zero!");
                    } else {
                        System.out.println("Wynik: " + ((double) a / b));
                    }
                    break;
                case 5:
                    System.out.println("\nPotęga\n");
                    System.out.print("Podaj liczbę: ");
                    a = scanner.nextDouble();
                    System.out.print("Podaj potęgę: ");
                    b = scanner.nextDouble();
                    wynik = Math.pow(a, b);
                    System.out.println("Wynik: " + wynik);
                    break;
                case 6:
                    System.out.println("\nPierwiastek\n");
                    System.out.print("Podaj liczbę: ");
                    a = scanner.nextDouble();
                    wynik = Math.sqrt(a);
                    System.out.println("Wynik: " + wynik);
                    break;
                case 7:
                    System.out.println("\nSinus\n");
                    System.out.print("Podaj kąt w radianach: ");
                    a = scanner.nextDouble();
                    wynik = Math.sin(a);
                    System.out.println("Sinus: " + wynik);
                    break;
                case 8:
                    System.out.println("\nCosinus\n");
                    System.out.print("Podaj kąt w radianach: ");
                    a = scanner.nextDouble();
                    wynik = Math.cos(a);
                    System.out.println("Cosinus: " + wynik);
                    break;
                case 9:
                    System.out.println("\nTangens\n");
                    System.out.print("Podaj kąt w radianach: ");
                    a = scanner.nextDouble();
                    wynik = Math.tan(a);
                    System.out.println("Tangens: " + wynik);
                    break;
                case 10:
                    System.out.println("\nCotangens\n");
                    System.out.print("Podaj kąt w radianach: ");
                    a = scanner.nextDouble();
                    wynik = 1.0 / Math.tan(a);
                    System.out.println("Cotangens: " + wynik);
                    break;
                case 0:
                    System.out.println("NARA!");
                    System.out.println("────────────────────██████──────────");
                    System.out.println("──────────────────██▓▓▓▓▓▓██────────");
                    System.out.println("────────────────██▓▓▓▓▒▒▒▒██────────");
                    System.out.println("────────────────██▓▓▒▒▒▒▒▒██────────");
                    System.out.println("──────────────██▓▓▓▓▒▒▒▒██──────────");
                    System.out.println("──────────────██▓▓▒▒▒▒▒▒██──────────");
                    System.out.println("────────────██▓▓▓▓▒▒▒▒▒▒██──────────");
                    System.out.println("────────────████▒▒████▒▒██──────────");
                    System.out.println("────────────██▓▓▒▒▒▒▒▒▒▒██──────────");
                    System.out.println("──────────██────▒▒────▒▒██──────────");
                    System.out.println("──────────████──▒▒██──▒▒██──────────");
                    System.out.println("──────────██────▒▒────▒▒██──────────");
                    System.out.println("──────────██▒▒▒▒▒▒▒▒▒▒▒▒██──────────");
                    System.out.println("──────────████████████▒▒▒▒██────────");
                    System.out.println("────────██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██──────");
                    System.out.println("──────██▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒██────");
                    System.out.println("────██▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒██──");
                    System.out.println("──██▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒██");
                    System.out.println("██▓▓▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒██");
                    System.out.println("██▓▓▒▒▓▓▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒██");
                    System.out.println("██▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓██");
                    System.out.println("──████▐▌▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐▌▐▌████──");
                    System.out.println("────██▐▌▐▌▌▌▌▌▌▌▌▌▐▌▐▌▐▌▐▌▌▌▐▌██────");
                    System.out.println("────██▌▌▐▌▐▌▌▌▐▌▌▌▌▌▐▌▌▌▌▌▌▌▌▌██────");
                    System.out.println("──────██▌▌▐▌▐▌▐▌▐▌▐▌▐▌▐▌▌▌▌▌██──────");
                    System.out.println("──────██▐▌▐▌▐▌████████▐▌▌▌▌▌██──────");
                    System.out.println("────────██▒▒██────────██▒▒██────────");
                    System.out.println("────────██████────────██████────────");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja! Wybierz ponownie.");


            }
        } while (wybor != 0);

        return "----No this is PARTICK----";
    }




    public static String zadanie5(){
        System.out.println("--------Zadanie 5--------");
        for (int i = 20; i >= 0; i--) {
            if (i == 2 || i == 6 || i == 9 || i == 15 || i == 19) {
                continue;
            }
            System.out.println(i);
        }
        return null;
    }




    public static String zadanie6(){
        System.out.println("--------Zadanie 6--------");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbe calkowita: ");
            int liczba = scanner.nextInt();
            if (liczba < 0) {
                break;
            }
        }
        System.out.println("Koniec programu.");
        return "Liczba nie jest liczbą całkowitą !!!!!";
    }




    public static String zadanie7(){
        System.out.println("--------Zadanie 7--------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe elementow: ");
        int n = scanner.nextInt();

        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbe: ");
            tablica[i] = scanner.nextInt();
        }

        // Sortowanie babelkowe
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    int temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                }
            }
        }

        System.out.print("Posortowana lista: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();

        return "koniec!!!!";
    }
}

