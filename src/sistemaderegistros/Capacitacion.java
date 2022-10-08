package sistemaderegistros;

import java.util.Scanner;

public class Capacitacion extends Evento {
    Scanner in = new Scanner(System.in);
    //Declarion de atributos para Capacitacion
    int id;
    String duracion;
    int cantidadDeAsistentes;

    //Se genera constructor sin parametro
    public Capacitacion() {
    }

    //Se genera constructor con parametros
    public Capacitacion(int rutCliente, String dia, String hora, String lugar, int id, String duracion, int cantidadDeAsistentes) {
        super(rutCliente, dia, hora, lugar);
        this.id = id;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        do {
            System.out.println("Ingrese un numero entero como identificador el cual se le asignara a su capacitacion");
            id = in.nextInt();
        } while (id <= 0);

        this.id = id;
        in.nextLine();
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        do {
            System.out.println("Ingrese duracion de la capacitacion");
            duracion = in.nextLine();
        } while (duracion.length() > 70 || duracion.isEmpty() || duracion.isBlank());
        this.duracion = duracion;
    }

    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }

    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
        do {
            System.out.println("Ingrese cantidad de asistentes");
            cantidadDeAsistentes = in.nextInt();
            if (cantidadDeAsistentes > 1000) {
                System.out.println("Lo sentimos la capacitacion admmite solo hasta 1000 personas");
            }
        } while (cantidadDeAsistentes > 1000);
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    //to Strings
    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", duracion='" + duracion + '\'' +
                ", cantidadDeAsistentes=" + cantidadDeAsistentes +
                "} " + super.toString();
    }

    //Creacion de metodo mostrarDetalle()
    public String mostrarDetalle() {
        String detalle = "La capacitacion sera en: " + getLugar() + " a las " + getHora() + " del dia " + getDia() + " y durara " + duracion;
        return detalle;
    }
}
