



Patrones de creación (o creacionales). Definen cómo puede crearse un objeto. 
Habitualmente esto incluye aislar los detalles de la creación del objeto, de forma que su código 
no dependa de los tipos de objeto que hay y, por lo tanto, no deba se modificado al añadir un nuevo tipo de objeto.



 Valoracion entre 1 - 3 * segun refactoring.guru


Abstract Factory [***] --> Permite producir familias de objetos relacionados sin especificar sus clases concretas.

Builder [***] --> Permite construir objetos complejos paso a paso. Este patrón nos permite producir distintos tipos y representaciones de un objeto 
                  empleando el mismo código de construcción.


Factory Method [***] --> Proporciona una interfaz para la creación de objetos en una superclase, mientras permite a las subclases alterar el tipo de 
                          objetos que se crearán.


Prototype [**] --> Permite copiar objetos existentes sin que el código dependa de sus clases.


Singleton [**]--> Permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso 
                   global a dicha instancia.
