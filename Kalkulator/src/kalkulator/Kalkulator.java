/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;
import javax.swing.JFrame;
import javax.swing.UIManager;


/**
 *
 * @author 62877
 */
public class Kalkulator {
public long operan1;
public long operan2;

public enum jenisOperasi{
    TIDAKADA,TAMBAH,KURANG,KALI
}

 jenisOperasi operasiSaatIni;
 
 //constructor
 
public Kalkulator(){
    operan1=operan2=0;
    operasiSaatIni =jenisOperasi.TIDAKADA;
}

public void reset(){
    operan1=0;
    operasiSaatIni = jenisOperasi.TIDAKADA;
}

public void tambahkan(long op){
    if(operasiSaatIni != jenisOperasi.TAMBAH){
        operasiSaatIni = jenisOperasi.TAMBAH;
        operan1=op;
    }else{
        operan2=op;
    }
}

public void kurangkan(long op){
    if(operasiSaatIni != jenisOperasi.KURANG){
        operasiSaatIni = jenisOperasi.KURANG;
        operan1=op;
    }else{
        operan2=op;
    }
}



public long eksekusiOperasi(long op){
    long hasil=0;
    operan2=op;
    switch(operasiSaatIni){
        case TAMBAH:
            hasil=operan1 + operan2;
            break;
        case KURANG:
            hasil=operan1 - operan2;
            break;
        case KALI:
            hasil=operan1 * operan2;
            break;
        case TIDAKADA:
            
    }
    reset();
    return hasil;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        UIManager.setLookAndFeel(
               UIManager.getSystemLookAndFeelClassName()
       );
    } catch (Exception e) {
        System.out.println("Gagal mengganti Look and Feel");
        
    }
   
        KalkulatorFrame frame= new KalkulatorFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}
