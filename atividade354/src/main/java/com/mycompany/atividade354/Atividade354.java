/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade354;

import javax.swing.JOptionPane;

/**
 *
 * @author Administra
 */
public class Atividade354 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.l=0;aux.l<=14;aux.l++){
            aux.num[aux.l] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(aux.l+1)+"º"+" numero"));
        }
        for(aux.l=0;aux.l<=14;aux.l++){
            JOptionPane.showMessageDialog(null,aux.l+1+"º"+" - "+aux.num[aux.l]+"\n");
            if(aux.num[aux.l]%2==0){
                JOptionPane.showMessageDialog(null,"E par");
            }else {
                JOptionPane.showMessageDialog(null,"E impar");
            }
        }
    }
}
