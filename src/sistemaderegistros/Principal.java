package sistemaderegistros;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        String respuestas;
        int ingresos = 0, menuOpciones = 0;
        boolean repetirOperacion = false;
        Scanner in = new Scanner(System.in);
        //Creaccion de Instancias
        Contenedor contenedor = new Contenedor();
        //Capacitacion capacitacion = new Capacitacion();
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
            switch (menuOpciones) {
                case 1:
                    do {
                        System.out.println("Cuantos clientes desea ingresar");
                        ingresos = in.nextInt();
                        for (int i = 0; i < ingresos; i++) {
                            Cliente cliente = new Cliente();
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
                            contenedor.almacerCliente(cliente);
                            System.out.println("Datos de usuario registrados: ");
                        }
                        System.out.println("Volviendo al menu principal..");
                        repetirOperacion=false;

                    } while (repetirOperacion == true);
                    break;
                case 2:
                    do {
                        System.out.println("¿Cuantos profesionales desea ingresar?");
                        ingresos = in.nextInt();
                        for (int i = 0; i < ingresos; i++) {
                            Profesional profesional= new Profesional();
                            profesional.setNombre(profesional.getNombre());
                            profesional.setApellido(profesional.getApellido());
                            profesional.setRut(profesional.getRut());
                            profesional.setFechaNacimiento(profesional.getFechaNacimiento());
                            profesional.setTitulo(profesional.getTitulo());
                            profesional.setFechaIngreso(profesional.getFechaIngreso());
                            contenedor.almacenarProfesional(profesional);
                            System.out.println("Datos de usuario registrados: ");
                        }
                        System.out.println("Volviendo al menu principal..");
                        repetirOperacion=false;

                    }while (repetirOperacion == true);
                    break;
                case 3:
                    do {
                        System.out.println("¿Cuantos administrativos desea ingresar?");
                        ingresos = in.nextInt();
                        for (int i = 0; i < ingresos; i++) {
                            Administrativo administrativo = new Administrativo();
                            administrativo.setNombre(administrativo.getNombre());
                            administrativo.setApellido(administrativo.getApellido());
                            administrativo.setRut(administrativo.getRut());
                            administrativo.setFechaNacimiento(administrativo.getFechaNacimiento());
                            administrativo.setArea(administrativo.getArea());
                            administrativo.setExperienciaPrevia(administrativo.getExperienciaPrevia());
                            contenedor.almacenarAdministrativo(administrativo);
                            System.out.println("Datos de usuario registrados: ");
                        }
                        System.out.println("Volviendo al menu principal..");
                        repetirOperacion=false;
                    }while (repetirOperacion == true );
                    break;
                case 4:
                    do {
                        System.out.println("Ingrese el numero de ingresos para capacitacion");
                        ingresos= in.nextInt();
                        for (int i = 0; i < ingresos; i++) {
                            Capacitacion capacitacion= new Capacitacion();
                            capacitacion.setId(capacitacion.getId());
                            capacitacion.setRutCliente(capacitacion.getRutCliente());
                            capacitacion.setDia(capacitacion.getDia());
                            capacitacion.setHora(capacitacion.getHora());
                            capacitacion.setLugar(capacitacion.getLugar());
                            capacitacion.setDuracion(capacitacion.getDuracion());
                            capacitacion.setCantidadDeAsistentes(capacitacion.getCantidadDeAsistentes());
                            contenedor.almacenarCapacitacion(capacitacion);
                            System.out.println("Datos de capacitacion registrados: ");
                        }
                        System.out.println("Volviendo al menu principal..");
                        repetirOperacion=false;
                    }while (repetirOperacion == true );
                    break;
                case 5:
                    contenedor.eliminarUsuario(0);
                    break;
                case 6:
                    contenedor.listarUsuarios();
                    break;
                case 7:
                    contenedor.listarPorTipo();
                    break;
                case 8:
                    contenedor.listarCapacitaciones();
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
