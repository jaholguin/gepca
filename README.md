# GEPCA

***Notas Jorge Andrés Holguín Medina:***

* El primer paso es importar la base de datos MySQL, el script se encuentra en la ruta \\gepca\dist\bds_gepca.sql
* Una vez importada la base de datos, en la misma ruta \\gepca\dist\ se ejecuta el .jar con nombre "gepca.jar" con doble clic o por linea de comandos con el comando java -jar "gepca.jar" 
* Los usuarios por defecto son admin para Coordinador, intructor y academico, todos tienen la misma contraseña "admin123" y se encuentra por defecto al iniciar el programa en el formulario de login


When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "gepca.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest,the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.
