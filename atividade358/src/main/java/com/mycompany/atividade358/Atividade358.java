/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade358;

import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class Atividade358 {

    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        
        for(aux.A=0;aux.A<100;aux.A++){
            aux.precocompra[aux.A] = Float.parseFloat(JOptionPane.showInputDialog("Preco de compra:"));
            aux.precovenda[aux.A] = Float.parseFloat(JOptionPane.showInputDialog("Preco de venda:"));
        }
        for(aux.A=0;aux.A<100;aux.A++){
            aux.lucro = aux.precovenda[aux.A] - aux.precocompra[aux.A];
            if(aux.lucro<10.0){
                aux.totlucromenor10++;
            }else {
                if(aux.lucro <= 20.0){
                    aux.totlucromenor20++;
                }else {
                    aux.totlucromaior20++;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Total de mercadorias com lucro < 10%:"+aux.totlucromenor10+"\n"+"Total de mercadorias com 10% <= lucro <= 20%: "+aux.totlucromenor20+"\n"+"Total de mercadorias com lucro > 20%: "+aux.totlucromaior20);
    }
}
