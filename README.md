


# 1. Prueba Técnica VCSOFT


# Anexo: Carga de Proyecto GITHUB

La prueba Java de VCSOFT ejecuta las preguntas de código en base a un proyecto que se entrega como facilitador que ayuda a importar el código que le puede servir de versión inicial. A continuación algunas recomendaciones sobre el software que es útil tener instalado para la prueba. No es obligatorio ninguna herramienta específica, solo Java versión actual (v 18 o al menos 11, cualquier distribución), GIT para descargar el código y un controlador de dependencias de Java (Maven o gradle). No es necesario STS ni ninguna versión de otro IDE específico. Es solo Java, aunque utilizar un IDE siempre es un acelerador del trabajo de desarrollo.  Nuestra sugerencia es que utilice un IDE que conozca. 

Se espera que todo candidato sepa compilar, ejecutar y hacer debug de un proyecto Java, así como también se espera que sepa utilizar GIT para descargar un proyecto en Github.


### Precondiciones



* Tener instalada una máquina virtual Java 11 JDK o superior. Cualquier distribución es válida pero si se requiere Java 11 o superior.
* Tener instalado y configurado GIT
* Algun controlador de dependencias Maven o Gradle


### Procedimiento

La forma más simple de cargar el proyecto es usar GIT. 
Los siguientes comandos hacen clone del proyecto y ejecutan spring-boot:


```
git clone https://github.com/jaimevale/gs-rest-service.git
cd gs-rest-service/complete
mvn spring-boot:run

```







O si quiere primero compilar `./mvnw compile `

Maven se ajusta invocando el wrapper que se indica anteriormente. Maven descarga también las dependencias necesarias.  Para más información de ejecución de un proyecto maven ver https://spring.io/guides/gs/maven/

Puede usar cualquier editor de texto sobre el directorio, sin embargo se recomienda algún IDE Java o al menos Visual Studio Code que le pueda ayudar con la sintaxis Java.


### Uso de IDE


#### La prueba no implica uso de ningún IDE en concreto. El uso de algún IDE es un facilitador para el candidato. Si Ud. no sabe usar bien su IDE (integrated development environment) es posible que no tenga suficiente tiempo dentro de la prueba para aprender a utilizarlo. En ese caso se recomienda compilar por línea de comando y editar con algún editor como Visual Studio Code que le facilite la sintaxis java. Sinceramente se espera que toda persona que presente la prueba sepa como usar el IDE de elección (Idea, Eclipse/STS, netbeans, etc)  pero si no logra resolver problemas de carga del proyecto por favor enfoque su tiempo en resolver los algoritmos y problemas planteados no en aprender a usar ningún editor nuevo.

Si se quiere usar Eclipse como IDE se puede abrir el proyecto como Proyecto Maven: Import 