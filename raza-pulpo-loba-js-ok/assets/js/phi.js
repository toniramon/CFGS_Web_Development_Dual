function phi(tabla) {

    let n11, n00, n10, n01;
    n11 = tabla[0];
    n10 = tabla[1];
    n01 = tabla[2];
    n00 = tabla[3];

    let divisor = (n11 * n00 - n10 * n01);
    let dividendo = Math.sqrt((n11 + n10) * (n01 + n00) * (n01 + n11) * (n10 + n00));
    let resultado = divisor / dividendo;
    return resultado.toFixed(5);
}

export { phi };