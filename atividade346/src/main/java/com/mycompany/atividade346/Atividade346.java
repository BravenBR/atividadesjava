/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade346;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade346 {
    public static void main(String[] args) {
        
        Auxiliar aux = new Auxiliar();
        
        do {
            aux.op = Integer.parseInt(JOptionPane.showInputDialog("MENU \n1 - Imprime o comprimento da frase\n2 - Imprime os dois primeiros e os dois ultimos caracteres da frase\n3 - Imprime a frase espelhada\n4 - Termina o algoritmo\nOPCAO: "));
            
            switch (aux.op) {
                case 1:
                    aux.frase = JOptionPane.showInputDialog("Digite uma frase: ");
                    JOptionPane.showMessageDialog(null, "Numero de caracteres da frase: "+aux.frase.length());
                    break;
                case 2:
                    aux.frase = JOptionPane.showInputDialog("Digite uma frase: ");
                    if(aux.frase.length() >= 2) {
                        JOptionPane.showMessageDialog(null, "Os dois primeiros caracteres: "+aux.frase.substring(0, 2));
                        JOptionPane.showMessageDialog(null, "Os dois ultimos caracteres: "+aux.frase.substring(aux.frase.length() - 2));
                    } else {
                        JOptionPane.showMessageDialog(null, "A frase é muito curta para mostrar dois primeiros e últimos caracteres.");
                    }
                    break;
                case 3:
                    aux.frase = JOptionPane.showInputDialog("Digite uma frase: ");
                    String espelhada = new StringBuilder(aux.frase).reverse().toString();
                    JOptionPane.showMessageDialog(null, "Frase espelhada: "+ espelhada);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Fim do algoritmo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao nao disponivel");
            }
        }while (aux.op != 4);
    }
}

