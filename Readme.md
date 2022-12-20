#
# SOLID
#

> # Single Responsability
> Cada clase tiene sus funciones especificas
> # Open Closed
> No se modifica una clase, se hereda en otra y se elabora nuevo código
> # Liskov Substitution
> Saber utilizar herencia o interfazes
> # Interface Segregation
> Separar las interfaces orientadas a las funciones necesarias en interfaces. Por medio de clases pequeñas y especificas
> # Dependency Inversion
> Las implementaciones deben depender de interfaces

#
# Mas utilizados
#

## CREATIONAL

> ## SINGLETON

> ### Se Implementa en:
> - Una base de datos
> - Un API
> - Un servicio (AWS)

> ## PROTOTYPE

> ### Se Implementa en:



> ## BUILDER

> ### Se Implementa en:



> ## FACTORY

> ### Se Implementa en:




## STRUCTURAL

> ## FACADE

> ### Se Implementa en:



> ## PROXY

> ### Se Implementa en:



## BEHAVIORAL

> ## ITERATOR

> ### Se Implementa en:



> ## OBSERVER

> ### Se Implementa en:




> ## Mediator
- Patron de comportamiento, define como se comporta la aplicacion
- objeto intermediario que comunica a otros objetos 
- (**Observador** modifica al objeto que tiene que escuchar)
> ### Se Implementa en:
> - Redux

 
> ## STATE

> ### Se Implementa en:


> ## Strategy
Enables you to define a group (or family) of closely-related algorithms **(known as strategies)**. 
This allows you to swap strategies in and out for each other as needed at runtime.

> ## Decorator
- Trabaja como la subclase
> ### Se Implementa en:
> - 

> ## Adapter
- Permite trabajar a objetos que no tienen interfaces con interfaces


> ## MVC
> ### Se Implementa en:
> - UI


> ## Flux
- Forma de ciclo




#
# Utilizados en Microservicios
#

> # Descomposicion
- Subdominios ( Enfoque DDD ) monilitico
- Estrangulacion. - monolitico -> micro
- Bulkhead. - monolitico -> micro

> # Infraestructura
- Configuración Centralizada. configuracion del micro.
- Service Discovery. Escalabilidad de nodos.
- Load Balancing. Balanceo de dependencias. Varias estrategias (Ruond Robin, etc.)
- Reintentos ( Retry ) Resistencia del servicio cuando se cae para intentarlo de nuevo
- Circuit Breaker. Cierra el ciclo de reintentos y lo vuelve a abrir cuando es necesario
- Azul/Verde. Para pruebas y produccion. Para cuando una tarea falla, levantar otra en paralelo.

> # Integración
- API Gateway. Centralizacion y Unico punto de acceso a toda la infraestructura.
- Publicador/Subscriptor. Aplicaciones subscritas a eventos, y Eventos publican.
- Coreografia/Orquestación. Controla pequeños servicios.
- Saga. Manejo de transacciones entre servicios. (Ctrl Z ) Deshacer cambios cuando un microservicio no esta preparado.

> # Acceso a Datos
- Index Table. Parecido a SQL
- Shard. Escalabilidad de datos. Horizontal y Vertical.
- Base de datos por servicio. Escalabilidad de datos. Cada microservicio dueño de sus propios datos.
- CQRS. Separar operacion Lectura/Escritura para rapidez.

> # Observabilidad
- Agregación de logs. Reune a todos los log de los microservicios.
- Monitoreo de punto final. (Endpoint) Monitorear el microservicio, si esta activo.
- metricas de rendimiento. Metricas KPI para evaluar el negocio.
- Traceo distribuido. Sigue la ruta de un request en el microservicio (tiempo, que servicios utilizo, etc)

> # Servicios Externos
- Backend por Frontend. Para cada frontend un backend
- Capa anticorrupcion. Nos dice como hay que conectarse con servicios de terceros para evitar que corrompan nuestros microservicios internos.



