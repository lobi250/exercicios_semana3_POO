import javax.swing.JOptionPane;

public class Solucao2{
   public static void main(String [] args)
   {
      double base, altura, area;
   
      base = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da base do triangulo: "));
      altura = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor altura do triangulo: "));
      area = (base * altura)/2;
      
      System.out.println("A area do triangulo eh: " + area);
   }

}