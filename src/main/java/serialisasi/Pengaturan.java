/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;

/**
 *
 * @author Hanif
 */
public class Pengaturan implements Serializable{
    private String host, username, password;
    final int port; // cuma bisa sekali atur nilainya
    static String nama; // milik kelas / dipake rame rame dan gak ikut diserialisasi
    transient String motivasi; // milik instance objek dan gak ikut diserialisasi
    
    public Pengaturan(){
        this.port = 3306;
    }
    
    public Pengaturan(String host, int port, String user, String pass, String nama, String motivasi){
        this.host = host;
        this.port = port;
        this.username = user;
        this.password = pass;
        
        Pengaturan.nama = nama;
        this.motivasi = motivasi;
    }
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    } 
    
    public int getPort(){
        return port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Pengaturan.nama = nama;
    }

    public String getMotivasi() {
        return motivasi;
    }

    public void setMotivasi(String motivasi) {
        this.motivasi = motivasi;
    }
}
