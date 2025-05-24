-Sistema de Análisis de Laberinto Energético:

Sistema para analizar un laberinto representado como una matriz cuadrada de enteros positivos entre 1 y 9. El objetivo principal es detectar patrones numéricos dentro del laberinto, identificar celdas con características especiales y obtener información útil sobre su estructura energética.

-Características:

1. Conteo de Energía Elevada: Posibilidad de contar cuántos números pares son mayores a 4.

2. Promedio de Energía Impar: Calcular el promedio de todos los números impares del laberinto.

3. Sumatoria de Rutas: Sumar los valores energéticos de cada fila y mostrar los totales por fila.

4. Detección de Sala Suprema: Indicar la posición de la celda que contiene el número más alto de toda la matriz.

5. Visualización del Laberinto: Mostrar la matriz generada de forma legible en consola.

-Clases Principales:

1. Clase LaberintoAzar: contiene todos los métodos para analizar la matriz. Genera el laberinto, cuenta pares mayores a 4, calcula el promedio de impares, suma las filas y localiza el valor máximo con su posición.

2. Método generarLaberinto: genera aleatoriamente una matriz cuadrada con valores del 1 al 9.

3. Método contarParesMayoresQueCuatro: cuenta los números pares mayores a 4 en toda la matriz.

4. Método promedioImpares: calcula el promedio de todos los números impares en la matriz.

5. Método sumaFilas: suma los valores de cada fila y devuelve un arreglo con los resultados.

6. Método posicionMaximo: busca y devuelve la posición del número más alto de toda la matriz.

7. Método mostrarMatriz: imprime el contenido del laberinto en forma de tabla.

8. Método main: ejecuta el programa, generando el laberinto y llamando a cada funcionalidad para mostrar los resultados en consola.

-Uso:

Analizar estructuras de datos tipo matriz para comprender mejor patrones numéricos y su distribución espacial. Este sistema permite simular análisis en mapas o estructuras similares a laberintos, mostrando información útil como valores extremos, promedios y sumatorias por fila.
