    // Clase ParteCompuesta que hereda de Parte y representa una parte compuesta

import javax.swing.JOptionPane;

public class ParteCompuesta extends Parte {
    private double precioEnsamble;  // Costo adicional por ensamblaje de la parte
    private String descripcionProceso;  // Descripción del proceso de fabricación

    // Constructor que inicializa una ParteCompuesta con sus atributos específicos
    public ParteCompuesta(String numero, String nombre, double precioBase, double precioEnsamble, String descripcionProceso) {
        super(numero, nombre, precioBase);
        this.precioEnsamble = precioEnsamble;
        this.descripcionProceso = descripcionProceso;
    }

    // Getters y setters para los atributos adicionales de ParteCompuesta
    public double getPrecioEnsamble() {
        return precioEnsamble;
    }

    public void setPrecioEnsamble(double precioEnsamble) {
        this.precioEnsamble = precioEnsamble;
    }

    public String getDescripcionProceso() {
        return descripcionProceso;
    }

    public void setDescripcionProceso(String descripcionProceso) {
        this.descripcionProceso = descripcionProceso;
    }

    // Sobrescritura del método obtenerPrecio para calcular el precio final de la parte compuesta
    @Override //@Override es una anotación que se usa para indicar que un método en una clase hija está sobrescribiendo (redefiniendo) un método de la clase padre. 
    //Esto significa que el método en la clase hija reemplaza al método de la clase padre cuando se llama desde una instancia de la clase hija.
    public double obtenerPrecio() {
        return (getPrecioBase() + precioEnsamble) * 1.11; // Precio base más precio de ensamble, con un incremento del 11%
    }

    // Sobrescritura del método mostrarInformacion para incluir información adicional de la parte compuesta
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Precio Ensamble: " + precioEnsamble + "\nDescripción del Proceso: " + descripcionProceso + "\nPrecio Final (Parte Compuesta): " + obtenerPrecio());
    }
}