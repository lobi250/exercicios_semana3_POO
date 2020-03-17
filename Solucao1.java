import javax.swing.JOptionPane;

public class Solucao1{
   public static void main(String[] args)
   {
      int idade, n_dias;
      
      idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
      
      n_dias = idade * 365;
      
      System.out.println("Voce viveu " + n_dias + " dias");
      
   }
}