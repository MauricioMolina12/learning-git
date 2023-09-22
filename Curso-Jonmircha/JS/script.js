
        var grado = parseInt(prompt("Digite grado: "));
        var F = [];

        var coeficientes = document.querySelectorAll('.coeficiente');

        for (let i = 0; i < coeficientes.length; i++) {
            let coeficiente = parseFloat(coeficientes[i].value);
            F.push(coeficiente);
        }

        var xo = parseFloat(document.getElementById('xo').value);
        var tol = parseFloat(document.getElementById('to').value);
        var NumMax = parseInt(document.getElementById('nm').value);

        var i = 0, sw = 0, x1 = 0;

        while (sw == 0 && i <= NumMax) {
            let fxo = Evaluar(F, xo);
            let fpxo = Evaluar(Derivar(F), xo);

            x1 = xo - (fxo / fpxo);
            var e = Math.abs(x1 - xo);

            if (e <= tol) {
                sw = 1;
            } else {
                xo = x1;
                i++;
            }
        }

        var resultadoInput = document.getElementById('resultado');

        if (sw == 1) {
            resultadoInput.value = "La raíz real es: " + x1;
        } else {
            resultadoInput.value = "No se encontró una raíz en " + NumMax + " iteraciones.";
        }


function Evaluar(f, x) {
    let fx = 0;
    for (let i = 0; i < f.length; i++) {
        fx += f[i] * Math.pow(x, i);
    }
    return fx;
}

function Derivar(f) {
    let D = [];
    for (let i = 1; i < f.length; i++) {
        D.push(f[i] * i);
    }
    return D;
}
