/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplcation.taple;

/**
 *
 * @author DELL
 */
public class MultiplcationTaple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("    ");
       for(int x=1 ; x<=12 ; x++){
           System.out.print(x);
          if(x<10){
                 System.out.print("   ");   
             }
          else{
              System.out.print("  ");
          }
       }
       System.out.println("");
    for(int i=1 ; i<=12 ; i++){
        System.out.print(i);
        if(i<10){
            System.out.print("   ");
        }
        else{
            System.out.print("  ");
        } 
        for(int y=1 ; y<=12 ; y++){
            
            int mult = i*y;
            System.out.print(mult);
             if(mult<10){
                 System.out.print("   ");   
             }
               else if(mult<100) {
                 System.out.print("  ");}
          else{
              System.out.print(" ");}
            
        }
        System.out.println("");
    }    






// TODO code application logic here
    }
    
}
