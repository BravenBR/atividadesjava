/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade413;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade413 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.L=0;aux.L<5;aux.L++){
            for(aux.c=0;aux.c<5;aux.c++){
                aux.n[aux.L][aux.c] = Integer.parseInt(JOptionPane.showInputDialog("Digite um elemento: "));
            }
        }
        for(aux.L=0;aux.L<5;aux.L++){
            for(aux.c=0;aux.c<5;aux.c++){
                JOptionPane.showMessageDialog(null,aux.n[aux.L][aux.c]);
            }
        }
        aux.soma=0;
        for(aux.L=1;aux.L<5;aux.L++){
            for(aux.c=5-aux.L;aux.c<5;aux.c++){
                if(aux.n[aux.L][aux.c]%2 == 1){
                    aux.soma = aux.soma + aux.n[aux.L][aux.c]*aux.n[aux.L][aux.c];
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Raiz quadrada dos numeros impares: "+Math.sqrt(aux.soma));
    }
}
