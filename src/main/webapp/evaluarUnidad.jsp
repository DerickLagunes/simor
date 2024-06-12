<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listas Desplegables Anidadas</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        .dropdown {
            margin-bottom: 20px;
        }
    </style>
    <script>
        function updateSecondList() {
            const firstList = document.getElementById("first-list");
            const secondList = document.getElementById("second-list");
            const thirdList = document.getElementById("third-list");
            const selectedOption = firstList.value;

            // Limpia las opciones actuales de la segunda y tercera lista
            secondList.innerHTML = "<option value=''>Seleccione una opción</option>";
            thirdList.innerHTML = "<option value=''>Seleccione una opción</option>";

            // Define las opciones basadas en la selección de la primera lista
            let options = [];
            if (selectedOption === "luces") {
                options = [
                    { text: "Galibo", value: 1},
                    { text: "Altas", value: 2},
                    { text: "Bajas", value: 3},
                    { text: "Demarcadoras", value: 4 },
                    { text: "Indicadoras", value: 5}
                ];
            } else if (selectedOption === "llantas") {
                options = [
                    { text: "Rin", value: 1},
                    { text: "Masas", value: 2},
                    { text: "Presion", value: 3},
                    { text: "Profundidad", value: 4},
                    { text: "Birlos", value: 2},
                    { text: "Tuercas", value: 2}
                ];
            } else if (selectedOption === "caja-dirección") {
                options = [
                    { text: "Fuga de aceite", value:1},
                ];
            }
            else if (selectedOption === "Deposito de aceite") {
                options = [
                    { text: "Fuga de aceite", value:1},
                ];
            }
            else if (selectedOption === "Parabrisas") {
                options = [
                    { text: "Estrellado", value:1},
                ];
            }
            else if (selectedOption === "Limpiaparabrisas") {
                options = [
                    { text: "No funciona", value:1},
                    { text: "Faltante", value:1}
                ];
            }

            // Añade las nuevas opciones a la segunda lista
            options.forEach(option => {
                const newOption = document.createElement("option");
                newOption.text = option.text;
                newOption.value = option.value;
                secondList.add(newOption);
            });
        }

        function updateThirdList() {
            const thirdList = document.getElementById("third-list");

            // Limpia las opciones actuales de la tercera lista
            thirdList.innerHTML = "<option value=''>Seleccione una opción</option>";

            // Define las opciones para la tercera lista
            const options = [
                { text: "Izquierda Fundida", value: "izquierda-fundida" },
                { text: "Derecha Fundida", value: "derecha-fundida" },
                { text: "Izquierda Rota", value: "izquierda-rota" },
                { text: "Derecha Rota", value: "derecha-rota" },
                { text: "Las Dos Fundidas", value: "las-dos-fundidas" },
                { text: "Las Dos Rotas", value: "las-dos-rotas" },
                { text: "Aprobadas", value: "aprobadas" }
            ];

            // Añade las nuevas opciones a la tercera lista
            options.forEach(option => {
                const newOption = document.createElement("option");
                newOption.text = option.text;
                newOption.value = option.value;
                thirdList.add(newOption);
            });
        }
    </script>
</head>
<body>
<h1>Listas Desplegables Anidadas</h1>
<div class="dropdown">
    <label for="first-list">Primera Lista:</label>
    <select id="first-list" onchange="updateSecondList()">
        <option value="">Seleccione una opción</option>
        <option value="luces">Luces</option>
        <option value="llantas">Llantas</option>
        <option value="caja-direccion">Caja dirección</option>
        <option value="deposito-aceite">Deposito de aceite</option>
        <option value="parabrisas">Parabrisas</option>
        <option value="limpiaparabrisas">Limpiaparabrisas</option>
        <option value="huelgo">Huelgo</option>
        <option value="escape">Escape</option>
    </select>
</div>
<div class="dropdown">
    <label for="second-list">Segunda Lista:</label>
    <select id="second-list" onchange="updateThirdList()">
        <option value="">Seleccione una opción</option>
        <!-- Las opciones se añadirán aquí dinámicamente -->
    </select>
</div>
<div class="dropdown">
    <label for="third-list">Tercera Lista:</label>
    <select id="third-list">
        <option value="">Seleccione una opción</option>
        <!-- Las opciones se añadirán aquí dinámicamente -->
    </select>
</div>
</body>
</html>
