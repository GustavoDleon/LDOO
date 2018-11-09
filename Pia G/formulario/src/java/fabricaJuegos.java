/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class fabricaJuegos {
    
    public juegosAleatorios getJuego(String juego){

      if(juego == null){
         return null;
      }		
      if(juego.equalsIgnoreCase("juegos")){
         return new juegoModelo();
         
      }
      return null;
   }
}
