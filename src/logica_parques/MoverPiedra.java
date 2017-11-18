/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica_parques;

import parques_juego.Parques;

/**
 *
 * @author Angie
 */
public class MoverPiedra {
   int [][] posicion; 
  //Coordenadas en x car1 car2 car3 car4 sal  seg  seg sal  seg  seg  sal  seg  seg  sal  seg  seg  cen1 cen2 cen3 cen4
    int [] ficha1x = {40,  40, 470, 460, 195, 110, 10, 110, 195, 275, 355, 465, 560, 465, 380, 540, 270, 220, 270, 350};
    int [] ficha2x = {120, 120, 540, 540, 220, 110, 10, 110, 220, 300, 380, 465, 560, 465, 355, 460, 300, 220, 300, 350};
  //Coordenadas en y car1 car2 car3 car4 sal  seg  seg  sal  seg  seg  sal  seg  seg  sal  seg  seg cen1 cen2 cen3 cen4
    int [] ficha1y = {90, 580, 590, 160, 155, 240, 320, 400, 510, 605, 510, 400, 320, 240, 155, 60, 270, 310, 400, 310};
    int [] ficha2y = {170, 500, 510,  90, 155, 265, 345, 425, 510, 605, 510, 425, 345, 265, 155, 60, 270, 340, 400, 340};
    
    //funcion para mover las fichas
    public static void moverFichas() {
        //Si la ficha roja1 está en la cárcel la mueve hacía el primer seguro
        if(Parques.roja1.isVisible()){
            Parques.roja1.setVisible(false);
            Parques.r1sal1.setVisible(true);
        }    
        
    }
}
