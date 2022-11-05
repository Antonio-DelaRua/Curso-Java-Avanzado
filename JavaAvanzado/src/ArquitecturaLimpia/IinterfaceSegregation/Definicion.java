package ArquitecturaLimpia.IinterfaceSegregation;

/**
 * otra vez crea cosas con errores -.- no pierde 1 min para arreglarlo *-*
 */
public class Definicion {
}

/**
 *
 * ISP – Principio de Segregación de Interfaces
 * Principio de Segregación de Interfaces (Interface Segregation Principle, ISP), trata sobre las desventajas
 * de las interfaces "pesadas", y guarda una estrecha relación con el nivel de cohesión de las aplicaciones.
 *
 * Básicamente lo que nos quiere decir este principio es que "las clases que implementen una interfaz o una
 * clase abstracta no deberían estar obligadas a utilizar partes que no van a utilizar".
 *
 * Otras definiciones de este principio son:
 *
 * La implementación de las abstracciones debe estar en la medida de lo posible en interfaces y no en clases.
 * Los clientes no deben estar obligados a implementar y/o a depender de una interface que luego no usarán.
 * Es mejor tener interfaces específicos para cada cliente que uno de propósito general, o lo que es lo mismo,
 * no deberíamos obligar a los clientes a depender de métodos que no utilizan.
 *
 * Ejemplo
 *
 * // Interfaz que deben cumplir los trabajos que
 * // se realicen de forma manual
 * public interface IManual
 * {
 *     void Suspender();
 *     void Reiniciar();
 * }
 *
 * // Clase Base que contiene la plantilla, los metodos
 * // que deben implementar todas las clases
 * // que representen a un proceso
 * public abstract class Proceso
 * {
 *     public abstract void Iniciar();
 *     public abstract void Finalizar();
 * }
 *
 *
 * // Clase que hereda de la clase base [Proceso]
 * // Observa el modificador [override]
 * // y que implementa la interfaz [IManual]
 * public class ProcesoManual : Proceso, IManual
 * {
 *     public override void Iniciar() { Console.WriteLine("Proceso Manual 1 -> Iniciar"); }
 *     public void Suspender() { Console.WriteLine("Proceso Manual 1 -> Suspender"); }
 *     public void Reiniciar() { Console.WriteLine("Proceso Manual 1 -> Reiniciar"); }
 *     public override void Finalizar()
 *     {
 *         Console.WriteLine("Proceso Manual 1 -> Finalizar");
 *     }
 * }
 *
 *
 * // Clase que hereda de la clase base [Proceso]
 * // Observa el modificador [override]
 * public class ProcesoAutomaizado : Proceso
 * {
 *     public override void Iniciar()
 *     {
 *         Console.WriteLine("Proceso Automatizado 1 -> Iniciar");
 *     }
 *     public override void Finalizar()
 *     {
 *         Console.WriteLine("Proceso Automatizado 1 -> Finalizar");
 *     }
 * }
 *
 * Segunda solución mejor que la primera
 *
 * //----------------------------------
 * // Interfaz que deben cumplir los trabajos que
 * // se realicen de forma manual (por personas)
 * public interface IManual
 * {
 *     void Suspender();
 *     void Reiniciar();
 * }
 *
 * //----------------------------------
 * // Interfaz que debe cumplir CUALQUIER TIPO de trabajo
 * public interface IProceso
 * {
 *     void Iniciar();
 *     void Finalizar();
 * }
 *
 *
 * //----------------------------------
 * // Clase que representa a un proceso realizado por personas
 * // Implementa la interfaz [IProceso] correspondiente a cualquier proceso
 * // e implementa la interfaz [IManual] procesos realizados por personas
 * public class ProcesoManual : IProceso, IManual
 * {
 *     public void Iniciar()   { Console.WriteLine("Proceso Manual 2 -> Iniciar");   }
 *     public void Suspender() { Console.WriteLine("Proceso Manual 2 -> Suspender"); }
 *     public void Reiniciar() { Console.WriteLine("Proceso Manual 2 -> Reiniciar"); }
 *     public void Finalizar() { Console.WriteLine("Proceso Manual 2 -> Finalizar"); }
 * }
 *
 *
 * //----------------------------------
 * // Clase que representa a un proceso realizado por maquinas
 * // Implementa la interfaz [IProceso] correspondiente a cualquier proceso
 * public class ProcesoAutomatizado : IProceso
 * {
 *     public void Iniciar()   { Console.WriteLine("Proceso Automatizado 2 -> Iniciar");   }
 *     public void Finalizar() { Console.WriteLine("Proceso Automatizado 2 -> Finalizar"); }
 * }
 *
 *
 * //----------------------------------
 * // Una clase para manejar procesos
 * public class GerenteProcesos
 * {
 *     // Campo de la clase que guarda la referencia a la interfaz [IProceso]
 *     // Este valor se tiene que proporcionar a través del constructor
 *     // La palabra clave readonly corresponde a un modificador que
 *     // se puede utilizar en campos.
 *     // Cuando una declaración de campo incluye un modificador readonly,
 *     // las asignaciones a los campos que aparecen en la declaración
 *     // sólo pueden tener lugar en la propia declaración o
 *     // en un constructor de la misma clase.
 *     private readonly IProceso unProceso;
 *
 *     // Constructor
 *     public GerenteProcesos(IProceso w)
 *     {
 *         unProceso = w;
 *     }
 *
 *     // propiedad para leer el proceso que está almacenado en la clase
 *     public IProceso Proceso
 *     {
 *         get
 *         {
 *             return unProceso;
 *         }
 *     }
 *
 *     // Poner en ejecución el proceso
 *     public void Gestionar()
 *     {
 *         unProceso.Iniciar();
 *         //unProceso.Suspender(); // provoca un error
 *         //unProceso.Reiniciar(); // provoca un error
 *         unProceso.Finalizar();
 *
 *     }
 * }
 *
 *
 * //----------------------------------
 * // Clase para probar las clases anteriores
 * public class Test
 * {
 *     public void TestGerente()
 *     {
 *         ProcesoManual PM1 = new ProcesoManual();
 *         ProcesoAutomatizado PA1 = new ProcesoAutomatizado();
 *
 *         GerenteProcesos GP1 = new GerenteProcesos(PM1);
 *         GP1.Gestionar();
 *
 *         GerenteProcesos GP2 = new GerenteProcesos(PA1);
 *         GP2.Gestionar();
 *     }
 * }
 *
 */