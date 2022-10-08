package sistemaderegistros;

import java.util.Scanner;

public class Evento {
    Scanner in = new Scanner(System.in);
    protected int rutCliente;
    protected String dia;
    protected String hora;
    protected String lugar;

    public Evento() {
    }

    public Evento(int rutCliente, String dia, String hora, String lugar) {
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        do {
            System.out.println("Ingrese el rut del cliente sin puntos ni digito verificador");
            rutCliente = in.nextInt();
        } while (rutCliente > 99999999);
        this.rutCliente = rutCliente;
        in.nextLine();
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        boolean validacion = false;
        String dias;
        do {
            String[] diasSemana = new String[]{"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
            System.out.println("Ingrese un dia para la capacitacion");
            dias = in.nextLine();
            String diaAcordado = dias.toLowerCase();

            for (int i = 0; i < diasSemana.length; i++) {
                if (diasSemana[i].equals(diaAcordado)) {
                    validacion = true;
                }
            }
        } while (validacion == false);
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        boolean time = false;
        int horas = 0;
        int minutos = 0;
        System.out.println("Ingrese una hora ");
        do {
            System.out.println("Ingrese horas (desde 0 a 23):");
            horas = in.nextInt();
            if (horas > 23 || horas < 0) {
                System.out.println("Ingrese una cantidad de horas valida");
                time = false;
            } else {
                time = true;

            }
        } while (time == false);

        do {
            System.out.println("Ingrese minutos (desde 0 a 59)");
            minutos = in.nextInt();
            if (minutos > 59 || minutos < 0) {
                System.out.println("Ingrese una cantidad de minutos valida");
                time = false;
            } else {
                time = true;
            }
        } while (time == false);

        String horaString = String.valueOf(horas);  //conversion de variable int minutos y horas a string
        String minutosString = String.valueOf(minutos);
        hora = horas + ":" + minutos;
        //System.out.println(hora);
        this.hora = hora;
        in.nextLine();
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        do {
            System.out.println("Ingrese lugar de capacitacion");
            lugar = in.nextLine();
        } while (lugar.length() < 5 || lugar.length() > 50 || lugar.isEmpty() || lugar.isBlank()); //decidi poner como minimo 5 porque hay regiones que no llegan a 10 caracteres
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Evento{" +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
