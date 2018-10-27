/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Hilera implements IHilera{
    private int aux;
    
    public Hilera(){        
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }
        
    @Override
    public ArrayList<String []> countingWords(String [] words) {
        boolean band;
        String auxString;
        int length =words.length,auxMethod;
        aux=1;
        ArrayList wordsCounted = new ArrayList();
        String term [] = new String[length];
        String frequency []= new String[length];
        term[0] = words[0];
        frequency[0]="1";
        for(int i=1; i< length;i++){            
            band =false;
            for(int j=0;j< length;j++){
                if(words[i].equalsIgnoreCase(term[j])){
                    auxMethod = Integer.parseInt(frequency[j]);
                    auxMethod++;
                    auxString = Integer.toString(auxMethod);
                    frequency[j]=auxString;
                    j=length;
                    band=true;
                }
            }
            if(!band){
                term[aux] = words[i];
                frequency[aux]="1";
                aux++;
            }
        }
        wordsCounted.add(term);
        wordsCounted.add(frequency);
        return wordsCounted;
    }
    
}
