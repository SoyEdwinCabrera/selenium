## ✏️  Actividad: Configuración del script

  1. En la carpeta de trabajo del módulo, crea un proyecto de maven llamado localizadores.
  2. Incorpora la dependencia Selenium a tu archivo pom.
  3. Realiza las importaciones que creas convenientes.
  4. Define un script de selenium que configure la ruta del driver (método setProperty) 
     y que abra el navegador en Wikipedia con la ventana maximizada.
  5. Al ejecutar el programa, asegúrate de que el navegador se abra automáticamente y se 
     realicen las operaciones programadas. 
  6. Cierra el navegador


## ✏️  Actividad: Localización por id

El ID es el localizador más específico y confiable en Selenium, ya que su valor debe ser único 
en toda la página. Usarlo permite encontrar elementos de forma rápida y eficiente.

Para localizar por id un elemento usando Selenium WebDriver en Java, puedes hacerlo de la siguiente manera:
WebElement nombreVariable = tuInstanciaDriver.findElement(By.id("idDelElemento"));


1. Explora Wikipedia e identifica tres elementos con el atributo id.
2. Modifica el script anterior para que, de forma automática:
    Navegue a Wikipedia.
    Realice clic en los elementos identificados.
    (Opcional) Utiliza la función de retroceso en el navegador.
3. Ejecuta el programa y verifica que:
    Se abre el navegador automáticamente.
    Se realicen correctamente las operaciones programadas.
4. Finaliza cerrando el navegador.

💡 Consejo: Identificar correctamente los elementos desde el principio facilita la automatización y 
mejora la estabilidad de tus pruebas.


## ✏️  Actividad: Localización por name

El atributo name se usa comúnmente en campos de formulario. Aunque no siempre es único, es una opción 
válida para localizar elementos cuando los IDs no están disponibles.

Para localizar por name un elemento usando Selenium WebDriver en Java, puedes hacerlo de la siguiente manera:
WebElement nombreVariable = tuInstanciaDriver.findElement(By.name("nameDelElemento"));

  1. Modifica el script anterior para que, de forma automática:
      Haga clic en uno de los elementos localizados por Name.
      Navegue a GitHub.
      Localice un campo de entrada de texto por Name.
      Escriba un texto en el campo localizado (usando sendKeys).
  2. Ejecuta el programa y verifica que:
      Se abre el navegador automáticamente.
      Se realicen correctamente las operaciones programadas.
  3. Finaliza cerrando el navegador.

💡 Consejo: Cuando trabajes con atributos Name, verifica si existen múltiples elementos con el mismo 
valor para evitar seleccionar el incorrecto.


## ✏️ Actividad: Localización por linkTest

El atributo Link Text es útil para identificar enlaces en base al texto visible. Es ideal para 
elementos de navegación, pero requiere que el texto del enlace coincida exactamente.

Para localizar por linkTest un elemento usando Selenium WebDriver en Java, puedes hacerlo de la siguiente manera:
WebElement nombreVariable = tuInstanciaDriver.findElement(By.partialLinkText("Texto a encontrar"));

  1. Modifica el script anterior para que, de forma automática:
      Haga clic en el botón de inicio de sesión (usando findElement y click).
  2. Ejecuta el programa y asegúrate de que:
      El navegador se abre automáticamente.
      Las acciones programadas se realizan correctamente.
  3. Finaliza cerrando el navegador.

💡 Consejo: Si el texto del enlace es largo o cambia dinámicamente, considera usar partialLinkText para localizar solo una parte del texto.


## ACTIVIDAD INTEGRADORA

En esta actividad integradora, vas a combinar varios conceptos de Selenium para desarrollar un script 
completo que automatice diversas operaciones en sitios web diferentes.

Desafío: Automatización de Tareas Web

Objetivo: Desarrollar un script utilizando Selenium que realice las siguientes operaciones secuenciales:

1. Configuración del Proyecto:
    Crea un nuevo proyecto Maven llamado desafio2.
    Configura el proyecto para utilizar Selenium WebDriver con ChromeDriver.
2. Operaciones a Realizar: Paso 1: Iniciar Sesión en un Proveedor de Correo Electrónico
    Abre el navegador y accede a tu proveedor de correo electrónico (Gmail, Hotmail, etc.).
    Localiza los campos de usuario y contraseña e ingresa tus credenciales para iniciar sesión.
3. Paso 2: Navegar hacia Wikipedia
    Navega hacia la página principal de Wikipedia.
4. Paso 3: Buscar y Hacer Clic en un Elemento Químico
    Utiliza la barra de búsqueda de Wikipedia para buscar un elemento químico de tu preferencia.
    Haz clic en el primer enlace que aparezca relacionado con el elemento químico buscado.
5. Paso 4: Navegar hacia el Diccionario de la Real Academia Española (RAE)
    Navega a la página del Diccionario de la RAE: .
6. Paso 5: Consultar el Significado de una Palabra
    Localiza el campo de búsqueda por su atributo name y escribe una palabra para buscar su significado utilizando sendKeys.
    Haz clic en el botón "Consultar" utilizando findElement y click para obtener el significado.
7. Paso 6: Cierre del Navegador
    Verifica que todas las acciones se hayan completado correctamente.
    Cierra el navegador adecuadamente al finalizar todas las operaciones.
8. Requisitos Técnicos:
    Utiliza localizadores para identificar e interactuar con los elementos de manera precisa.
    Implementa manejo de excepciones para gestionar posibles errores durante la ejecución del script.
    Asegúrate de maximizar la ventana del navegador para una mejor visualización de las acciones automatizadas.
9. Consideraciones Adicionales:
    Documenta tu código para explicar cada paso y asegurar su comprensión.
    Valida cada acción realizada en el navegador para garantizar que se cumplan los objetivos esperados.
    Realiza pruebas iterativas para ajustar y mejorar el script según sea necesario.

💪Esto no solo te ahorra tiempo y esfuerzo manual, sino que también asegura que tus pruebas sean repetibles y confiables💪.