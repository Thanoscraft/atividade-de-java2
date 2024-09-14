/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        
       
        System.out.println("----Programa de comparação maior------");
        System.out.println("Digite a idade");
        idade=scanner.nextInt();
        if(idade >= 18){
            System.out.println("Aluno maior de idade");
        }else{
            System.out.println("Aluno menor de idade");
            
        }
        
    }
}

