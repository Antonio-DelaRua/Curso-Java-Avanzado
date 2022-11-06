Los patrones estructurales explican cómo ensamblar objetos y clases en estructuras más grandes,
a la vez que se mantiene la flexibilidad y eficiencia de estas estructuras. Permite la colaboración 
entre objetos con interfaces incompatibles.



 Valoracion entre 1 - 3 * segun refactoring.guru


adapter [***]--> Permite la colaboración entre objetos con interfaces incompatibles.


bridge [*] -->Permite dividir una clase grande o un grupo de clases estrechamente relacionadas, en dos jerarquías separadas (abstracción e       
              implementación) que pueden desarrollarse independientemente la una de la otra.


composite [**] --> Permite componer objetos en estructuras de árbol y trabajar con esas estructuras como si fueran objetos individuales.


decorator [**] --> Permite añadir funcionalidades a objetos colocando estos objetos dentro de objetos encapsuladores especiales que contienen   
                    estas funcionalidades.



facade [**] --> Proporciona una interfaz simplificada a una biblioteca, un framework o cualquier otro grupo complejo de clases.



flyweight [*] --> Permite mantener más objetos dentro de la cantidad disponible de memoria RAM compartiendo las partes comunes del estado entre 
                  varios objetos en lugar de mantener toda la información en cada objeto



proxy [*]    --> Permite proporcionar un sustituto o marcador de posición para otro objeto. Un proxy controla el acceso al objeto original, 
                  permitiéndote hacer algo antes o después de que la solicitud llegue al objeto original.