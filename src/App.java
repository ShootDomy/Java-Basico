import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import ClasesAbstractas.Circulo;
import ClasesAbstractas.Rectangulo;
import Excepciones.Calculadora;
import Excepciones.CalculadoraException;
import Interfaz.Delfin;
import Interfaz.Pulpo;
import basico.Animal;
import basico.Gato;
import basico.Perro;
import basico.Veterinaria;

public class App {
        public static void main(String[] args) throws Exception {

                System.out.println("---------------------------Carpeta basico---------------------------");
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

                System.out.println("-----------------------------Carpeta ClasesAbstractas-------------------------");

                /**
                 * TODO: Carpeta ClasesAbstractas
                 */
                Circulo circulo = new Circulo(5);
                Rectangulo rectangulo = new Rectangulo(5, 10);

                circulo.imprimirInformacion();
                System.out.println("El area es: " + circulo.calcularArea());
                rectangulo.imprimirInformacion();
                System.out.println("El area es: " + rectangulo.calcularArea());

                System.out.println("-------------------------Carpeta Interfaces-----------------------------");

                /**
                 * TODO: Carpeta Interfaces
                 */
                Delfin delfin = new Delfin("Delfin");
                Pulpo pulpo = new Pulpo("Pulpo", 8);

                delfin.nadar();
                pulpo.nadar();

                delfin.comunicarse();
                pulpo.comunicarse();

                delfin.alimentarse();
                pulpo.alimentarse();

                System.out.println(
                                "------------------------Manejo de excepciones Unchecked------------------------------");

                /**
                 * TODO: Manejo de excepciones Unchecked
                 */
                long numero = 10;
                int numero2 = 15;
                int resultado;

                // System.out.println(numero / numero2);
                // System.out.println("Esto va a dar un error");

                try {
                        // casteo de long a int
                        resultado = (int) numero / numero2;
                        System.out.println(resultado);
                } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("Esto va a dar un error");
                }

                System.out.println(
                                "-------------------------Manejo de excepciones Checked-----------------------------");
                /**
                 * TODO: Manejo de excepciones Checked
                 */

                int num1 = 10;
                int num2 = 4; // 0 para saltar el error

                Calculadora calculadora = new Calculadora();
                try {
                        resultado = calculadora.dividir(num1, num2);
                        System.out.println(resultado);
                } catch (CalculadoraException e) {
                        e.printStackTrace();
                        System.out.println("Esto va a dar un error");
                } finally {
                        System.out.println("Calculo finalizado");
                }

                System.out.println("------------------------------Colecciones SET------------------------");
                /**
                 * TODO: Colecciones SET
                 * 
                 * HashSet: No le importa el orden
                 * TreeSet: Le importa el orden alfabeticamente
                 * LinkedHashSet: Le importa el orden en el que se agrego a la coleccion
                 */
                System.out.println("Bienvenido a la coleccion de superheroes");
                Set<String> superheroes = new LinkedHashSet<>();
                superheroes.add("Spiderman");
                superheroes.add("Batman");
                superheroes.add("Superman");
                superheroes.add("Hulk");
                superheroes.add("IronMan");

                superheroes.add("Wolverine");

                if (superheroes.contains("Spiderman")) {
                        System.out.println("Spiderman esta en la coleccion");
                }

                superheroes.remove("Hulk");

                if (!superheroes.contains("Hulk")) {
                        System.out.println("Hulk no esta en la coleccion");
                }

                superheroes.add("Superman");
                superheroes.add("Superman");
                superheroes.add("Superman");

                if (superheroes.isEmpty()) {
                        System.out.println("La coleccion esta vacia");
                } else {
                        System.out.println("La coleccion no esta vacia " + superheroes.size());
                }

                for (String superheroe : superheroes) {
                        System.out.println(superheroe);
                }

                System.out.println("--------------------------Colecciones Listas----------------------------");
                /**
                 * TODO: Colecciones Listas
                 * Permite duplicados
                 * 
                 * ArrayList => Ordenada como se añadio / no eficiente para eliminar y añadir
                 * elementos
                 * 
                 * Vector
                 */

                System.out.println("Bienvenido a la coleccion de superheroes");
                List<String> superheroesListas = new Vector<>();
                superheroesListas.add("Spiderman");
                superheroesListas.add("Batman");
                superheroesListas.add("Superman");
                superheroesListas.add("Hulk");
                superheroesListas.add("IronMan");
                superheroesListas.add("Wolverine");
                superheroesListas.add("Robin");

                if (superheroesListas.contains("Spiderman")) {
                        System.out.println("Spiderman esta en la coleccion");
                }

                System.out.println("El superheroe ebrio es: " + superheroesListas.get(0));
                superheroesListas.set(6, "Tony Stark");

                superheroesListas.remove(3);

                if (!superheroesListas.contains("Hulk")) {
                        System.out.println("Hulk no esta en la coleccion");
                }

                superheroesListas.add("Superman");
                superheroesListas.add("Superman");
                superheroesListas.add("Superman");

                if (superheroesListas.isEmpty()) {
                        System.out.println("La coleccion esta vacia");
                } else {
                        System.out.println("La coleccion no esta vacia " + superheroesListas.size());
                }

                for (String superheroe : superheroesListas) {
                        System.out.println(superheroe);
                }

                System.out.println("--------------------------Colecciones HasMap----------------------------");
                /**
                 * TODO: Colecciones HasMap
                 * Permite duplicados
                 * 
                 * HashMap => No respeta el orden de los elementos
                 * 
                 * TreeMap => Ordena alfabeticamente
                 * 
                 * LinkedHashMap => Mantiene el orden en el que se agrego a la coleccion
                 */

                System.out.println("Bienvenido a la tienda");
                Map<String, Double> inventarios = new LinkedHashMap<>();

                inventarios.put("Manzana", 10.0);
                inventarios.put("Naranja", 5.0);
                inventarios.put("Pera", 20.0);
                inventarios.put("Cebolla", 10.0);
                inventarios.put("Lima", 10.0);

                System.out.println(" Este es el inventario de la tienda ");

                // keySet arreglo de llaves
                for (String fruta : inventarios.keySet()) {
                        // con el get puedes obtener el valor
                        System.out.println(fruta + ": $" + inventarios.get(fruta));

                }

                String frutaBuscada = "Pera";
                System.out.println("Cliente nos pide la siguiente fruta => " + frutaBuscada);

                if (inventarios.containsKey(frutaBuscada)) {
                        System.out.println(frutaBuscada + " esta en la tienda");
                } else {
                        System.out.println(frutaBuscada + " no esta en la tienda");
                }

                String sinStock = "Pera";
                inventarios.remove(sinStock);
                System.out.println("No hay mas stock de " + sinStock);

                System.out.println("Inventario actualizado");

                for (String fruta : inventarios.keySet()) {
                        // con el get puedes obtener el valor
                        System.out.println(fruta + ": $" + inventarios.get(fruta));

                }

                System.out.println("Cantidad de mercancias en la tienda: " + inventarios.size());
        }
}
