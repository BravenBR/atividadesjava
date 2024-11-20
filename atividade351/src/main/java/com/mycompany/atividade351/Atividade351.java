/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade351;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Atividade351 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.l=0;aux.l<=4;aux.l++){
            aux.nomes[aux.l] = JOptionPane.showInputDialog("Nome "+(aux.l+1));
        }
        
        aux.num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da pessoa: "));
        
        while(aux.num < 1 || aux.num > 5){
            JOptionPane.showMessageDialog(null,"Numero fora do intervalo");
            aux.num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da pessoa: "));
        }
        JOptionPane.showMessageDialog(null,aux.nomes[aux.num-1]);
    }
}
