

# 1. Prueba Técnica VCSOFT

Versión Java



# Anexo: Carga de Proyecto GITHUB

La prueba Java de VCSOFT ejecuta las preguntas de código en base a un proyecto que se entrega como facilitador, este proyecto ayuda a importar el código que le puede servir de versión inicial sobre el que se debe trabajar en la prueba. A continuación algunas recomendaciones sobre el software que es útil tener instalado para la prueba. 

Se deben tener instaladas las siguientes herramientas, si es difícil para usted lograr este ambiente siga las instrucciones de “Desarrollo en ambiente remoto” más adelante.



* Un JDK Java versión 19 o al menos 17, cualquier distribución, 
* GIT para descargar el código
* Un controlador de dependencias de Java (Maven o Gradle). Tradicionalmente los IDE ya incluyen este componente internamente.

No es obligatorio ninguna Integrated Development Environment (IDE) específica (no es necesario que sea Eclipse o STS, o Intellij Idea, etc) utilice el IDE con el que esté más familiarizado.

Se espera que todo candidato sepa **compilar, ejecutar y hacer debug de un proyecto Java**, así como también se espera que sepa utilizar GIT para descargar un proyecto desde Github.


## Procedimientos posibles 


## Carga manual a directorio local

Una forma simple para trabajar con el proyecto base es cargar el proyecto en directorio local usando GIT, para esto se puede utilizar el siguiente comando

 


```
git clone https://github.com/<nombre usuario>/<nombre proyecto>.git
```


Por ejemplo puede probar con [https://github.com/spring-guides/gs-rest-service.git](https://github.com/spring-guides/gs-rest-service.git) 

Localizar el directorio de proyecto (en el ejemplo es el directorio “complete”, donde está el archivo pom.xml) y ejecutar el comando 


```
./mvnw spring-boot:run

```


Puede usar cualquier editor de texto sobre el directorio, sin embargo se recomienda algún IDE Java o al menos Visual Studio Code que le pueda ayudar con la sintaxis Java.


## Desarrollo en ambiente remoto

Si usted no tiene un computador con los requisitos indicados de JVM, GIT y Maven puede intentar con CodeSpace en GITHUB. Para esto tiene que contar con una cuenta en github y crear un codespace a su nombre dando click en el botón de “Create codespace on main”, con esto se abre un Visual Studio Code en Browser y puede realizar el desarrollo en ese ambiente:

Puede probar con [https://github.com/spring-guides/gs-rest-service.git](https://github.com/spring-guides/gs-rest-service.git), pero se recomienda apagar y borrar este ambiente de pruebas antes de la prueba para que al momento de la prueba solo tenga un ambiente (y no superar las horas free de github para codespace)




![alt_text](images/image8.png "image_tooltip")


Como se requiere Java version 17 o superior se debe actualizar la versión de la JVM ejecutando el comando 


```
    sdk install java 19.0.1-open
    (aceptar cambio "Y")
    Cambiar al directorio "complete" y ejecutar 
```



    




![alt_text](images/image9.png "image_tooltip")



```
    Al finalizar de ejecutar se debe mostrar un puerto activo:
```



    


![alt_text](images/image10.png "image_tooltip")




También lo puede consultar por el icono en el borde inferior de la ventana:




![alt_text](images/image11.png "image_tooltip")



    Abra el puerto y adicione el PATH, en este caso el servicio REST se ofrece en /greeting:


## Uso de IDE local


La prueba no implica uso de ningún IDE en concreto. El uso de algún IDE es un facilitador para el candidato. Si Ud. no sabe usar bien su IDE (integrated development environment) es posible que no tenga suficiente tiempo dentro de la prueba para aprender a utilizarlo. En ese caso se recomienda compilar por línea de comando y editar con algún editor como Visual Studio Code que le facilite la sintaxis java. Sinceramente se espera que toda persona que presente la prueba sepa como usar el IDE de elección (Idea, Eclipse/STS, netbeans, etc)  pero si no logra resolver problemas de carga del proyecto por favor enfoque su tiempo en resolver los algoritmos y problemas planteados no en aprender a usar ningún editor nuevo.

Si se quiere usar Eclipse como IDE se puede abrir el proyecto como Proyecto Maven: Import Projects from File System. Define el directorio donde se encuentra el pom.xml:



![alt_text](images/image13.png "image_tooltip")

![alt_text](images/image14.png "image_tooltip")


Puede refrescar el proyecto también por esta opción:

![alt_text](images/image15.png "image_tooltip")


También al tener el proyecto en el IDE se le puede indicar que es un proyecto Maven o proyecto Gradle.

Si se quiere utilizar IntelliJ IDEA, se puede cargar directamente desde el URL del GIT: 

![alt_text](images/image16.png "image_tooltip")


Se adiciona el proyecto como Maven, luego de esto se abre el widget de Maven y se selecciona `spring-boot:run`




![alt_text](images/image17.png "image_tooltip")

![alt_text](images/image18.png "image_tooltip")

![alt_text](images/image19.png "image_tooltip")

