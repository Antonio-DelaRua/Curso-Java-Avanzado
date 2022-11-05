package ArquitecturaLimpia.Llistkov;

public class Definicion {
}

/**
 * @definicion
 *El principio de sustitución de Liskov nos dice que si en alguna parte de nuestro código estamos usando una clase,
 * y esta clase es extendida, tenemos que poder utilizar cualquiera de las
 * clases hijas y que el programa siga siendo válido.
 *
 */

/**
  @ejemplo
  En la vida real tenemos claro que un elefante es un animal. Imaginemos que tenemos la clase Animal que representa
  un animal, y les damos a los animales la propiedad de andar y saltar:
   open class Animal {
      open fun walk() { ... }
      open fun jump() { ... }
  }
  Y tenemos una parte del código donde recibimos un animal, y necesitamos que el animal salte:

  fun jumpHole(a: Animal){
      a.walk()
      a.jump()
      a.walk()
  }

  Ahora nos creamos un elefante. Pero claro, un elefante no puede saltar, así que decidimos lanzar una excepción
  para asegurarnos de detectarlos si esto ocurre:
  class Elephant : Animal() {
      override fun jump() =
          throw Exception("Los elefantes no pueden saltar")
  }
     ¿Cómo lo solucionamos?

  open class Animal {
      open fun walk() {  }
  }
  open class LightweightAnimal : Animal() {
      open fun jump() {  }
  }
  Esto nos permite definir animales que sí pueden saltar y otros que no. Por ejemplo un perro y un elefante:

   class Dog: LightweightAnimal()
   class Elephant: Animal()

  Y la función de jumpHole() solo admitiría animales que pueden saltar:

  fun jumpHole(a: LightweightAnimal){
  a.walk()
  a.jump()
  a.walk()
  }
 * @see https://devexperto.com/principio-de-sustitucion-de-liskov/
 */