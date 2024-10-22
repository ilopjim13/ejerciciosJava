package org.example;

public class Main {
    public static void main(String[] args) {

        ejercicio2();
        ejercicio4();
    }

    //Ejercicio 2: Uso de if y operadores ternarios
    //Vamos a ver cómo traducir el operador ternario en Java a Kotlin, ya que Kotlin no tiene un
    //operador ternario explícito.
    //Explica cómo funciona la estructura if en Kotlin en comparación con el operador ternario en
    //Java.
    //Kotlin:
    //fun main() {
    //  val energia = 80
    //  val estado = if (energia > 50) "Personaje fuerte" else "Personaje débil"
    //  println(estado)
    //}
    public static void ejercicio2() {
        int energia = 80;
        String estado = "Personaje debil";
        if (energia > 50) {
            estado = "Personaje fuerte";
        }
        System.out.println(estado);
    }


    //Ejercicio 4: Control de flujo con break y continue
    //Aquí veremos cómo usar break y continue en Kotlin y compararlo con su equivalente en
    //Java.
    //Explica la diferencia en cómo Kotlin maneja rangos y control de flujo frente a Java.
    //Kotlin:
    //fun main() {
    //  for (i in 1..5) {
    //      if (i == 3) {
    //          continue // Salta la iteración cuando i es 3
    //      }
    //  println("Número: $i")
    //  }
    //}
    public static void ejercicio4() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Numero:" + i);
        }
    }
}

