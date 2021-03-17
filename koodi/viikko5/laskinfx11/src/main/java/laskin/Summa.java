/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Tomi
 */
public class Summa extends Komento {
    
    

    public Summa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);

    }

    @Override
    public void suorita() {

        int tulos = Integer.valueOf(tuloskentta.getText());

        int syote = Integer.valueOf(syotekentta.getText());
        sovellus.plus(syote);

        tuloskentta.setText(String.valueOf(tulos + syote));

        this.nollaa.disableProperty().set(false);
        this.undo.disableProperty().set(false);
        
        int vanha = molemmatTulokset[0];
        

        molemmatTulokset[0] = tulos + syote;
        molemmatTulokset[1] = vanha;
        
        sovellus.setTulos(tulos+syote);
        
        System.out.println("Summa: uusi: "+molemmatTulokset[0] +" vanha: "+ molemmatTulokset[1]);
        

    }

}
