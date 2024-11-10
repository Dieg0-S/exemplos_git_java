package dialogoexercicio;

import javax.swing.JOptionPane;

public class DialogoExercicio {
    public static void main(String[] args) {
        /*nome do usuário*/
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");

        /*nome digitado*/
        JOptionPane.showMessageDialog(null, "Olá " + nome + ", seja bem vindo ao módulo de interfaces gráficas no Java!");

        /*Pergunta se o usuário gosta de programar*/
        int respostaProgramar = JOptionPane.showConfirmDialog(null, nome + ", você gosta de programar?", "Pergunta", JOptionPane.YES_NO_OPTION);
        if (respostaProgramar == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Então estude bem o Java Swing. Ele pode abrir várias portas para você, ");
        } else {
            JOptionPane.showMessageDialog(null, "Que pena. Mas com as janleas você vai gostar");
        }

        /*gosta do conceito de objetos no Java*/
        Object[] opcoes = {"Sim - Objeto é legal", "Não - Objeto é sofrimento", "Talvez - Quero aprender"};
        int respostaObjeto = JOptionPane.showOptionDialog(null, "Aqui no Java Swing tudo é objeto. Você gosta disso?", "Pergunta",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (respostaObjeto) {
            case 0:
                JOptionPane.showMessageDialog(null, "Ótimo, todos os componentes são objetos");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Não se preocupe. Agora você irá aprender a importância dos objetos.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Sim você aprendera.");
                break;
        }
    }
}