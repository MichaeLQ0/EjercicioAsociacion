public class Lector {

    private String nombre;
    private String cedula;
    private Libro libroActual;

    //CONSTRUCTORES
    public Lector() {
    }

    public Lector(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return this.nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public Libro getLibroActual() {
        return this.libroActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setLibroActual(Libro libroActual) {
        this.libroActual = libroActual;
    }

    public void tomarPrestado(Libro libro){
        if (libroActual != null) {
            System.out.println("El lector ya tiene un libro prestado: " + libroActual.getTitulo() + ". Debe devolverlo antes de tomar otro prestado.");
        } else {
            if(libro.prestar()){
                this.libroActual = libro;
            }
        }
    }

    public void devolverLibro(){
        if (libroActual == null){
            System.out.println(this.nombre + " no tiene ningún libro.");
        }else {
            libroActual.devolver();
            libroActual = null;
        }
    }

    public void mostrarEstado(){
        String estado = (libroActual != null) ? libroActual.getTitulo() : "Sin libro";
        System.out.println("Lector: " + this.nombre + " | Libro: " + estado);
    }

}
