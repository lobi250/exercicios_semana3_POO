import javax.swing.JOptionPane;

public class Solucao4{
   public static void main(String[] args)
   {
      String primeira_string, segunda_string, terceira_string;
      int soma_strings;
      
      primeira_string = JOptionPane.showInputDialog("Informe a primeria String: ");
      segunda_string = JOptionPane.showInputDialog("Informe a segunda String: ");
      terceira_string = JOptionPane.showInputDialog("Informe a terceira String: ");
      
      soma_strings = primeira_string.length() + segunda_string.length() + terceira_string.length();
      
      System.out.println("A soma do tamanho das strings eh: " + soma_strings);
      
   }
}
