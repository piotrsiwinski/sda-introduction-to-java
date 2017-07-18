package oop.arrayoperations;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-18.
 */
public class Matrix {
    private int[][] macierz;
    private int m;
    private int n;

    public int[][] getMacierz() {
        return macierz;
    }

    public void setMacierz(int[][] macierz) {
        this.macierz = macierz;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Matrix() {
        m = 3;
        n = 3;
        macierz = new int[m][n];
    }

    //metoda do wypelniania wartosciami
    public void initializeMatrix() {
        // zrobic scannera
        //wczytac elementy do macierzy
        System.out.println("Podaj elementy macierzy");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                macierz[i][j] = sc.nextInt();
            }

        }
    }

    //metoda do wypisywania wartosci
    public void printMatrix() {
        //wypianie elementow na konsole
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //this.macierz[i][j] -> obiekt o nazwie macierz1
    //argument to macierz2 -> przychodzi z zewnatrz
    //zwracamy wynikowa macierz

    public Matrix addMatrix(Matrix drugaMacierz) {
        Matrix wynikowa = new Matrix();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                wynikowa.getMacierz()[i][j] = this.macierz[i][j] + drugaMacierz.getMacierz()[i][j];
            }
        }

        return wynikowa;

    }

}
