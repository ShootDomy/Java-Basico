import ClasesAbstractas.Circulo;
import ClasesAbstractas.Rectangulo;
import basico.Animal;
import basico.Gato;
import basico.Perro;
import basico.Veterinaria;

public class App {
        public static void main(String[] args) throws Exception {
                /**
                 * TODO: Carpeta basico
                 */
                // Carrera c = new Carrera();
                // c.nombre = "Ingeniería de Software";
                // c.duracion = 10;
                // c.estaEnCurso = true;

                // Persona p = new Persona();
                // p.nombre = "Domenica";
                // p.apellido = "Cañizares";
                // p.edad = 25;
                // p.tecnologias = new String[] { "Java", "Typescript", "React" };
                // p.esEstudiante = true;
                // p.carrera = c;

                // Persona p = new Persona("Domenica", "Cañizares", 25/* , "Ingeniería de
                // Software", 10, true */);

                // System.out.println(p.darNombreCompleto() + " " + p.getEdad());

                // String saludado = "Domenica";
                // System.out.println(p.enviarSaludo(saludado));

                // System.out.println(p.carrera.nombre);

                Animal animal = new Animal("Bestia", 10);
                Gato gato = new Gato("Gatito", 5);
                Perro perro = new Perro("Perrito", 7);

                System.out.println(
                                "Animal: " + animal.getNombre() + " " + animal.getEdad() + " Hace sonido: "
                                                + animal.hacerSonido());
                System.out
                                .println("Animal: " + gato.getNombre() + " " + gato.getEdad() + " Hace sonido: "
                                                + gato.hacerSonido());
                System.out.println(
                                "Animal: " + perro.getNombre() + " " + perro.getEdad() + " Hace sonido: "
                                                + perro.hacerSonido());

                // Atributos estaticos
                System.out.println("Contador de animales: " + Animal.getContadorAnimales());
                System.out.println("Nombre de la veterinaria: " + Veterinaria.getNombre());

                /**
                 * TODO: Carpeta ClasesAbstractas
                 */
                Circulo circulo = new Circulo(5);
                Rectangulo rectangulo = new Rectangulo(5, 10);

                circulo.imprimirInformacion();
                System.out.println("El area es: " + circulo.calcularArea());
                rectangulo.imprimirInformacion();
                System.out.println("El area es: " + rectangulo.calcularArea());

        }
}
