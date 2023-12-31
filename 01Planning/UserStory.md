<h1 align="center">
    Escuela Politécnica Nacional<br>
    Facultad de Ingeniería en Sistemas<br>
    Metodologías Ágiles<br>
</h1>

### Grupo: 4

### Integrantes
- Kevin Revelo
- Paúl Román
- Jonathan Salazar
- Santiago Salazar
- Sebastián Sanchez
- Nathaly Simba

# Historias de Usuario

## Historia de Usuario 1

<table style="width: 700px" >
<thead>
  <tr>
    <th style= "border: medium solid grey">
        <div style= "display: inline-flex;">
            <div style= "border-right:medium solid grey; padding-right:10px;">
                <h3>Título:</h3>
                Jugar el juego del lobo para llevar a la otra orilla a todos los personajes
            </div>
            <div style= "margin-left:5px"> 
                Nro: HU1 <br>
                Nivel de prioridad: Alto <br>
                Riesgo en desarrollo: Alto
            </div>
        </div>
    </th>
  </tr>
</thead>
<tbody>
    <tr>
        <td style= "border: medium solid grey">
            <h3>Historia de Usuario:</h3>
            <p>Como jugador, quiero poder mover a los personajes seleccionados al bote para que crucen a la otra orilla.</p>
        </td>
    </tr>
    <tr>
        <td style= "border: medium solid grey">
            <h3>Criterios de Aceptación 1: Precisión del Juego</h3>
            <ul>
                <li>En el menú, se deben visualizar todos los personajes disponibles en el juego.</li>
                <li>La aplicación debe limitar la capacidad del bote, permitiendo que solo dos personas crucen.</li>
                <li>Después de que los personajes hayan cruzado el río, el programa debe mostrar nuevamente el menú de personajes.</li>
            </ul>
        </td>
    </tr>
</tbody>
</table>

## Historia de Usuario 2

<table style="width: 700px" >
<thead>
  <tr>
    <th style= "border: medium solid grey">
        <div style= "display: inline-flex;">
            <div style= "border-right:medium solid grey; padding-right:10px;">
                <h3>Título:</h3>
                Establecer las reglas que determinan la interacción entre los personajes
            </div>
            <div style= "margin-left:5px"> 
                Nro: HU2 <br>
                Nivel de prioridad: Alto <br>
                Riesgo en desarrollo: Alto
            </div>
        </div>
    </th>
  </tr>
</thead>
<tbody>
    <tr>
        <td style= "border: medium solid grey">
            <h3>Historia de Usuario:</h3>
            <p>Como jugador, quiero que el juego establezca reglas claras que determinen cómo los personajes pueden interactuar entre sí para que pueda desarrollarse el juego.</p>
        </td>
    </tr>
    <tr>
        <td style= "border: medium solid grey">
            <h3>Criterios de Aceptación 1: Reglas del juego</h3>
            <ul>
                <li>Las reglas de interacción deben influir en el progreso del juego y en la forma en que los personajes logran cruzar el río.</li>
                <li>El programa debe definir las interacciones permitidas entre los personajes y sus limitaciones. Por ejemplo:
                    <ul>
                        <li>El lobo no puede quedarse solo con la caperucita porque se la come.</li>
                        <li>La caperucita no puede quedarse sola con las uvas porque las puede comer.</li>
                        <li>Solo puede ir el observador junto a un personaje en el bote.</li>
                    </ul>
                </li>
            </ul>
        </td>
    </tr>
</tbody>
</table>

## Historia de Usuario 3

<table style="width: 700px" >
<thead>
  <tr>
    <th style= "border: medium solid grey">
        <div style= "display: inline-flex;">
            <div style= "border-right:medium solid grey; padding-right:10px;">
                <h3>Título:</h3>
                Mostrar si se tuvo éxito o fracaso al cruzar los personajes de un lado a otro
            </div>
            <div style= "margin-left:5px"> 
                Nro: HU3 <br>
                Nivel de prioridad: Alto <br>
                Riesgo en desarrollo: Alto
            </div>
        </div>
    </th>
  </tr>
</thead>
<tbody>
    <tr>
        <td style= "border: medium solid grey">
            <h3>Historia de Usuario:</h3>
            <p>Como jugador, quiero recibir una clara indicación de éxito o fracaso una vez que haya logrado cruzar a todos los personajes de un lado a otro del juego, para saber de inmediato si he ganado o perdido.</p>
        </td>
    </tr>
    <tr>
        <td style= "border: medium solid grey">
            <h3>Criterios de Aceptación 1: Reglas del juego</h3>
            <ul>
                <li>Se debe indicar el resultado de forma inmediata y actualizarse en tiempo real, proporcionando retroalimentación instantánea al jugador.</li>
                <li>El mensaje de victoria o derrota debe ser claro y comprensible.</li>
                <li>Cuando todos los personajes hayan cruzado al otro lado del río con éxito, se debe mostrar claramente un mensaje indicando que el jugador ha ganado el juego.</li>
                <li>Si en algún momento el jugador no logra cruzar a todos los personajes con éxito, se debe mostrar un mensaje evidente informando que el juego ha sido perdido.</li>
            </ul>
        </td>
    </tr>
</tbody>
</table>