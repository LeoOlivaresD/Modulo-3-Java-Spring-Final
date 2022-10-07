package sistemaderegistros;

public class Accidente extends Evento{
    private Long idAccidente;
    private String origen; //máximo 100 caracteres
    private String consecuencias; //máximo 100 caracteres

    public Accidente(){}

    public Accidente(int rutCliente, String dia, String hora, String lugar, Long idAccidente, String origen, String consecuencias) {
        super(rutCliente, dia, hora, lugar);
        this.idAccidente = idAccidente;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public Long getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(Long idAccidente) {
        do {
            System.out.println("Ingrese un numero entero como identificador para accidente");
            idAccidente = in.nextLong();
        } while (idAccidente <= 0);
        this.idAccidente = idAccidente;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        do {
            System.out.println("Describa el origen en no mas de 100 caracteres");
            origen = in.nextLine();
        }while (origen.length() > 100 || origen.length() < 10 || origen.isEmpty() || origen.isBlank());
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        do{
            System.out.println("Describa las consecuencias del accidente en un maximo de 100 caracteres");
            consecuencias = in.nextLine();
        }while (consecuencias.length() > 100 || consecuencias.isEmpty() || consecuencias.isBlank());
        this.consecuencias = consecuencias;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "idAccidente=" + idAccidente +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
