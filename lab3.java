package IiELab2.Lab03;

import java.util.Arrays;
import java.util.Random;

public class ArrrayExmple{
        public static void main(String[] args){
         /*   final int arrLen = 10;
            int[] array;
            array = new int[arrLen];
            int[] arrayInt = new int[arrLen];
            int[] arrInt = {1,2,3,4,5};

            String[] arrayString = new String[]{"ala", "ma", "kota"};
            char[] arrayChar = new char[]{'a','b','c'};

            for (int i = 0; i <arrayInt.length ; i++) {   //długoś tablicy "arryInt.lenght"
                System.out.print(arrInt[i]+" ");            // po kolei przechodzi przez tablice z wykorzystaniem oznaczników 0,1,2,3...
            }

            for (int item: arrayInt) {              // pętla foreach polega na pokazaniu poszczegulnego elementu
                System.out.print(item+" ");

            }

            System.out.println(Arrays.toString(arrInt)); //konwertuje int na string "Arrays.toString(arrInt)"

            //kursor na dane stwierdzenie komende i uzyj ctrl + B

            int[] array = new int[100];
            Arrays.fill(array,0);       //zerowanie całej tablicy przez polecenie "fill"


          // -----------------------------------------------------------------------------------
           int[] arrInt = {1,2,3,4,5};
           int[] arrInt1 = {1,2,3};
           int[] arrInta = {1,2,3,4,5};
           int[] arrInt2 = {1,3,3};
           int[] arrIntb = {1,2,3,4,5,7,8,6,5,3};

            System.out.println("equals: "+Arrays.equals(arrInt, arrInt1));
            System.out.println("compare: "+Arrays.equals(arrInt, arrInt1));
            System.out.println("compare: "+Arrays.equals(arrInt, arrIntb));
            System.out.println("compare: "+Arrays.equals(arrInt1, arrInt2));
            System.out.println("compare: "+Arrays.equals(arrInt, arrInta));
            //---------------------------------------------------------------------------------


            String tekst = "ala ma kota, kot ma ale";   // konwertuje tekst na tablice
            String[] textArr = tekst.split(" ");
            char[] charArr = tekst.toCharArray();
            System.out.println(Arrays.toString(charArr)); //konewrtuje na znaki wszystko nawet spacje

            //---------------------------------------------------------------------------------

            int[][] matrixA = new int[3][4];
            int[][][] matrix3D = new int[3][4][12];     //tablice wielowymiarowe

            int[][] date = {
                    {1,2,3},
                    {3,4,5,6,7,3},
                    {1},
            };

            for (int i = 0; i < date.length; i++) {         //odczytywanie tablicy wielowymiarowej
                for (int j = 0; j < date[i].length; j++) {
                    System.out.print(date[i][j]+" ");
                }
                System.out.println();
            }

            for (int[] itemArray: date){            //przechodzi po każdym elemencie z osobna
                for (int item: itemArray){
                    System.out.print(item+" ");
                }
                System.out.println();
              }

            //-----------------------------------------------------------------------------------

            int array = {1,3,4,5,0};        //kopiowanie
            int arrayCopy = new int [5];

            System.arraycopy(array, 0,arrayCopy, 2,2);
            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(arrayCopy));

            // int[] arrayCopy1 = Arrays.copyOfRange(array, 0,array.length); //cos takiego??? inny przykład

            //-------------------------------------------------------------------------------------

                                                //zadanie 1

            */                                  //to w main 

            int[] array = returnArray();
            sum(array);
        }
                                             // to juz nie w main
        //losowanie liczb
        public static  int RandInt{
            Random rand = new Random();
            int liczba = rand.nextInt(34)-9;
            return liczba;
        }

        public static int[] returnArray(){
            final int arrLen = 6;
            int[] arrayInt = new int[arrLen];
            for (int i = 0; i < arrayInt.length; i++) {
                arrayInt[i]=RandInt();
            }
            return arrayInt;
        }

        public static int sum(int[] array){
            int suma = 0;
            for (int i = 0; i < array.length; i++) {
                suma+=array[i];
            }
            System.out.println("Suma "+ suma);
            return suma;
        }
    }

