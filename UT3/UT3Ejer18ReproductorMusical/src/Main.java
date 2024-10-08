public class Main {
    public static void main(String[] args) {
        // Creando canciones
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", 360, "Rock");
        Cancion cancion2 = new Cancion("Imagine", 183, "Pop");

        // Creando reproductor y encendiéndolo
        ReproductorMusica miReproductor = new ReproductorMusica();
        miReproductor.encender();

        // Cambiando y reproduciendo canciones
        miReproductor.cambiarCancion(cancion1);
        miReproductor.reproducirCancion(120);

        // Mostrando información del reproductor
        miReproductor.informacionReproductor();

        // Cambiando de canción y mostrando información
        miReproductor.cambiarCancion(cancion2);
        miReproductor.reproducirCancion(100);
        miReproductor.informacionReproductor();

        // Consultando batería restante
        System.out.println("Batería restante: " + miReproductor.consultarBateria() + "%");
    }
}