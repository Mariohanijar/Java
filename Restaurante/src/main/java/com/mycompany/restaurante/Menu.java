package com.mycompany.restaurante;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 23300034
 */
public class Menu {
    Scanner scanner = new Scanner(System.in);
    int quantidade;
    int formaDePagamento;
    int escolha; 
    
    public int quantidadePratos(int quantidade){
       return  this.quantidade;
       
    }
    
    public void adicionarPratos(){ 
        System.out.println("quantos pratos deseja adicionar? ");
        
        quantidade += scanner.nextInt();
    }
    public void removerPratos(){ 
        System.out.println("quantos pratos deseja retirar? ");
        quantidade -= scanner.nextInt();
    }
}
