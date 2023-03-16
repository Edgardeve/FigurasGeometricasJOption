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
public class Figuras 
{
    static int lado,radio,base,altura;
    double area;
    
    public void Cuadrado(int lado)
    {
        area = lado * lado;
        JOptionPane.showMessageDialog(null,
                "El area del cuadrado es: "+'\t'+area);
    }
    
    public void Rectangulo(int base,int altura)
    {
        area = base * altura;
        JOptionPane.showMessageDialog(null,
                "El area del rectangulo es: "+'\t'+area);
    }
    
    public void Triangulo(int base,int altura)
    {
        area = (base*altura)/2;
        JOptionPane.showMessageDialog(null,
                "El area del triangulo es: "+'\t'+area);
    }
    
    public void Circulo(int radio)
    {
        area = Math.PI * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null,
                "El area del circulo es: "+'\t'+area);
    }
    
    public void Cubo(int lado)
    {
        area = 6 * Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null,
                "El area del cubo es: "+'\t'+area);
    }
    public void Esfera(int radio)
    {
        area = 4 * (Math.PI * Math.pow(radio, 2));
        JOptionPane.showMessageDialog(null,
                "El area de la esfera es: "+'\t'+area);
    }
}
