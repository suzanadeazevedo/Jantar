/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jantar;

/**
 *
 * @author suzanadeazevedo
 */
public class Jantar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa Maria = new Pessoa();
        Maria.nome = "Helena";
        Maria.peso = 60;
        
        Comida lasanha = new Comida();
        lasanha.peso = 5;
        
        System.out.println(Maria.nome);
        System.out.println(Maria.peso);
        System.out.println(lasanha.peso);
        
        
        Maria.comer(lasanha);
        System.out.println(Maria.peso);
      
        
    }
    
}
