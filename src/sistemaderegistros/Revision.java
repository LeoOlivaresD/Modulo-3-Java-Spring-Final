package sistemaderegistros;

public class Revision extends VisitaTerreno {
    private long idRevision;
    private String nombreRevision;
    private String detalleRevision;
    private int estado;  //  1 (sin problemas), 2 (con observaciones), 3 (no aprueba)

    public Revision() {
    }

    public Revision(long idVisitaTerreno, String comentarios, long idRevision, String nombreRevision, String detalleRevision, int estado) {
        super(idVisitaTerreno, comentarios);
        this.idRevision = idRevision;
        this.nombreRevision = nombreRevision;
        this.detalleRevision = detalleRevision;
        this.estado = estado;
    }

    public long getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(long idRevision) {
        do {
            System.out.println("Por favor ingrese un numero entero para asignar como id de revision");
            idRevision = in.nextInt();
        } while (idRevision <= 0);
        this.idRevision = idRevision;
    }

    public String getNombreRevision() {
        return nombreRevision;
    }

    public void setNombreRevision(String nombreRevision) {
        do {
            System.out.println("Declare un nombre para la revision");
            nombreRevision = in.nextLine();
        } while (nombreRevision.length() < 10 || nombreRevision.length() > 50);

        this.nombreRevision = nombreRevision;
    }

    public String getDetalleRevision() {
        return detalleRevision;
    }

    public void setDetalleRevision(String detalleRevision) {
        do {
            System.out.println("A continuacion redacte en un maximo de 100 caracteres el detalle para la revision");
            detalleRevision = in.nextLine();
        } while (detalleRevision.length() > 100);
        this.detalleRevision = detalleRevision;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        int validacion = 0;
        do {
            System.out.println(" Por favor ingrese el estado que corresponda segun el numero que lo representa\n" +
                    "1-Sin problemas\n" +
                    "2-Con observaciones\n" +
                    "3-No aprueba");
            estado = in.nextInt();

            switch (estado) {
                case 1:
                    System.out.println("Revision a sido evaluada sin problemas");
                    validacion = 1;
                    break;
                case 2:
                    System.out.println("Revision a sido evaluada con observaciones");
                    validacion = 2;
                    break;
                case 3:
                    System.out.println("Revision determino que No aprueba");
                    validacion = 3;
                    break;
                default:
                    System.out.println(" Por favor ingrese una opcion valida, intente nuevamente");
                    validacion = 4;
                    break;
            }
        } while (validacion == 4);
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", nombreRevision='" + nombreRevision + '\'' +
                ", detalleRevision='" + detalleRevision + '\'' +
                ", estado=" + estado +
                '}';
    }
}
