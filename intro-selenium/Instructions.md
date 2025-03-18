## Actividad: Abrir el navegador

Para abrir una URL usando Selenium WebDriver en Java, puedes hacerlo de la siguiente manera: tuInstanciaDriver.get(urlDeDestino);

  1. Crea una instancia del WebDriver que utilizarás.
  2. Usa el método get de la instancia del WebDriver para 
     abrir el navegador y redirigirlo automáticamente a la URL deseada:
  3. Al ejecutar el programa, asegúrate de que el navegador se abra automáticamente 
     y se dirija a la página indicada.
  4. Recuerda cerrar el navegador una vez que hayas completado las acciones previstas 
     en tu script:
     
     
## Actividad: Navegar hacia otras páginas

  1. Modifica el script anterior para que, después de abrir Google, se navegue automáticamente hacia “https://openai.com/”, y luego 
     se redirija a “https://github.com/” utilizando el método navigate().
  2. Al ejecutar el programa, asegúrate de que el navegador se abra y se dirija de 
     forma automática a las páginas indicadas.
  3. Recuerda cerrar el navegador una vez que hayas completado las acciones previstas en tu script:
  
  
## Actividad: MInimizar y Maximizar la ventana del navegador

  1. Modifica el script anterior para que, de manera automática, después de abrir Google, 
     la ventana se minimice (usando el método minimize()), y luego, al navegar hacia 
     “https://openai.com/”, se maximice el navegador (usando el método maximize()).  
  2. Al ejecutar el programa, asegúrate de que el navegador se abra automáticamente y se 
     realicen las acciones programadas de manera secuencial.  
  3. Recuerda cerrar el navegador una vez que hayas completado las acciones previstas en tu script:
  
  
## Actividad: Retroceder y avanzar en el navegador

  1. Modifica el script anterior para que, de forma automática, el navegador inicie en Google, 
     luego navegue hacia GitHub, y posteriormente, realice una navegación “hacia atrás” 
     (usando el método back()) y luego “hacia adelante” (usando el método forward()).  
  2. Al ejecutar el programa, asegúrate de que el navegador se abra automáticamente y se 
     realicen las acciones de navegación según lo previsto.  
  3. Recuerda cerrar el navegador una vez completadas las acciones del script:
  
## ACTIVIDAD INTEGRADORA

En esta actividad, vas a combinar varios de los conceptos que has cubierto hasta ahora: 
la apertura de un navegador, la navegación a varias páginas web, la manipulación del tamaño 
y la posición de la ventana del navegador y la navegación hacia atrás y hacia delante en el 
historial del navegador. 

  1. Genera un nuevo proyecto Maven llamado desafio1.
  2. Define un script que realice las siguientes operaciones:. 
  3. Abrir el navegador y navegar a la página de inicio de Google.
  4. Maximizar la ventana del navegador para tener una vista completa de los elementos en la página.
  5. Navegar a la página de inicio de OpenAI.
  6. Reducir la ventana del navegador a la mitad de su tamaño y centrarla en la pantalla.
  7. Navegar a la página de inicio de Wikipedia. 
  8. Cambiar el tamaño de la ventana del navegador a su tamaño original.
  9. Cerrar el navegador.

Al ejecutar el programa, asegúrate de que el navegador se abra automáticamente, se realicen 
las operaciones programadas y, finalmente, que se cierre adecuadamente