package Excepciones;

public class Calculadora {

  public int dividir(int numero1, int numero2) throws CalculadoraException {
    if (numero2 == 0)
      throw new CalculadoraException("No se puede dividir por cero 1");

    return numero1 / numero2;
  }
}
