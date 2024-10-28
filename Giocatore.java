/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Giosuè Laurenzi
 */
public class Giocatore extends Thread{
 private int idGiocatore;
 private String nomeGiocatore;
 private int palleggi;
 

    /** 
    * Param javaDoc
    * Metodo costruttore
    * @param idGiocatore codice del giocatore
    * @param estrazione riferimento dell'oggetto Estrazione
    * 
    */
    public Giocatore(int idGiocatore, String nomeGiocatore) {
       this.idGiocatore=idGiocatore;
       this.nomeGiocatore=nomeGiocatore;
       
       
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        System.out.println("Giocatore id: "+ idGiocatore + "Palleggi: " + palleggi);
        
        
        
        while (palleggi < 10){
            palleggi++;
            System.out.println("Giocatore id: "+ idGiocatore + "Palleggi: " + palleggi);
            Thread.yield();
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
            }



    }
    
       // estrazione.verifica(numeroScelto, idGiocatore);
       // System.out.println("Giocatore id : " + idGiocatore + " ho verificato il mio numero.FINE");
    }
}
