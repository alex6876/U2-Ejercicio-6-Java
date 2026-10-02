public class Usuario {
    String nombreUsuario;
    String lsitaAmigos;
    String notificaciones;

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void recibirNotificacion(String mensaje){
        notificaciones = mensaje;
    }

    public void mostrarNotificacion(){
        System.out.println("notificicacion de "+nombreUsuario+ ":");
        System.out.println(notificaciones);
    }
}
