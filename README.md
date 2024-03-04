# Aproximación Recursiva de Pi con Montecarlo
## Índice
  1. [Introducción](#introducción)
  2. [Manual de Instalación](#manual-de-instalación)
  3. [Manual de Uso](#manual-de-uso)
  4. [Licencia](#licencia)
 
## Introducción
Este es el programa de aproximación recursiva al número PI mediante el método Montecarlo, realizado en la Universidad CEU San Pablo por Jorge González Fernández. 
Este porgrama ha sido programado en Java, y utiliza la generación de puntos aleatorios de forma recursiva para estimar el valor del número PI. La lógica detras de este método se basa en la relación entre un cuarto del área de un círculo y el área del cuadrado que contiene a este.
 
 
## Manual de Instalación
Siga los siguientes pasos para **instalar** y ejecutar el programa:
 
### 1. Descargue el código fuente:
En primer lugar, **clone** el repositorio desde GitHub a su máquina local usando Git:
 
      git clone https://github.com/jorgeegonzaalez/progra2-p2.git
 
### 2. Acceda al directorio del proyecto:
 
Tras la descargar, navegue al directorio donde se encuentra alojado el proyecto:
 
    cd progra2-p2
 
### 3. Compile el código fuente
Compile el **código fuente** usando el comando indicado a continuación. Esto asegurará que los archivos .class se generen en el directorio bin/:
 
    make compilar
 
### 4. Cree el archivo .jar
Cree un **archivo ejecutable JAR** para facilitar así la ejecución del programa:
 
     make jar
 
### 5. Cree el javadoc
Si desea generar un documento Javadoc para el código, puedes hacerlo con el siguiente comando:
 
 
    make javadoc
 
Esto **generará archivos de documentación** en el directorio html/.
 
## Manual de Uso
 
A continuación se indican y describen las distintas funcionalidades que puede realizar el programa.
 
### 1. **Generar una Aproximación de Pi:**
 
Para obtener una estimación de PI, debe ejecutar el siguiente comando en la línea de comandos:
 
    java -jar pi.jar <numero_de_pasos>
 
## Un ejemplo usando 100 pasos
 
    java -jar pi.jar 100
 
El **resultado** que devolvería la aplicacion sería el siguiente:
 
    El numero PI es 3.24
   
 
## Licencia
**Copyright** [2023] [jorgeegonzaalez]


