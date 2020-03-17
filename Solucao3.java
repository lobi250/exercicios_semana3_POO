import javax.swing.JOptionPane;

public class Solucao3{
   public static void main(String[] args)
   {
      int numero;
      double elevado;
      
      numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero desejado para elevar: "));
            
      elevado = Math.pow(numero, 2);
      
      System.out.println("O resultado eh: " + elevado);
      
   }

}