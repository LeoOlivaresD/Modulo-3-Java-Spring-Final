package sistemaderegistros;
import java.text.ParseException;
import java.util.Scanner;
public class Pruebas {
    public static void main(String[] args) throws ParseException {
        int perfil = 0;
        String respuesta = "no";
        Scanner in = new Scanner(System.in);
        //Creaccion de Instancias
        Contenedor contenedor= new Contenedor();
        Capacitacion capacitacion = new Capacitacion(1,"miercoles","22","valparaiso",1,"1 hora",2);
        contenedor.almacenarCapacitacion(capacitacion);


        //Cliente cliente = new Cliente("Leonado","Olivares",18842139,"07/08/1994","930985129","Plan Vital","1","V Alemana",28,"Goepfert");
        //Cliente cliente1 = new Cliente("Felipe","Pacheco",20321123,"14/12/1994","+56912121212","Modelo","2","Mapipu",29,"Santiago");
        //Asesoria cliente = new Cliente();
        /*for (int i = 0; i <2 ; i++) {
            Cliente cliente = new Cliente();
            cliente.setNombre(cliente.getNombre());
            cliente.setApellido(cliente.getApellido());
            cliente.setRut(cliente.getRut());
            contenedor.almacerCliente(cliente);
        }*/
        /*contenedor.listarUsuarios();
        System.out.println("Eliminarl agun usuario");
        contenedor.eliminarUsuario(18842139);
        System.out.println("Se deberia eliminar Leo");
        System.out.println("Mostramos lista otra vez");
        contenedor.listarUsuarios();
        Profesional profesional = new Profesional();
        Administrativo administrativo = new Administrativo();
        Capacitacion capacitacion = new Capacitacion();*/

        /*System.out.println("-----------------------------------------------------------");
        System.out.println("|Hola bienvenido al sistema de registros de capacitaciones|");
        System.out.println("-----------------------------------------------------------");
        do {
            System.out.println("Por favor ingresa el tipo de usuario a registrar segun el numero correspondiente: ");
            System.out.println("1-Cliente \n" +
                    "2-Profesional \n" +
                    "3-Administrativo");
            perfil = in.nextInt();
            switch (perfil) {
                case 1:
                    cliente.setNombre(cliente.getNombre());
                    cliente.setApellido(cliente.getApellido());
                    cliente.setRut(cliente.getRut());
                    cliente.setFechaNacimiento(cliente.getFechaNacimiento());
                    cliente.setTelefono(cliente.getTelefono());
                    *//*cliente.setAfp(cliente.getAfp());
                    cliente.setSistemaDeSalud(cliente.getSistemaDeSalud());
                    cliente.setDireccion(cliente.getDireccion());
                    cliente.setComuna(cliente.getComuna());
                    cliente.setEdad(cliente.getEdad());*//*
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

                default:
                //System.out.println("Datos de usuario: ");
                //System.out.println(cliente.toString());
            }
            System.out.println("¿Desea agregar otro usuario?");
            respuesta = in.nextLine();
        } while (respuesta.equals("si"));
        //cliente.analizarUsuario();
        *//*capacitacion.setId(capacitacion.getId());
        capacitacion.setRutCliente(capacitacion.getRutCliente());
        capacitacion.setDia(capacitacion.getDia());
        capacitacion.setHora(capacitacion.getHora());
        capacitacion.setLugar(capacitacion.getLugar());
        capacitacion.setDuracion(capacitacion.getDuracion());
        capacitacion.setCantidadDeAsistentes(capacitacion.getCantidadDeAsistentes());*//*


        //Revision revision = new Revision();
        //revision.setEstado(revision.getEstado());

        //instancia para clase Contenedor
        *//*Contenedor contenedor = new Contenedor();
        contenedor.almacerCliente(cliente);
        //contenedor.almacerCliente(cliente1);
        contenedor.almacenarProfesional(profesional);
        contenedor.almacenarAdministrativo(administrativo);
        contenedor.listarUsuarios();
        contenedor.eliminarUsuario(18842139);
        System.out.println("aca deberia eliminar el anterior");
        contenedor.listarUsuarios();
        System.out.println("aca ya paso por la lista");*//*
        //contenedor.listarUsusarioTipo(cliente);
        //contenedor.listarUsusarioTipo(cliente1);

        //Creacion de instancia para listado
        //Listado listado = new Listado();
        //se llama al metodo de agregarElemento para agregar las instancias creadas a la lista
        //listado.agregandoElemento(listado);

        //Se imprime la lista de instancias creadas
        //listado.analizarUsuario();*/
    }
}
