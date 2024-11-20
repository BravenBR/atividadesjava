/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade398;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade398 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        do{
            aux.op = Integer.parseInt(JOptionPane.showInputDialog("FABRICA DE QUEIJO RIO NOVENSE"+
                                               "\n1- Cadastrar produtos"+
                                               "\n2- Vender produtos"+
                                               "\n3- Relatorio de venda"+
                                               "\n4- Sair do programa"+
                                               "\nOpcao: "
            ));
            
            if(aux.op == 1){
                while(aux.opcadastro != 2){
                    aux.codigoproduto[aux.i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto: "));
                    aux.quantidadeproduto[aux.i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos: "));
                    aux.precoproduto[aux.i] = Float.parseFloat(JOptionPane.showInputDialog("Digite o preco do produto: "));
                    aux.i++;
                    if(aux.i == 50){
                        JOptionPane.showMessageDialog(null,"Maximo de produtos cadastrados ");
                        aux.opcadastro = 2;
                    }else{
                        aux.opcadastro = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro produto? 1- Sim, 2- Nao"));
                    }
                }
                aux.opcadastro = 1;
            }   
            if(aux.op == 2){
                while(aux.opvendas != 2){
                    aux.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto que deseja vender: "));
                    for(aux.i=0;aux.i < aux.codigoproduto.length; aux.i++){
                        if(aux.codigoproduto[aux.i] == aux.codigo){
                            aux.encontrado = true;
                            break;
                        }
                    }
                    if(aux.encontrado == false){
                        JOptionPane.showMessageDialog(null,"Produto nao cadastrado");
                    }else{
                        aux.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos que deseja vender: "));
                            if(aux.quantidadeproduto[aux.i] >= aux.quantidade){
                                aux.quantidadeproduto[aux.i] = aux.quantidadeproduto[aux.i]-aux.quantidade;
                                aux.venda = aux.quantidade*aux.precoproduto[aux.i];
                                aux.geral = aux.geral+aux.venda;
                                aux.qntdtotal = aux.qntdtotal+aux.quantidade;
                                JOptionPane.showMessageDialog(null,"RELATORIO DE VENDA"+
                                                                 "\nCodigo Produto: "+aux.codigoproduto[aux.i]+
                                                                 "\nPreco do produto: "+aux.precoproduto[aux.i]+
                                                                 "\nQuantidade vendida: "+aux.quantidade+
                                                                 "\nTotal: "+aux.venda+
                                                                 "\n--------------------------"+
                                                                 "\nSTATUS ATUAL DO PRODUTO"+
                                                                 "\nEstoque restante: "+aux.quantidadeproduto[aux.i]
                                );
                            }else{
                                JOptionPane.showMessageDialog(null,"Estoque insuficiente");
                            }
                    }
                    
                    aux.opvendas = Integer.parseInt(JOptionPane.showInputDialog("Deseja vender outro produto? 1- Sim, 2- Nao"));
                }
                aux.opvendas = 1;
            }
            if(aux.op == 3){
                if(aux.venda > 0){
                    JOptionPane.showMessageDialog(null,"RELATORIO DE VENDA DIARIO"+
                                                     "\nProdutos vendidos: "+aux.qntdtotal+
                                                     "\nTotal arrecadado: "+aux.geral
                    );
                }else{
                    JOptionPane.showMessageDialog(null,"Voce ainda nao vendeu nada!");
                }
            }
            if(aux.op > 4 || aux.op < 1){
                JOptionPane.showMessageDialog(null,"Opcao invalida");
            }
        }while(aux.op != 4);
        
        
    }
}
