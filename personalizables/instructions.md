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




## ✏️ Actividad: Localización por etiqueta + clase

El uso de la etiqueta y la clase CSS es otra forma de localizar elementos específicos dentro de una página web.

Para localizar por etiqueta + clase un elemento usando Selenium WebDriver en Java, puedes hacerlo de la siguiente manera:

WebElement nombreVariable = tuInstanciaDriver.findElement(By.cssSelector("tag.class"));

💡Es decir, se concatena tag y clase con .

Al ejecutar el programa, asegúrate de que el navegador se abra automáticamente y se realicen las operaciones programadas.

Modifica el script anterior para que de forma automática:

Después de escribir en el cuadro de búsqueda, navegue hacia la página de TiendaMia (elige la URL correspondiente a tu país).

Maximice la ventana del navegador.

Localiza el primer enlace en la barra de navegación en la página de inicio de TiendaMia que diga “Ofertas de la semana” usando el método findElement con el selector CSS de etiqueta + clase.

Haz clic en el enlace encontrado utilizando el método click.

Al ejecutar el programa, asegúrate de que:

El navegador se abre automáticamente.

Las operaciones programadas se realizan correctamente.

💡 Consejo: Si la clase de un elemento es única, esta es una forma eficiente de localizarlo. Si es necesario, usa partialLinkText o linkText para enlaces de texto dinámico


## ✏️ Actividad: Localización por etiqueta + atributo

Para localizar por etiqueta + atributo un elemento usando Selenium WebDriver en Java, puedes hacerlo de la siguiente manera:

WebElement nombreVariable = tuInstanciaDriver.findElement(By.cssSelector("tag[nombreAtributo=valorAtributo]"));

💡Es decir, se concatena tag con atributo + valor entre []

Modifica el script anterior para que de forma automática:

Luego de hacer clic en “Ofertas de la semana”, navegue hacia Google.

Localiza el botón "Acceder" en la página de inicio de GMAIL utilizando el atributo target en el selector CSS.

Usa el método findElement para localizarlo y click para hacer clic en él.

Al ejecutar el programa, asegúrate de que:

El navegador se abre automáticamente.

Las operaciones programadas se realizan correctamente.

💡 Consejo: Cuando utilices un atributo específico de un elemento, como target, asegúrate de que su valor sea único para evitar errores en la localización


## Actividad: Localización por etiqueta + clase + atributo

Para localizar por etiqueta + clase + atributo un elemento usando Selenium WebDriver en Java, puedes hacerlo de la siguiente manera:

WebElement nombreVariable = tuInstanciaDriver.findElement(By.cssSelector("tag.class[nombreAtributo=valorAtributo]"));

Modifica el script anterior para que de forma automática, luego de dar clic en el login, navegue hacia LinkedIn .

Localiza el campo de contraseña en la página de inicio de LinkedIn utilizando una combinación de etiqueta, clase y atributo (en este caso, el atributo autocomplete), y luego escribe el texto "hello" (usando los métodos findElement y sendKeys).

Al ejecutar el programa, asegúrate de que el navegador se abre automáticamente y realiza las operaciones según lo programado.
