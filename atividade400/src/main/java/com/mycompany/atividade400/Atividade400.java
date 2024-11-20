/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade400;

/**
 *
 * @author T-GAMER
 */
import javax.swing.JOptionPane;

public class Atividade400 {
    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        int op;

        do {
            String menu = """
                Hotel Fazenda Sucesso
                1. Cadastrar quartos
                2. Listar todos os quartos
                3. Listar quartos desocupados
                4. Alugar/reservar quarto
                5. Entrar despesas extras
                6. Calcular despesa do quarto
                7. Sair
                Escolha uma opção:
            """;

            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1 -> cadastrarQuartos(aux);
                case 2 -> listarTodosQuartos(aux);
                case 3 -> listarQuartosDesocupados(aux);
                case 4 -> alugarReservarQuarto(aux);
                case 5 -> entrarDespesasExtras(aux);
                case 6 -> calcularDespesaQuarto(aux);
                case 7 -> JOptionPane.showMessageDialog(null, "Saindo...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (op != 7);
    }

    public static void cadastrarQuartos(Auxiliar aux) {
        if (aux.chave == 1) {
            JOptionPane.showMessageDialog(null, "Atenção: Dados já cadastrados!");
        } else {
            for (int i = 0; i < 50; i++) {
                aux.leitos[i] = 5;
                aux.precos[i] = 30.0;
                aux.sit[i] = "L";
                aux.nd[i] = 0;
                aux.despesas[i] = 0.0;
                aux.din[i] = "XXXX";
                aux.dout[i] = "XXXX";
                aux.nome[i] = "";
                aux.tel[i] = "";
            }
            aux.chave = 1;
            JOptionPane.showMessageDialog(null, "Quartos cadastrados com sucesso!");
        }
    }

    public static void listarTodosQuartos(Auxiliar aux) {
        if (aux.chave == 0) {
            JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 50; i++) {
                sb.append("Número do quarto: ").append(i + 1).append("\n");
                sb.append("Situação: ").append(aux.sit[i]).append("\n");
                if (aux.sit[i].equals("A") || aux.sit[i].equals("R")) {
                    sb.append("Nome: ").append(aux.nome[i]).append("\n");
                    sb.append("Telefone: ").append(aux.tel[i]).append("\n");
                }
                sb.append("Leitos: ").append(aux.leitos[i]).append("\n");
                sb.append("Preço: ").append(aux.precos[i]).append("\n");
                sb.append("Despesas: ").append(aux.despesas[i]).append("\n");
                sb.append("Data de entrada: ").append(aux.din[i]).append("\n");
                sb.append("Data de saída: ").append(aux.dout[i]).append("\n");
                sb.append("Dias reservados: ").append(aux.nd[i]).append("\n\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    public static void listarQuartosDesocupados(Auxiliar aux) {
        if (aux.chave == 0) {
            JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 50; i++) {
                if (aux.sit[i].equals("L")) {
                    sb.append("Número do quarto: ").append(i + 1).append("\n");
                    sb.append("Leitos: ").append(aux.leitos[i]).append("\n");
                    sb.append("Preço: ").append(aux.precos[i]).append("\n");
                    sb.append("\n");
                }
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    public static void alugarReservarQuarto(Auxiliar aux) {
        if (aux.chave == 0) {
            JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos.");
        } else {
            String tipo = JOptionPane.showInputDialog("Digite 'A' para aluguel ou 'R' para reserva:").toUpperCase();
            if (!tipo.equals("A") && !tipo.equals("R")) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                return;
            }

            String nome = JOptionPane.showInputDialog("Digite o nome:");
            String telefone = JOptionPane.showInputDialog("Digite o telefone:");
            int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto (1-50):"));

            if (quarto < 1 || quarto > 50 || !aux.sit[quarto - 1].equals("L")) {
                JOptionPane.showMessageDialog(null, "Quarto inválido ou ocupado!");
            } else {
                aux.sit[quarto - 1] = tipo.equals("A") ? "A" : "R";
                aux.nome[quarto - 1] = nome;
                aux.tel[quarto - 1] = telefone;
                JOptionPane.showMessageDialog(null, "Quarto reservado/alugado com sucesso!");
            }
        }
    }

    public static void entrarDespesasExtras(Auxiliar aux) {
        if (aux.chave == 0) {
            JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos.");
        } else {
            int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto (1-50):"));
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das despesas extras:"));

            aux.despesas[quarto - 1] += valor;
            JOptionPane.showMessageDialog(null, "Despesas adicionadas com sucesso!");
        }
    }

    public static void calcularDespesaQuarto(Auxiliar aux) {
        if (aux.chave == 0) {
            JOptionPane.showMessageDialog(null, "Escolha a opção 1 para cadastrar os quartos.");
        } else {
            int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto (1-50):"));
            double total = aux.despesas[quarto - 1] + aux.precos[quarto - 1];
            JOptionPane.showMessageDialog(null, "Despesa total do quarto: R$ " + total);
            aux.sit[quarto - 1] = "L";
            aux.despesas[quarto - 1] = 0.0;
        }
    }
}

