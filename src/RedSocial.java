public class RedSocial {
    public void enviarSolicitud(Usuario usuarioRemitente, Usuario receptor){
        String mensaje =  usuarioRemitente.getNombreUsuario()
                + " te ha enviado una solicitud de amistad.";

        receptor.recibirNotificacion(mensaje);
    }
}
