public class Main {
    public static void main(String[] args) {
        // Creación de una parte simple
        ParteSimple parteSimple = new ParteSimple("001", "Filtro de Aire", 100);
        parteSimple.mostrarInformacion();

        // Creación de una parte compuesta
        ParteCompuesta parteCompuesta = new ParteCompuesta("002", "Motor", 500, 200, "Proceso de ensamblaje complejo");
        parteCompuesta.mostrarInformacion();
    }
}
