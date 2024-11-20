/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade360;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade360 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.i=0;aux.i<12;aux.i++){
            aux.signo[aux.i] = JOptionPane.showInputDialog("Digite o signo: ");
            aux.ultdia[aux.i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o ultimo dia: "));
        }
        aux.data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar: "));
        while(aux.data != 9999){
            aux.dia = aux.data/100;
            aux.mes = aux.data%100;
            aux.mes--;
            if(aux.dia>aux.ultdia[aux.mes]){
                aux.mes = (aux.mes+1)%12;
            }
            JOptionPane.showMessageDialog(null,"Signo: "+aux.signo[aux.mes]);
            aux.data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar: "));
        }
    }
}
