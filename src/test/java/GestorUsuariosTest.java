import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorUsuariosTest {

    @Test
    public void testAgregarUsuarioValido() {
        // Arrange
        GestorUsuarios gestor = new GestorUsuarios();

        // Act
        gestor.agregarUsuario("Juan", "juan@example.com");

        // Assert
        assertEquals(1, gestor.obtenerUsuarios().size());
    }

    @Test
    public void testActualizarCorreoValido() {
        // Arrange
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.agregarUsuario("Ana", "ana@example.com");

        // Act
        gestor.actualizarCorreo("Ana", "ana.nuevo@example.com");

        // Assert
        assertEquals("ana.nuevo@example.com",
                gestor.obtenerUsuarios().get(0).getCorreo());
    }

    @Test
    public void testEliminarUsuarioValido() {
        // Arrange
        GestorUsuarios gestor = new GestorUsuarios();
        gestor.agregarUsuario("Luis", "luis@example.com");

        // Act
        gestor.eliminarUsuario("Luis");

        // Assert
        assertEquals(0, gestor.obtenerUsuarios().size());
    }

}
