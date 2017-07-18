package oop.arrayoperations;

/**
 * Created by RENT on 2017-07-18.
 */
public class MatrixExcercise {
    public void start(){
        //INICJALIZACJA PIERWSZEJ MACIERZY
        Matrix macierz1 = new Matrix();

        macierz1.initializeMatrix();
        macierz1.printMatrix();


        //Inicjalizacja drugiej macierzy
        Matrix macierz2 = new Matrix();

        macierz2.initializeMatrix();
        macierz2.printMatrix();

        //DODAWANIE MACIERZY
        System.out.println("DODAWANIE");
        Matrix wynik = macierz1.addMatrix(macierz2);
        wynik.printMatrix();
    }
}
