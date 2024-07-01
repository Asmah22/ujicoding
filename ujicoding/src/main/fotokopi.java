/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author user
 */
public class fotokopi {
    int id, jumlah_halaman;
    String status;
    double total_bayar;

    public fotokopi(int id, int jumlah_halaman, String status, double total_bayar) {
        this.id = id;
        this.jumlah_halaman = jumlah_halaman;
        this.status = status;
        this.total_bayar = total_bayar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJumlahHalaman() {
        return jumlah_halaman;
    }

    public void setJumlahHalaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalBayar() {
        return total_bayar;
    }

    public void setTotalBayar(double total_bayar) {
        this.total_bayar = total_bayar;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}

