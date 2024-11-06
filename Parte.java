import javax.swing.JOptionPane;

// Clase base (padre) que representa una parte genérica en la empresa de repuestos
public class Parte {
     // Atributos comunes para todas las partes
    private String numero;  // Número de identificación de la parte
    private String nombre;  // Nombre de la parte
    protected double precioBase;  // Precio base de la parte (accesible por las subclases)

    // Constructor de la clase Parte
    public Parte(String numero, String nombre, double precioBase) {
        this.numero = numero;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

     // Getters y setters para los atributos
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    // Método para obtener el precio, este método será sobrescrito en las subclases
    public double obtenerPrecio() {
        return precioBase;
    }

    // Método para mostrar la información básica de la parte usando JOptionPane
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Número: " + numero + "\nNombre: " + nombre + "\nPrecio Base: " + precioBase);
    }
}