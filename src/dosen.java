/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class dosen {
    private String namaDosen;
    private String nip;

    public dosen(String namaDosen, String nip) {
        this.namaDosen = namaDosen;
        this.nip = nip;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public void info(){
        System.out.println("Nama Dosen : "+getNamaDosen());
        System.out.println("Nip Dosen : "+getNip());
    }
    
}
