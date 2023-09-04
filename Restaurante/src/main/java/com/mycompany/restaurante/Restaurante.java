/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurante;
import java.util.Scanner;
/**
 *
 * @author 23300034
 */
public class Restaurante {

    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ola seja bem vindo ao restaurante");
        
        Prato parmegiana = new Prato();
        parmegiana.nome = "parmegiana";
        parmegiana.detalhes = "parmegiana é um prato com arroz e molho de tomate";
        parmegiana.valor = 40.00;
        
        Prato acebolado = new Prato();
        acebolado.nome = "bife acebolado";
        acebolado.detalhes = "bife com cebolas em cima";
        acebolado.valor = 20.00;
        
        System.out.println("o que deseja pedir? 1. parmegiana 2. bife acebolado");
        Menu menu = new Menu();
        menu.escolha = scanner.nextInt();
        if(menu.escolha == 1){
            System.out.println( parmegiana.nome);
             System.out.println( parmegiana.detalhes);
              System.out.println( parmegiana.valor);
              menu.adicionarPratos();
              System.out.println(menu.quantidade);
              menu.removerPratos();
              System.out.println(menu.quantidade);
              double valorParmegiana = parmegiana.valor * menu.quantidade;
              System.out.println(valorParmegiana);
              
        
        }
        if(menu.escolha == 2){
            System.out.println( acebolado.nome);
            System.out.println( acebolado.detalhes);
            System.out.println( acebolado.valor);
            menu.adicionarPratos();
              System.out.println(menu.quantidade);
              menu.removerPratos();
              System.out.println(menu.quantidade);
                double valorAcebolado = acebolado.valor * menu.quantidade;
              System.out.println(valorAcebolado);
        
        }
       
    
    }
 
        
    
}

