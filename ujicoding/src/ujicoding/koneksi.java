/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ujicoding;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author user
 */
public class koneksi {
  private String databasename="fotokopi";
  private String username="root";
  private String password="";
  private String lokasi="jdbc:mysql://localhost/"+databasename;
  public static Connection koneksidb;
    private boolean Data;
  
  public koneksi(){
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          koneksidb=DriverManager.getConnection(lokasi,username,password);
          System.out.println("Database Terkoneksi");
      } catch (Exception e) {
          System.err.println(e.getMessage());
      }
  }
  
  public void simpanFotokopi(int id, int jumlah_halaman, String status, double total_bayar) {
      try {
          String kode = "INSERT INTO fotokopi (id, jumlah_halaman, status, total_bayar) VALUES (?,?,?,?)";
          PreparedStatement perintah = koneksidb.prepareStatement(kode);
          perintah.setInt(1, id);
          perintah.setInt(2, jumlah_halaman);
          perintah.setString(3, status);
          perintah.setDouble(4, total_bayar);
          perintah.executeUpdate();
          System.out.println("Data Berhasil Disimpan");
      } catch (Exception e) {
          System.err.println(e.getMessage());
      }
  }
}


