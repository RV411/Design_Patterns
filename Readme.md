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

> ## Singleton

> ### Se Implementa en:
> - Una base de datos
> - Un API
> - Un servicio (AWS)


> ## Decorator
- Trabaja como la subclase
> ### Se Implementa en:
> - 


> ## Mediator
- Patron de comportamiento, define como se comporta la aplicacion
- objeto intermediario que comunica a otros objetos 
- (**Observador** modifica al objeto que tiene que escuchar)

> ### Se Implementa en:
> - Redux


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


> # Acceso a Datos


> # Observabilidad


> # Servicios Externos



