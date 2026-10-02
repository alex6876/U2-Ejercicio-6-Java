# 📲 Simulación de Notificaciones en Red Social (POO en Java)

Este proyecto es una simulación sencilla de la interacción entre usuarios dentro de una red social. Está enfocado en aplicar conceptos fundamentales de la **Programación Orientada a Objetos (POO)** mediante la comunicación entre clases y la asignación de mensajes en memoria (sin bases de datos ni persistencia).

---

## 🧩 Clases y Estructura del Sistema

El sistema modela el envío de solicitudes mediante 3 clases principales:

*   **`Usuario`**: Representa a un perfil dentro de la red social.
    *   **Atributos:** `nombreUsuario`, `notificaciones` (almacena el último mensaje recibido) y `lsitaAmigos`.
    *   **Métodos:** `recibirNotificacion()` para almacenar un mensaje y `mostrarNotificacion()` para imprimirlo en pantalla.
*   **`RedSocial`**: Actúa como el intermediario o gestor de la plataforma.
    *   **Métodos:** `enviarSolicitud(Usuario usuarioRemitente, Usuario receptor)` construye el mensaje utilizando la información del emisor y se lo envía al receptor.
*   **`Main`**: Punto de entrada de la aplicación donde se instancian dos usuarios, se ejecuta el envío de la solicitud de amistad y se muestra el resultado.

---

## ⚙️ Flujo de Comunicación entre Objetos

1. **Instanciación:** Se crean dos objetos de tipo `Usuario` (`usuario1` y `usuario2`).
2. **Intermediación:** La clase `RedSocial` recibe las referencias de ambos objetos.
3. **Paso de Mensajes:** `RedSocial` obtiene el nombre del emisor (`getNombreUsuario()`), arma el texto de la solicitud y llama al método `recibirNotificacion()` del usuario receptor.
4. **Visualización:** El usuario receptor ejecuta `mostrarNotificacion()` para consultar el estado de su atributo `notificaciones`.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa produce el siguiente resultado:

```text
notificicacion de Pedro_gg:
Alex_olivares te ha enviado una solicitud de amistad.
