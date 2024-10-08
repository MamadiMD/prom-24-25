public class ReproductorMusica {

    public Cancion cancionActual;
    public int tiempoRestante;
    public double bateria;
    public boolean encendido;

    public ReproductorMusica(){
        this.bateria = 100;
        this.encendido = false;
    }

    public boolean cambiarCancion(Cancion nuevaCancion){
        if (bateria == 0){
            System.out.println("Sin bateria");
            return false;
        }else {
            this.cancionActual = nuevaCancion;
            this.tiempoRestante = nuevaCancion.duracion;
            this.bateria -= 5;
            return true;
        }
    }

    public void reproducirCancion(double tiempoReproduccion){
        if (bateria == 0){
            System.out.println("Sin bateria");
        }else {
            tiempoRestante -= tiempoReproduccion;
            bateria -= (tiempoReproduccion/60);
            if (bateria == 0){
                this.encendido = false;
            }

        }
    }

    public boolean consultarBateria(){
        if (bateria == 0){
            System.out.println("Sin bateria");
            return false;
        }else {
            System.out.println(bateria+"%");
            return true;
        }
    }
    public boolean estaEncendido(){
        return encendido;
    }

    public boolean encender(){
        if (bateria == 0){
            System.out.println("Sin bateria");
            this.encendido = false;
            return false;
        }else {
            System.out.println("Encendiendo");
            this.encendido = true;
            return true;
        }
    }

    public void apagar(){
        this.encendido = false;
    }

    public void informacionReproductor(){
        cancionActual.informacionCancion();
        System.out.println("Bateria: "+bateria+"\n¿Esta encendido?: "+encendido+"\nTiempo restante: "+tiempoRestante);
    }
}
