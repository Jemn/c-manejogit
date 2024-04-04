## MANEJO DE GIT

Es un sistema de control de versiones, pensado para la eficiencia y la confiabilidad de mantenimiento de versiones de un proyecto.

### GIT INIT
Se usa para inicializar el repositorio git.

### GIT ADD
Se usa para ingresar el archivo al estado staging.

### GIT STATUS
ver el estado, si se requiere agregar al starget o si se requiere commit.

### GIT ADD .
Se usa para ingresar el archivo al estado staging. Pero con el punto indicamos que vamos a ingresar todos los archivos que hayan tenido cambios.

### GIT COMMIT -M “DESCRIPCION”
Envía los cambios del archivo a la base de datos del control de versiones.

### GIT SHOW
Muestra todos los cambios que hemos hecho a los archivos.

### GIT LOG.
Muestra el historial de cambios completos.

### GIT LOG --STAT
Muestra el historial pero con la cantidad de archivos modificados.

### GIT CONFIG --LIST
Muestra la lista de configuraciones.

### GIT CONFIG --LIST  –SHOW-ORIGIN
para mostrar las configuraciones y sus ruta

### CONFIG –GLOBAL
Se configura el usuario que hará los cambios.

#### git config --global user.email "tu@email.com"
#### git config --global user.name "Tu Nombre

Si por algún motivo te equivocaste en el nombre o email que configuraste al principio, lo puedes modificar de la siguiente manera:

#### git config --global --replace-all user.name 
“Aquí va tu nombre modificado”
O si lo deseas eliminar y añadir uno nuevo

#### git config --global --unset-all user.name
Elimina el nombre del usuario
#### git config --global --add user.name 
“Aquí va tu nombre”

### Que es Staging ?

El staging es el lugar donde se guardan temporalmente los cambios, para luego ser llevados definitivamente al repositorio. El repositorio es el lugar donde se guardan todos los registros de los cambios realizados a los archivos.
![img_1.png](img_1.png)

![img.png](img.png)

#### GIT RESET   #commit - - SOFT

Nos permite volver a la versión de un commit indicado. Vuelve a la versión anterior en el directorio , pero sin borrar los commit usados anteriormente, es decir el staging se mantiene.

#### GIT RESET  #commit - - HARD
Nos permite volver a la versión de un commit indicado. Vuelve a la versión anterior en el directorio , borrando todos los commit usados anteriormente, es decir se eliminan los commit del directorio y staging .








## AUTHOR
JULIO EDUARDO MATEO NOREÑA



