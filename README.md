# AREP-LAB01
Elaborado por Johan Guerrero

# Ejecucion de la aplicación

- 	Primero nos movemos a la raíz del directorio del proyecto
- 	Limpiamos e instalamos dependencias con *mvn clean install*
- 	Por línea de comandos compilamos la aplicación con el comando *mvn package*
- 	Ejecutamos la clase calculator con el comando *java -cp target/AREP-LAB01-1.0-SNAPSHOT.jar edu.escuelaing.arep.Calculator*

Recuerde que por defecto está ejecutando la prueba2 si desea cambiarla vaya al directorio de calculator y cambie el path del archivo

# Documentación

-	Puede generar la documentación ejecutando el siguiente comando *mvn javadoc:javadoc*
-	Dirigase a la carpeta target/site/apidocs para encontrar la documentación

# Ejecucion de pruebas unitarias

-	Puede ejecutar las pruebas con el comando *mvn test*

