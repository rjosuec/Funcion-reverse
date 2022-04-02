/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion.reverse;

/**
 *
 * @author User
 */
public class FuncionReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena= "abuelita, abuelita";
        StringBuilder builder=new StringBuilder(cadena);
        String sCadenaInvertida=builder.reverse().toString();
        System.out.println(sCadenaInvertida);
    }
    
}
