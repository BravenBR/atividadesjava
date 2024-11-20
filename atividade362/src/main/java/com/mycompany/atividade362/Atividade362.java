/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade362;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade362 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        JOptionPane.showMessageDialog(null, "Entrada de dados do vetor 1 (10 elementos)");
        
        for(aux.i=0;aux.i<=9;aux.i++){
            aux.vet1[aux.i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o "+(aux.i+1)+" elemento: "));
        }
        
        JOptionPane.showMessageDialog(null, "Entrada de dados do vetor 2 (20 elementos)");
        
        for(aux.i=0;aux.i<=19;aux.i++){
            aux.vet2[aux.i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o "+(aux.i+1)+" elemento: "));
        }
        
        for(aux.i=0;aux.i<=9;aux.i++){
            aux.vetc[aux.i] = -999999999;
        }
        
        for(aux.i=0;aux.i<=9;aux.i++){
            aux.c = 0;
            while(aux.vet1[aux.i] != aux.vet2[aux.c] && aux.c < 19){
                aux.c++;
            }
            if(aux.vet1[aux.i] == aux.vetc[aux.c]){
                aux.d = 0;
                while(aux.vet1[aux.i] != aux.vetc[aux.d] && aux.d < aux.L){
                    aux.d++;
                }
                if(aux.d == aux.L){
                    aux.vetc[aux.d] = aux.vet1[aux.i]; aux.L++;
                }
            }
        }
        if(aux.L != 0){
            JOptionPane.showMessageDialog(null,"Elementos comuns\n");
            for(aux.i=0;aux.i <= aux.L-1;aux.i++){
                JOptionPane.showMessageDialog(null,"\n"+aux.vetc[aux.i]);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Nao existem elementos comuns");
        }
    }
}
