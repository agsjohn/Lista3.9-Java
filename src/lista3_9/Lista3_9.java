package lista3_9;

import javax.swing.JOptionPane;

public class Lista3_9 {
    public static void main(String[] args) {
        int bagagem, passageiros =0, pesoTotal = 0;
        int capacidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a capacidade m�xima do voo: "));
        while(pesoTotal < capacidadeMaxima){
            bagagem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o peso da bagagem ou zero caso tenha finalizado: "));
            if(bagagem !=0){
                if((pesoTotal + bagagem + 80) > capacidadeMaxima){
                    JOptionPane.showMessageDialog(null, "O peso excedeu o limite\nCapacidade m�xima: "+capacidadeMaxima
                            +"\nN�mero de passsageiros: " +passageiros+ "\nPeso Total: " +pesoTotal);
                    break;
                } else{
                    pesoTotal += bagagem + 80;
                    passageiros++;
                }
            } else{
                JOptionPane.showMessageDialog(null, "Capacidade m�xima: "+capacidadeMaxima
                            +"\nN�mero de passsageiros: " +passageiros+ "\nPeso Total: " +pesoTotal);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado");
    }    
}
