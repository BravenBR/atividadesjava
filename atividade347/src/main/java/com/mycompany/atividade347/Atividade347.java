/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade347;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade347 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.l=0;aux.l<=4;aux.l++){
            aux.nomes[aux.l] = (JOptionPane.showInputDialog("Digite "+ (aux.l+1) + " nome: "));
            aux.pr1[aux.l] = Float.parseFloat(JOptionPane.showInputDialog("digite 1ª  nota: "));
            aux.pr2[aux.l] = Float.parseFloat(JOptionPane.showInputDialog("digite 2ª  nota: "));
            aux.media[aux.l] = (aux.pr1[aux.l]+aux.pr2[aux.l])/2;
        }
        for (aux.l=0;aux.l<=4;aux.l++){
            JOptionPane.showMessageDialog(null,"\n"+(aux.l+1) +"- "+aux.nomes[aux.l]);
            JOptionPane.showMessageDialog(null,"\n"+aux.pr1[aux.l] +"\t "+aux.pr2[aux.l]+"\t"+aux.media[aux.l]);
        }
    }
}
