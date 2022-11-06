

Los patrones de comportamiento describen interacciones entre objetos y se centran en cómo los objetos 
se comunican entre sí. Pueden reducir los diagramas de flujo complejos a simples interconexiones entre 
objetos de varias clases. Existen los siguientes patrones de comportamiento: Chain of responsibility.


 Valoracion entre 1 - 3 * segun refactoring.guru


Chain of Responsiblity [*] ---> Permite pasar solicitudes a lo largo de una cadena de manejadores. Al recibir una solicitud,  
                             cada manejador decide si la procesa o si la pasa al siguiente manejador de la cadena.


Iterator [***]---> Permite recorrer elementos de una colección sin exponer su representación subyacente (lista, pila, árbol, etc.).


Memento [*]---> Permite guardar y restaurar el estado previo de un objeto sin revelar los detalles de su implementación.


State [**] ---> Permite a un objeto alterar su comportamiento cuando su estado interno cambia. Parece como si el objeto cambiara su clase.


Template Method [**] ---> Define el esqueleto de un algoritmo en la superclase pero permite que las subclases sobrescriban pasos del algoritmo sin 
                      cambiar su estructura.


Command [***] --->  Convierte una solicitud en un objeto independiente que contiene toda la información sobre la solicitud. Esta transformación te 
                    permite  parametrizar los métodos con diferentes solicitudes, retrasar o poner en cola la ejecución de una solicitud y soportar operaciones que no se pueden realizar.


Mediator [**] --->  Permite reducir las dependencias caóticas entre objetos. El patrón restringe las comunicaciones directas entre los objetos, 
                     forzándolos a colaborar únicamente a través de un objeto mediador.


Observer [***] ---> Permite definir un mecanismo de suscripción para notificar a varios objetos sobre cualquier evento que le suceda al objeto que 
                     están observando.


Strategy [***] ---> Permite definir una familia de algoritmos, colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.


Visitor [*] ---> Permite separar algoritmos de los objetos sobre los que operan.

