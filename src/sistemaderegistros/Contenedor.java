package sistemaderegistros;

import com.sun.jdi.InterfaceType;
import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Contenedor {
    Scanner in = new Scanner(System.in);
    List<Asesoria> listaUsuario = new ArrayList<Asesoria>();
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

    /*public void eliminarUsuario(Integer rut){
        if(listaUsuarios.size() > 0){
            System.out.println("Indique el run del usuario que desea eliminar");
            rut = in.nextInt();
            List<Asesoria> listaEncontrado = new ArrayList<>();
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i).toString().contains(valueOf(rut))) {
                    listaEncontrado.add(listaUsuarios.get(i));
                }
            }
            listaUsuarios.removeAll(listaEncontrado);
        }
    }*/

    public void eliminarUsuario(Integer rut) {
        List<Asesoria> listaEncontrado = new ArrayList<>();
        System.out.println("Digite el rut sin puntos ni guion para eliminar un usuario");
        rut = in.nextInt();
        for (int i = 0; i < listaUsuario.size(); i++) {
            if (listaUsuario.get(i).toString().contains(valueOf(rut))) {
                listaEncontrado.add(listaUsuario.get(i));
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
    /*    int perfil = 0;*/
    /*       System.out.println("Indique segun el numero que corresponda la lista de usuarios que desea mostrar \n" +*/
    /*            "1-Cliente\n" +*/
    /*            "2-Profesional\n" +*/
    /*            "3-Administrativo");*/
    /*    perfil = in.nextInt();*/
    /*    switch (perfil) {*/
    /*        case 1:*/
    /*            for (int i = 0; i <listaUsuario.size() ; i++) {*/
    /*               Cliente cliente = new Cliente();*/
    /*               cliente.*/
    /*               */
    /*               */
    /*            }*/
    /**/
    /*         break;*/
    /**/
    /**/
    /*        default:*/
    /*            break;*/
    /*    }*/
    /**/
    /*}*/

    //metodo listarCapacitaciones
    public void listarCapacitaciones() {
        for (int i = 0; i < listaCapacitaciones.size(); i++) {

        }
    }

}
