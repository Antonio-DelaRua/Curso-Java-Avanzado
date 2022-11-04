package ObjetosYDirectivaDeMenorConocimiento.DTO;

public class Main {
    public static void main(String[] args){
        Usuario usuario = new Usuario("Dani");
        usuario.añadirVehiculo(new Vehiculo("Coche"));
        usuario.añadirVehiculo(new Vehiculo("Moto"));

        Usuario usuario2 = new Usuario("Juan");
        usuario2.añadirVehiculo(new Vehiculo("Lamborghini"));
        usuario2.añadirVehiculo(new Vehiculo("ferrari"));

        Usuarios usuarios = new Usuarios();
        usuarios.meterUsuario(usuario);
        usuarios.meterUsuario(usuario2);

        Usuario userInfo = usuarios.ObetenerUsuario("Dani");
        System.out.println(userInfo.nombre);
        for (Vehiculo vehiculo : userInfo.vehiculo){
            System.out.println(vehiculo.tipo);
        }

    }
}
