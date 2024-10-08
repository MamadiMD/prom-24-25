public class Cancion {
    public String nombre;
    public int duracion;
    public String genero;
    public int vecesReproducida;

    public Cancion(String nombre,int duracion,String genero){
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.vecesReproducida = 0;
    }

    public void aSidoReproducida(){
        vecesReproducida++;
    }

    public void informacionCancion(){
        System.out.println("Nombre: "+nombre+"\nDuracion: "+duracion+"\nGenero: "+genero+"\nVeces reproducida: "+vecesReproducida);
    }
}
