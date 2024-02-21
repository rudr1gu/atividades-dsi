/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1;

/**
 *
 * @author User
 */
public class Aplicacao {
    public static void main(String[] args) {
        
        
        System.out.println("Modelos de Carros:");
        
        Carro C1 = new Carro(1010);
        //Criei uma instancia para a classe carro com atributo construtor codRenavam
        Carro C2 = new Carro(1020);
        Carro C3 = new Carro(1030);
        Carro C4 = new Carro(1040);
        
        
        C1.modelo = "Sedan";
        //atribui um modelo de carro para a instancia
        C2.modelo = "SUV";
        C3.modelo = "Picape";
        C4.modelo = "Hatch";
        
        System.out.println("Carro modelo:" + C1.modelo +" " + "Código do Renavam:" + C1.codRenavam);
        //verificando se o modelo foi atribuido a instancia
        System.out.println("Carro modelo:" + C2.modelo +" "+ "Código do Renavam:" + C2.codRenavam);
        System.out.println("Carro modelo:" + C3.modelo +" "+ "Código do Renavam:" + C3.codRenavam);
        System.out.println("Carro modelo:" + C4.modelo +" "+ "Código do Renavam:" + C4.codRenavam);
        
        System.out.println("Ano de Modelo Carros"); 
        //Criei um novo atributo para o ano de modelo do carro com valor estatico
        
        System.out.println("Ano de modelo do carro:"+ C1.modelo +" "+ Carro.anoModelo);
        System.out.println("Ano de modelo do carro:"+ C2.modelo +" "+ Carro.anoModelo);
        System.out.println("Ano de modelo do carro:"+ C3.modelo +" "+ Carro.anoModelo);
        System.out.println("Ano de modelo do carro:"+ C4.modelo +" "+ Carro.anoModelo);
     
        
        System.out.println("Mundando o Atributo Estático");
        
        Carro.anoModelo = 2025;
        //Adicionei um novo valor para o ano de modelo do carro
        
        System.out.println("Novo ano de modelo do Carro:" + Carro.anoModelo);
        }

    }
    

