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
   
    //funcion para mover las fichas
    public static void moverFichas() {
        //Si la ficha roja1 está en la cárcel la mueve hacía el primer seguro
        int num1 = Parques.num1;  
        int num2 = Parques.num2;
        int suma=0;
        suma=num1+num2;
        if(Parques.roja1.isVisible() && Parques.roja2.isVisible()){
            if(num1==num2){
                Parques.roja1.setVisible(false);
                Parques.roja2.setVisible(false);
                Parques.r1sal1.setVisible(true);
                Parques.r2sal1.setVisible(true);
            }  
        }
        if(suma==7){
            if(Parques.moverd1==1 && Parques.moverd2==1){
                if(!Parques.r1sal1.isVisible()){
                    
                    Parques.r1sal1.setVisible(false);
                    Parques.r1seg1.setVisible(true);
                }
                /*if(!Parques.r1sal2.isVisible()){
                    Parques.r1seg3.setVisible(true);
                    Parques.r1sal2.setVisible(false);
                }*/
            }
            
            if(Parques.moverd1==2 && Parques.moverd2==2){
                if(!Parques.r2sal1.isVisible()){
                    Parques.r2sal1.setVisible(false);
                    Parques.r2seg1.setVisible(true);
                }
            }
            
        }
        
        if(suma==5){
            if(Parques.moverd1==1 && Parques.moverd2==1){
                Parques.r1seg1.setVisible(false);
                Parques.r1seg2.setVisible(true);
            }
            if(Parques.moverd1==2 && Parques.moverd2==2){
                Parques.r2seg1.setVisible(false);
                Parques.r2seg2.setVisible(true);
            }
        }
                
        
    }
}
