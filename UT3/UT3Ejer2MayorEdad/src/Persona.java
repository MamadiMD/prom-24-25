public class Persona {
    int edad;
    String nombre;

    public Persona(int edad , String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    public void esMayorDeEdad(){
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }
    }
}
