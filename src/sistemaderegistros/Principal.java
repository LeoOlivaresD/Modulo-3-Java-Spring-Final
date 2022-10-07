package sistemaderegistros;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        String respuestas;
        int contador = 0, menuOpciones = 0, perfil = 0;
        boolean repetirOperacion = false;
        Scanner in = new Scanner(System.in);
        //Creaccion de Instancias
        Usuario usuario = new Usuario();
        Cliente cliente = new Cliente();
        Profesional profesional = new Profesional();
        Administrativo administrativo = new Administrativo();
        Capacitacion capacitacion = new Capacitacion();
        Contenedor contenedor = new Contenedor();
        do {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("| Bienvenido al sistema de registros de capacitaciones                      |\n" +
                    "| Indique la operacion que desea realizar segun su numero correspondiente   |\n" +
                    "| 1-Registrar cliente                                                       |\n" +
                    "| 2-Registrar profesional                                                   |\n" +
                    "| 3-Registrar administrativo                                                |\n" +
                    "| 4-Registrar capacitacion                                                  |\n" +
                    "| 5-Eliminar usuario                                                        |\n" +
                    "| 6-Listar todos los usuarios registrados                                   |\n" +
                    "| 7-Listar los usuarios por perfil (cliente, profesional o administrativo)  |\n" +
                    "| 8-Listar capacitaciones registradas                                       |\n" +
                    "| 9-Salir                                                                   |");
            System.out.println("-----------------------------------------------------------------------------");
            menuOpciones = in.nextInt();
            if (menuOpciones > 9 || menuOpciones < 1) {
                System.out.println("Error, debe ingresar una opcion valida correspondiente al numero\n" +
                        "intente nuevamente");
            }
            switch (menuOpciones){
                case 1:
                    do {
                        cliente.setNombre(cliente.getNombre());
                        cliente.setApellido(cliente.getApellido());
                        cliente.setRut(cliente.getRut());
                        cliente.setFechaNacimiento(cliente.getFechaNacimiento());
                        cliente.setTelefono(cliente.getTelefono());
                        cliente.setAfp(cliente.getAfp());
                        cliente.setSistemaDeSalud(cliente.getSistemaDeSalud());
                        cliente.setDireccion(cliente.getDireccion());
                        cliente.setComuna(cliente.getComuna());
                        cliente.setEdad(cliente.getEdad());
                        in.nextLine();

                        for (contador = 0; contador < contenedor.listaUsuario.size() ; contador++) {
                            contenedor.almacerCliente(cliente);
                        }
                        System.out.println("Datos de usuario registrados: ");
                        cliente.analizarUsuario();
                        contenedor.listarUsuarios();
                        System.out.println("¿Desea agregar mas clientes, responda si / no?");
                         respuestas= in.nextLine();
                         if (respuestas.equals("si")){
                             contador = contador + 1;
                         }
                        if( respuestas.equals("si")){
                            repetirOperacion = true;
                        }else {
                            repetirOperacion=false;
                        }
                    }while (repetirOperacion == true);
                    break;
                case 2:
                    profesional.setNombre(profesional.getNombre());
                    profesional.setApellido(profesional.getApellido());
                    profesional.setRut(profesional.getRut());
                    profesional.setFechaNacimiento(profesional.getFechaNacimiento());
                    profesional.setTitulo(profesional.getTitulo());
                    profesional.setFechaIngreso(profesional.getFechaIngreso());
                    break;
                case 3:
                    administrativo.setNombre(administrativo.getNombre());
                    administrativo.setApellido(administrativo.getApellido());
                    administrativo.setRut(administrativo.getRut());
                    administrativo.setFechaNacimiento(administrativo.getFechaNacimiento());
                    administrativo.setArea(administrativo.getArea());
                    administrativo.setExperienciaPrevia(administrativo.getExperienciaPrevia());
                    break;
                case 4:
                    capacitacion.setId(capacitacion.getId());
                    capacitacion.setRutCliente(capacitacion.getRutCliente());
                    capacitacion.setDia(capacitacion.getDia());
                    capacitacion.setHora(capacitacion.getHora());
                    capacitacion.setLugar(capacitacion.getLugar());
                    capacitacion.setDuracion(capacitacion.getDuracion());
                    capacitacion.setCantidadDeAsistentes(capacitacion.getCantidadDeAsistentes());

                    break;
                case 5:
                    contenedor.eliminarUsuario(cliente.getRut());
                    break;
                case 6:
                    contenedor.listarUsuarios();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("-------------------------------------------");
                    System.out.println("| Proceso finalizado con exito             | \n" +
                            "| Hasta pronto, gracias por su preferencia |");
                    System.out.println("-------------------------------------------");
                    break;
            }
        } while (menuOpciones > 9 || menuOpciones < 1 || repetirOperacion == false);

    }
}
