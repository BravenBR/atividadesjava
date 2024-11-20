/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade356;

import javax.swing.JOptionPane;

/**
 *
 * @author Administra
 */
public class Atividade356 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.l=0;aux.l<=14;aux.l++){
            aux.nomes[aux.l] = JOptionPane.showInputDialog("Digite o "+(aux.l+1)+"º "+"Nome");
            
            while(aux.nomes[aux.l].length()>30){
                JOptionPane.showMessageDialog(null,"O nome nao pode contar mais do que 30 caracteres");
                aux.nomes[aux.l] = JOptionPane.showInputDialog("Digite o "+(aux.l+1)+"º "+"Nome");
            }
            
            aux.t = 30 - aux.nomes[aux.l].length();
            
            for(aux.c=1;aux.c<=aux.t;aux.c++){
                aux.nomes[aux.l] = aux.nomes[aux.l].concat(" ");
            }
            
            aux.pr1[aux.l] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª Nota"));
            aux.pr2[aux.l] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª Nota"));
            aux.media[aux.l] = (int) ((aux.pr1[aux.l]+aux.pr2[aux.l])/2+0.0001);
            if(aux.media[aux.l]>=5){
                aux.sit[aux.l]="APROVADO";
            }else{
                aux.sit[aux.l]="REPROVADO";
            }
        }
        for(aux.l=0;aux.l<=14;aux.l++){
            JOptionPane.showMessageDialog(null,"RELACAO FINAL\n"+(aux.l+1)+"- "+aux.nomes[aux.l]+" 1ª Nota: "+aux.pr1[aux.l]+" 2ª Nota: "+aux.pr2[aux.l]+" Media: "+aux.media[aux.l]+" Situacao: "+aux.sit[aux.l]);
        }
        
        
    }
}
