/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade419;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade419 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.L=0;aux.L<5;aux.L++){
            for(aux.c=0;aux.c<5;aux.c++){
                aux.A[aux.L][aux.c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de A["+(aux.L+1)+"]["+(aux.c+1)+"]"));
            }
        }
        for(aux.L=0;aux.L<5;aux.L++){
            for(aux.c=0;aux.c<5;aux.c++){
                aux.B[aux.L][aux.c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de B["+(aux.L+1)+"]["+(aux.c+1)+"]"));
                aux.DIF[aux.L][aux.c] = aux.A[aux.L][aux.c] - aux.B[aux.L][aux.c];
            }
        }
        for(aux.L=0;aux.L<5;aux.L++){
            for(aux.c=0;aux.c<5;aux.c++){
                JOptionPane.showMessageDialog(null,aux.DIF[aux.L][aux.c]);
            }
        }
    }
}
