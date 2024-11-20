/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade370;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade370 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        aux.nv = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero de voos: "));
        for(aux.i=0;aux.i < aux.nv; aux.i++){
            aux.nome[aux.i] = JOptionPane.showInputDialog("Entre com a identificacao do vo "+(aux.i+1)+": ");
            aux.voos[aux.i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidades de lugares disponiveis no voo"+aux.nome[aux.i]+": "));
        }
        
        aux.nvd = JOptionPane.showInputDialog(null,"Entre com o numero do voo desejado ou @ pra terminar: ");
        
        while(aux.nvd != "@"){
            aux.i = 0;
            
            while(aux.nvd != aux.nome[aux.i] && aux.i < aux.nv-1){
                aux.i++;
            }
            
            if(aux.nome[aux.i] == aux.nvd){
                if(aux.voos[aux.i] > 0){
                    aux.voos[aux.i]--;
                    aux.id = JOptionPane.showInputDialog("Qual o numero da identidade do cliente: ");
                    JOptionPane.showMessageDialog(null, "Identidade: "+aux.id+" Voo: "+aux.nvd);
                }else{
                    JOptionPane.showMessageDialog(null,"Nao existem mais lugares nesse voo");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Nao existe esse voo");
                 aux.nvd = JOptionPane.showInputDialog(null,"Entre com o numero do voo desejado ou @ pra terminar: ");
            }
        }
    }
}
