import javax.swing.*;
public class Ejercicio {
    public static void main(String[] args) {
        // CREO VARIABLES
        String nombre ="";
        Double trabajo, parcial, certificacion,autoCoe, notaFinal;
        // pedir info
        String msj = "DATO NO VALIDO, LA NOTA ESTA EN UN RANGO DE 0,0 A 5.0";
        // pido nombre
        nombre = JOptionPane.showInputDialog(null,"escriba su nombre");

        // pido la nota del trabajo
        trabajo = Double.parseDouble(JOptionPane.showInputDialog(null,"digite su nota del trabajo"));

        if (trabajo>=0 && trabajo<=5){
            // pido nota parcial
            parcial=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la nota del parcial"));

            if (parcial>=0 && parcial<=5){
                // pido nota certificacion
                certificacion=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la nota de la certificacion"));

                if (certificacion>=0 && certificacion<=5){
                    // pido nota autoCoe
                    autoCoe =Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la nota de coevalucion y autoevaluacion"));

                    if (autoCoe>=0 && autoCoe<=5){
                        // si todo se cumple pedimos la nota final cada una con su respectivo porcentaje

                        notaFinal = (trabajo*0.7)+(parcial*0.15)+(certificacion*0.1)+(autoCoe*0.05);
                        JOptionPane.showMessageDialog(null,"la nota final de " + nombre + " es: " + notaFinal);
                    }

                }else {
                    JOptionPane.showMessageDialog(null, msj);
                }

            }else {
                JOptionPane.showMessageDialog(null, msj);
            }
        }else {
            JOptionPane.showMessageDialog(null, msj);
        }
    }

}
