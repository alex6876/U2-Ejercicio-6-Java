public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Alex_olivares");
        Usuario usuario2 = new Usuario("Pedro_gg");

        RedSocial redSocial = new RedSocial();

        redSocial.enviarSolicitud(usuario1,usuario2);
        usuario2.mostrarNotificacion();
    }
}