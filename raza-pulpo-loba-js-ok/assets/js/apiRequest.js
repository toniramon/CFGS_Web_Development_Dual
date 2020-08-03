async function getDiario(){
    try {
        const response = await fetch('https://api-pop.toniramon.dev/api/diario');
        return response.json();
    } catch (error) {
      // return error
      alert("El diario de Mariano no está disponible en este momento :(");
    }
}

export { getDiario };