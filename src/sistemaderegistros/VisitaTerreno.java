package sistemaderegistros;
import java.util.Scanner;
public class VisitaTerreno {
    private long idVisitaTerreno;
    String comentarios; //maxima 100 caracteres
    Scanner in = new Scanner(System.in);
    public VisitaTerreno(){}

    public VisitaTerreno(long idVisitaTerreno, String comentarios) {
        this.idVisitaTerreno = idVisitaTerreno;
        this.comentarios = comentarios;
    }

    public long getIdVisitaTerreno() {
        return idVisitaTerreno;
    }

    public void setIdVisitaTerreno(long idVisitaTerreno) {
        do {
            System.out.println("Ingrese un numero entero como identificador para accidente");
            idVisitaTerreno = in.nextLong();
        } while (idVisitaTerreno <= 0);
        this.idVisitaTerreno = idVisitaTerreno;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        do {
            System.out.println("Escriba un comentario sobre la visita a terreno en un maximo de 100 caracteres");
        }while (comentarios.length() > 100);
        this.comentarios = comentarios;
    }
}
