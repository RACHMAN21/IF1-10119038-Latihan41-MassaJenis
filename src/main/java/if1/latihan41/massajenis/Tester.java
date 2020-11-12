/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan41.massajenis;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan massa jenis sebuah
 *                     kubus dengan konsep pendekatan object oriented
 */

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kubus kubus = new Kubus();
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.print("Sisi  : ");
        kubus.setSisi(sc.nextInt());
        System.out.print("Massa : ");
        kubus.setMassa(sc.nextInt());

        System.out.println();

        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume      : "+kubus.hitungVolume(0));
        System.out.println("Massa Jenis : "+kubus.hitungMassaJenis(0,0));
    }
}