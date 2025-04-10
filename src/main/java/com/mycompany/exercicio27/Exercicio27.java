package com.mycompany.exercicio27;

import javax.swing.JOptionPane;

public class Exercicio27 {

    public static void main(String[] args) {

        int i, flag;
        int numElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas a ser cadastrado "));
        String vetorPesquisado[] = new String[numElementos];
        for (i = 0; i < numElementos; i++) {
            vetorPesquisado[i] = JOptionPane.showInputDialog("Digite o nome para cadastro");
        }
        String elementoProcurado = JOptionPane.showInputDialog("Digite o nome a ser procurado");
        flag = 0;
        for (i = 0; i < numElementos; i++) {
            if (vetorPesquisado[i].equalsIgnoreCase(elementoProcurado)) {
                JOptionPane.showMessageDialog(null, "o valor procurado foi encontrado na posição " + i);
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "o nome não foi encontrado.");
        }
    }
}
