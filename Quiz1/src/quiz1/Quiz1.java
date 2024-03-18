/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int courses = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de cursos que desea matricular: "));
        double totalTax = 0.0;
        
        for (int i = 0; i < courses; i++) {
            String nameOfCourse = JOptionPane.showInputDialog("Ingrese el nombre de curso a matricular: ");
            double amountPerCourse = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar por el curso: "));
            
            double taxPerCourse = amountPerCourse * 0.02;
            totalTax += taxPerCourse;
            
            JOptionPane.showMessageDialog(null, "El monto del impuesto a pagar por el curso " + nameOfCourse + " es del 2%: " + taxPerCourse);
        }
        
        JOptionPane.showMessageDialog(null, "El total de impuestos a pagar por el total de cursos es de: " + totalTax);
        
    }
    
}
