/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[]args){
        dosen Dosen = new dosen("Epis Kuswono","123456789");
        mahasiswa Mhs = new mahasiswa("Muhammad Iqbal Kharis Firismanda","987654321");
        matkul Matkul = new matkul("Pemrograman Berbasis Objek",Dosen,80,Mhs);
        
        
    }
}
