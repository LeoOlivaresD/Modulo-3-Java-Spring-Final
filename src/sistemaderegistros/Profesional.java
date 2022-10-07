package sistemaderegistros;
public class Profesional extends Usuario{
    //Declaracion de atributos
    private String titulo;
    private String fechaIngreso;

    //metodo contructor sin parametros
    public Profesional (){}

    public Profesional(String nombre, String apellido, Integer rut, String fechaNacimiento, String titulo, String fechaIngreso) {
        super(nombre, apellido, rut, fechaNacimiento);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    //generacion de metodo setter and getter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Titulo: " + titulo + " Fecha ingreso: " + fechaIngreso);
    }
}
