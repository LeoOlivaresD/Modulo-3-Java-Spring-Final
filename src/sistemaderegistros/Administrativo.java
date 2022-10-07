package sistemaderegistros;
public class Administrativo extends Usuario {
    //Declaracion de atributos
    private String area ;
    private String experienciaPrevia;

    //metodo contructor sin parametros
    public Administrativo() {
    }
    //metodo contructor con parametros


    public Administrativo(String nombre, String apellido, Integer rut, String fechaNacimiento, String area, String experienciaPrevia) {
        super(nombre, apellido, rut, fechaNacimiento);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    //generacion de metodo setter and getter
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                '}';
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Area: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }
}
