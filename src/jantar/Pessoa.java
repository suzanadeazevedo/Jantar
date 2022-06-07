/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jantar;

/**
 *
 * @author suzan
 */
public class Pessoa {
    String nome;
    int peso;
    
    void comer(Comida lasanha){
        this.peso += lasanha.peso;
    }
}
