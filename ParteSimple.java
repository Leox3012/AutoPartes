// Clase ParteSimple que hereda de Parte y representa una parte simple

import javax.swing.JOptionPane;

public class ParteSimple extends Parte {

    // Constructor que inicializa una ParteSimple con los atributos de Parte
    public ParteSimple(String numero, String nombre, double precioBase) {
        super(numero, nombre, precioBase); // Llama al constructor de la clase padre
    }

    // Sobrescritura del método obtenerPrecio para calcular el precio final de la parte simple
    @Override
    public double obtenerPrecio() {
        return getPrecioBase() * 1.08; // Precio base más un 8%
    }

    // Sobrescritura del método mostrarInformacion para incluir el precio final
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Precio Final (Parte Simple): " + obtenerPrecio());
    }
}