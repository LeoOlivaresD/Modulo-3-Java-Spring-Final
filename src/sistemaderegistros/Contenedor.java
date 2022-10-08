package sistemaderegistros;

import com.sun.jdi.InterfaceType;
import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Contenedor {
    Scanner in = new Scanner(System.in);
    List<Asesoria> listaUsuario = new ArrayList<>();
    List<Capacitacion> listaCapacitaciones = new ArrayList<>();

    public Contenedor() {
    }

    public Contenedor(List<Asesoria> listaUsuario, List<Capacitacion> listaCapacitaciones) {
        this.listaUsuario = listaUsuario;
        this.listaCapacitaciones = listaCapacitaciones;
    }

    public List<Asesoria> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Asesoria> listaUsuario) {

        this.listaUsuario = listaUsuario;
    }

    public List<Capacitacion> getListaCapacitaciones() {
        return listaCapacitaciones;
    }

    public void setListaCapacitaciones(List<Capacitacion> listaCapacitaciones) {
        this.listaCapacitaciones = listaCapacitaciones;
    }

    //metodo almacenar Cliente
    public void almacerCliente(Cliente cliente) {
        listaUsuario.add(cliente);
    }

    //metodo almacenarProfesional
    public void almacenarProfesional(Profesional profesional) {
        listaUsuario.add(profesional);
    }

    //metodo almacenarAdministrativo
    public void almacenarAdministrativo(Administrativo administrativo) {
        listaUsuario.add(administrativo);
    }

    //metodo almacenarCapacitacion
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        listaCapacitaciones.add(capacitacion);
    }

    //metodo eliminarUsuario

    public void eliminarUsuario(Integer rut) {
        List<Asesoria> listaEncontrado = new ArrayList<>();
        System.out.println("Digite el rut sin puntos ni guion para eliminar un usuario");
        rut = in.nextInt();
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario usuario = (Usuario) listaUsuario.get(i);
            if (usuario.getRut().equals(rut)) {
                listaUsuario.remove(i);
            }
        }
        listaUsuario.removeAll(listaEncontrado);
    }


    public void listarUsuarios() {
        System.out.println("Usuarios Registrados en el sistema");
        for (int i = 0; i < listaUsuario.size(); i++) {
            listaUsuario.get(i).analizarUsuario();
            System.out.println("******************");
        }
    }

    //metodo listarUsuarioTipo
    /*public void listarUsusarioTipo() {*/
    public void listarPorTipo() {
        String perfil;
        System.out.println("Indique el tipo a listar: \n" +
                "- Cliente \n" +
                "- Administrativo \n" +
                "- Profesional");
        perfil = in.nextLine();
        if (perfil.equalsIgnoreCase("cliente")) {
            for (int i = 0; i < listaUsuario.size(); i++) {
                if (listaUsuario.get(i).toString().contains("Telefono")) {
                    System.out.println(listaUsuario.get(i).toString());
                    System.out.println("-----------------------------");
                }
            }
        } else if (perfil.equalsIgnoreCase("administrativo")) {
            for (int i = 0; i < listaUsuario.size(); i++) {
                if (listaUsuario.get(i).toString().contains("area")) {
                    System.out.println(listaUsuario.get(i).toString());
                    System.out.println("-----------------------------");
                }
            }
        } else if (perfil.equalsIgnoreCase("profesional")) {
            for (Asesoria asesoria : listaUsuario) {
                if (asesoria.toString().contains("titulo")) {
                    System.out.println(listaUsuario.toString());
                    System.out.println("----------------------------");
                }
            }
        }
    }

    //metodo listarCapacitaciones
    public void listarCapacitaciones() {
        System.out.println(listaCapacitaciones.toString());
    }
    /*public void listarCapacitaciones() {
        for (int i = 0; i < listaCapacitaciones.size(); i++) {
                listaCapacitaciones.get(i).mostrarDetalle();
        }
    }*/

}
