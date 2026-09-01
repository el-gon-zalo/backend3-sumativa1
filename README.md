Pasos para ejecutar este proyecto.

1. Lanzar el contenedor docker con docker compose up -d diseñado por: docker-compose.yml
2. Hacer correr la aplicación
3. Los archivos csv resultantes aparecerán en la carpeta output
4. Desde esos archivos resultantes, se rescatan sus filas para poblar la base de datos (MySQL) alojada en el contenedor docker

Detalles del proyecto:
- El proyecto funciona según Java, Spring Batch y MySQL.
- Trabaja con 3 archivos csv en la ruta /input
- Cada uno de los 3 archivos csv tiene 1000 entradas
- Cada chunk es de 50
- El proyecto cuenta con 4 hilos y 4 particiones
- Para cada batch, hay una tolerancia de 200 datos erróneos como máximo (Policy).
- Los 3 archivos csv resultantes ("resumenes") se ubican en la ruta /output
