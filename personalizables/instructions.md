## ✏️ Actividad: Configuración del script

En la carpeta de trabajo del módulo, crea un proyecto de Maven llamado personalizables.

Realiza las importaciones que creas convenientes.

Define un script de selenium que configure la ruta del driver (método setProperty) 
y que abra el navegador en Google con la ventana maximizada.

Al ejecutar el programa, asegúrate de que el navegador se abra automáticamente y 
se realicen las operaciones programadas.


## ✏️ Actividad: Localización por etiqueta + id

El uso de la etiqueta y el atributo id es fundamental para localizar elementos específicos 
dentro de una página web.

Para localizar por etiqueta + id un elemento usando Selenium WebDriver en Java, 
puedes hacerlo de la siguiente manera:

WebElement nombreVariable = tuInstanciaDriver.findElement(By.cssSelector("tag#id"));

💡Es decir, se concatena tag e id con #.

Analiza la interfaz de Google e identifica el cuadro de búsqueda con el atributo id.

Modifica el script anterior para que, de forma automática:

Navegue a la página de Google.

Localice el cuadro de búsqueda utilizando el método findElement con el selector CSS 
de etiqueta + id.

Luego, escribe el texto "hello world" en el cuadro de búsqueda usando el método sendKeys.

Al ejecutar el programa, asegúrate de que:

El navegador se abre automáticamente.

La búsqueda se realiza correctamente.

💡 Consejo: Si el atributo id es único, esta es una forma eficiente de localizar elementos. 
Asegúrate de que el valor del id sea correcto y que no haya cambios dinámicos en la página.