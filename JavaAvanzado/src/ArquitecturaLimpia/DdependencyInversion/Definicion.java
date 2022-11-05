package ArquitecturaLimpia.DdependencyInversion;

public class Definicion {
}

/**
 * @Definicion
 * Este principio es una técnica básica, y será el que más presente tengas en tu día a día si quieres hacer que tu
 * código sea testable y mantenible.
 *
 * Gracias al principio de inversión de dependencias, podemos hacer que el código que es el núcleo de nuestra
 * aplicación no dependa de los detalles de implementación, como pueden ser el framework que utilices,
 * la base de datos, cómo te conectes a tu servidor…
 *
 * Todos estos aspectos se especificarán mediante interfaces, y el núcleo no tendrá que conocer cuál es
 * la implementación real para funcionar.
 *
 * La definición que se suele dar es:
 *
 * A. Las clases de alto nivel no deberían depender de las clases de bajo nivel. Ambas deberían depender de
 * las abstracciones.
 *
 * B. Las abstracciones no deberían depender de los detalles. Los detalles deberían depender de las abstracciones.
 *
 *
 * @ejemplo
 *
 *
interface Persistence {
fun save(shopping: Shopping?)
}

class SqlDatabase : Persistence {
override fun save(shopping: Shopping?) {
// Saves data in SQL database
}
}

interface PaymentMethod {
fun pay(shopping: Shopping?)
}

class CreditCard : PaymentMethod {
override fun pay(shopping: Shopping?) {
// Performs payment using a credit card
}
}

class ShoppingBasket(
private val persistence: Persistence,
private val paymentMethod: PaymentMethod
) {
fun buy(shopping: Shopping?) {
persistence.save(shopping)
paymentMethod.pay(shopping)
}
}

class Server : Persistence {
override fun save(shopping: Shopping?) {
// Saves data in a server
}
}
class Paypal : PaymentMethod {
override fun pay(shopping: Shopping?) {
// Performs payment using Paypal account
}
}
 */