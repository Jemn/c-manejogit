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





## AUTHOR
JULIO EDUARDO MATEO NOREÑA



