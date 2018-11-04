/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class matkul {
    private String matkul;
    private dosen dosen;
    private int nilai;
    private mahasiswa mhs;

    public matkul(String matkul, dosen dosen, int nilai, mahasiswa mhs) {
        this.matkul = matkul;
        this.dosen = dosen;
        this.nilai = nilai;
        this.mhs = mhs;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public dosen getDosen() {
        return dosen;
    }

    public void setDosen(dosen dosen) {
        this.dosen = dosen;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    public mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(mahasiswa mhs) {
        this.mhs = mhs;
    }
    
    
}
