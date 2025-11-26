import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    void testPrestarLibro() {
        Libro libro = new Libro("1984", "Orwell");
        libro.prestar();
        assertFalse(libro.estaDisponible());
    }

    @Test
    void testPrestarLibroNoDisponible() {
        Libro libro = new Libro("1984", "Orwell");
        libro.prestar();
        assertThrows(IllegalStateException.class, libro::prestar);
    }
    @Test
void testDevolverLibro() {
    Libro libro = new Libro("Cien años de soledad", "García Márquez");
    
    
    libro.prestar();
    assertFalse(libro.estaDisponible());
    
    
    libro.devolver();
    
   
    assertTrue(libro.estaDisponible());
}


    
}