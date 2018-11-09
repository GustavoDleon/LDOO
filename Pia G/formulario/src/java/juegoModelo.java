/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class juegoModelo implements juegosAleatorios {
    private int random;
    
    @Override
    public int getRandom(){
        return random;
    }
    @Override
    public void generarAleatorio(){
        random = (int) ((Math.random()*5)+1);
    }
    public boolean comparar(int numero){
        if(numero == random){return true;}
        else{return false;}
    }
}
