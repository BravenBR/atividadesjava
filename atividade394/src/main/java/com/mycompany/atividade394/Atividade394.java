/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade394;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade394 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        do{
            aux.op = JOptionPane.showInputDialog(null,"MENU\n"+"1- ENTRAR NOMES\n"+"2- ENTRAR 1 NOTA\n"+"3- ENTRAR 2 NOTA\n"+"4- CALCULAR MEDIA\n"+"5- LISTAR NO DISPLAY\n"+"6- SAIR\n"+"OPCAO: ");
            
            if(aux.op.equals("1")){
                aux.flag = 1;
                for(aux.L = 0; aux.L <= 49; aux.L++){
                    aux.nomes[aux.L] = JOptionPane.showInputDialog("Digite o "+(aux.L+1)+"ª nome(com ate 30 caracteres e todas as letras maiusculas): ");
                    while(aux.nomes[aux.L].length() > 30){
                        aux.nomes[aux.L] = JOptionPane.showInputDialog("Nome com ate 30 caracteres. Digite o "+(aux.L+1)+"ª nome(todas as letras maiusculas): ");
                    }
                    aux.tam = aux.nomes[aux.L].length();
                    if(aux.tam < 30){
                        for(aux.c=0; aux.c <= 30; aux.c++){
                            aux.nomes[aux.L] = aux.nomes[aux.L].concat(" ");
                        }
                    }
                }
            }else{
                if(aux.op.equals("2")){
                    if(aux.flag == 0){
                        JOptionPane.showMessageDialog(null,"Nao tem nome cadastrado");
                    }else{
                        for(aux.L=0; aux.L <=49; aux.L++){
                            aux.nota1[aux.L] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª nota: "));
                        }
                        aux.flag1 = 1;
                    }
                }else{
                    if(aux.op.equals("3")){
                        if(aux.flag == 0){
                            JOptionPane.showMessageDialog(null,"Nao tem nome cadastrado");
                        }else{
                            for(aux.L=0; aux.L <=49; aux.L++){
                                aux.nota2[aux.L] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª nota: "));
                            }
                            aux.flag2 = 1;
                        }
                    }else{
                        if(aux.op.equals("4")){
                            if(aux.flag == 0 || aux.flag1 == 0 || aux.flag2 == 0){
                                JOptionPane.showMessageDialog(null,"Nem todos os dados estao cadastrados");
                            }else{
                                for(aux.L = 0; aux.L <= 49 ; aux.L++){
                                    aux.media[aux.L] = (3*aux.nota1[aux.L] + 7*aux.nota2[aux.L])/10;
                                }
                            }
                        }else{
                            if(aux.op.equals("5")){
                                if(aux.flag == 0 || aux.flag1 == 0 || aux.flag2 == 0){
                                    JOptionPane.showMessageDialog(null,"Nem todos os dados estao cadastrados");
                                }else{
                                    for(aux.L = 0; aux.L <= 49; aux.L++){
                                        JOptionPane.showMessageDialog(null,"Nome: "+aux.nomes[aux.L]+" Nota 1: "+aux.nota1[aux.L]+" Nota 2: "+aux.nota2[aux.L]+" Media: "+aux.media[aux.L]);
                                    }
                                }
                            }else{
                                if(aux.op.equals("6")){
                                    System.exit(0);
                                }else{
                                    JOptionPane.showMessageDialog(null, "Opcao nao disponivel");
                                }
                            }
                        }
                    }
                }
                
            }
        }while(aux.op != "6");
    }
}
