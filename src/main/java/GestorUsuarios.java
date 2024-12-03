import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(String nombre, String correo) {
        if (nombre == null || nombre.isEmpty() || correo == null || correo.isEmpty()) {
            throw new IllegalArgumentException("Nombre y correo no                 pueden ser vacíos.");
        }
        usuarios.add(new Usuario(nombre, correo));
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    public void actualizarCorreo(String nombre, String nuevoCorreo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                usuarios.remove(usuario);
                usuarios.add(new Usuario(nombre, nuevoCorreo));
                return;
            }
        }
        throw new IllegalArgumentException("Usuario no encontrado.");
    }

    public void eliminarUsuario(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                usuarios.remove(usuario);
                return;
            }
        }
        throw new IllegalArgumentException("Usuario no encontrado.");
    }

}
