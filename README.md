# Literalura - "Donde los libros viven"

**Literalura** es una aplicación diseñada para los amantes de la literatura que desean explorar, registrar y gestionar información sobre libros y autores. Esta herramienta facilita la búsqueda de libros, el almacenamiento de datos en una base de datos y la consulta de información literaria relevante, todo a través de una interfaz sencilla e intuitiva.

---

## Características principales

1. **Búsqueda de libros:**
   - Permite buscar libros por título utilizando una API externa.
   - Almacena información relevante como el autor, idioma y número de descargas en la base de datos.

2. **Gestión de autores:**
   - Registra autores junto con su fecha de nacimiento y fallecimiento.
   - Asocia libros a los autores registrados.

3. **Listados personalizados:**
   - Consulta autores vivos en un año específico.
   - Filtra libros según el idioma.
   - Muestra un listado general de libros registrados.

4. **Persistencia de datos:**
   - Utiliza una base de datos relacional para almacenar información de libros y autores de manera segura y estructurada.

---

## Tecnologías utilizadas

- **Java 17:** Lenguaje de programación principal para la lógica de negocio.
- **Jakarta Persistence API (JPA):** Manejo de entidades y relaciones.
- **SQLite:** Base de datos ligera y eficiente para persistencia de datos.
- **API Gutendex:** Proveedor de información de libros para las búsquedas.
- **Maven:** Gestión de dependencias y compilación del proyecto.

---

## Instalación y ejecución

### Prerrequisitos

- Java 17 instalado.
- Maven configurado.
- SQLite disponible en el entorno.

### Pasos

1. Clonar el repositorio del proyecto:
   ```bash
   git clone https://github.com/usuario/literalura.git
   cd literalura
   ```

2. Compilar el proyecto utilizando Maven:
   ```bash
   mvn clean install
   ```

3. Configurar la base de datos SQLite:
   - Asegúrate de que el archivo `literalura.db` esté disponible en la carpeta raíz del proyecto.

4. Ejecutar la aplicación:
   ```bash
   java -jar target/literalura.jar
   ```

---

## Estructura del proyecto

```plaintext
literalura/
|-- src/
|   |-- main/
|   |   |-- java/com/challengealura/literalura/
|   |   |   |-- models/   # Clases de entidad (Libro, Autor)
|   |   |   |-- services/ # Lógica para consumir APIs y manejar datos
|   |   |   |-- repository/ # Repositorios JPA
|   |   |   |-- principal/ # Menú principal y flujo del programa
|-- resources/
|-- pom.xml
|-- literalura.db  # Base de datos SQLite
```

---

## Cómo usar la aplicación

1. **Navegar por el menú principal:**
   - Selecciona opciones para agregar libros, listar autores, o consultar libros por idioma.

2. **Buscar un libro:**
   - Ingresa el título del libro que deseas buscar. La información será extraída y registrada automáticamente.

3. **Listar autores vivos:**
   - Indica un año para obtener un listado de autores vivos en ese período.

4. **Filtrar libros por idioma:**
   - Selecciona el idioma de interés para obtener un listado de libros registrados en ese idioma.

---

## Contribuciones

¡Las contribuciones son bienvenidas! Por favor, sigue los pasos a continuación para contribuir:

1. Realiza un fork del repositorio.
2. Crea una rama con el nombre de tu funcionalidad o corrección:
   ```bash
   git checkout -b nueva-funcionalidad
   ```
3. Realiza tus cambios y súbelos:
   ```bash
   git commit -m "Añadí una nueva funcionalidad"
   git push origin nueva-funcionalidad
   ```
4. Abre un pull request en GitHub.

---

¡Gracias por usar **Literalura**! "Donde los libros viven."
