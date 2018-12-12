/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author ifernandezblanco
 */
public class ConversorTemperatura {
   
  private static float temperaturaCte=80f;
   private float centigrados;
   private float Fharenheit;
   private float Reamur;
   
   public float centigradosAFharenheit(float centigrados, float Fharenheit)throws TemperaturaErradaExcepcion{
       if(centigrados>temperaturaCte){
           throw new TemperaturaErradaExcepcion("La temperatura es superior a 80ºCentigrados");
       }
       else
           Fharenheit= (float) (9.0f/5.0f*centigrados+32.4);
        return Fharenheit;
    }
   public void centigradosAReamur(float centigrados, float Reamur) throws TemperaturaErradaExcepcion{
       if (centigrados>temperaturaCte){
           throw new TemperaturaErradaExcepcion("la temperatura es superior a 80º Centigrados");
           
       }else{
                   Reamur=(4.0f/5.0f)*centigrados;
                   System.out.println("Reamur="+Reamur);
                   }
       }
}
