/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricasjoption;
import javax.swing.JOptionPane;
/**
 *
 * @author edgar
 */
public class Datos 
{
    static int lado,radio,base,altura;
    
    public void intro()
    {
        System.out.println("AREA DE FIGURAS GEOMETRICAS-----");
        Figuras Fig = new Figuras();
        
        lado = Integer.parseInt(JOptionPane.showInputDialog("AREA DE FIGURAS GEOMETRICAS-----"+'\n'+
                "Dame el lado del cuadrado: "));
        Fig.Cuadrado(lado);
        
        base = Integer.parseInt(JOptionPane.showInputDialog(
                "Dame la base del rectangulo: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog(
                "Dame la altura del rectangulo: "));
        Fig.Rectangulo(base,altura);
        
        base = Integer.parseInt(JOptionPane.showInputDialog(
                "Dame la base del triangulo: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog(
                "Dame la altura del triangulo: "));
        Fig.Triangulo(base,altura);
        
        radio = Integer.parseInt(JOptionPane.showInputDialog(
                "Dame el radio del circulo: "));
        Fig.Circulo(radio);
        
        lado = Integer.parseInt(JOptionPane.showInputDialog(
                "Dame el lado del cubo: "));
        Fig.Cubo(lado);
        
        radio = Integer.parseInt(JOptionPane.showInputDialog(
                "Dame el radio del esfera: "));
        Fig.Esfera(radio);
    }
}
