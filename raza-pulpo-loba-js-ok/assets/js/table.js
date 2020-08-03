import { phi } from './phi';

function populateTable(diario) {
    let elementosDiario = new Map();
    for (let i = 0; i < diario.length; i++) {
        let eventos = JSON.parse(diario[i].eventos);
        for (let value of eventos) {
            elementosDiario.set(value, phi(findElementsInJson(value, diario)));
        }
    }

    // Return sorted map
    return [...elementosDiario].sort((a, b) => b[1] - a[1]);
}    

function findElementsInJson(evento, diario) {
    let lista = new Array(0, 0, 0, 0);
    diario.forEach(elemento => {
        if (elemento.pulpo) {
            if (elemento.eventos.includes(evento)) {
                lista[3] += 1
            }
            else {
                lista[2] += 1
            }
        }
        else {
            if (elemento.eventos.includes(evento)) {
                lista[1] += 1
            }
            else {
                lista[0] += 1
            }
        }
    });

    return lista;
}

function showFullDiaryTable(diario){

    const tableBody = document.getElementById('Rtable')
    let datahtml = '<div class="Rtable-row Rtable-row--head"><div class="Rtable-cell date-cell column-heading">DAY</div><div class="Rtable-cell date-cell column-heading">Events</div><div class="Rtable-cell  column-heading">Transformation</div></div>';
    
    var pos = 1;
    var hover;

    diario.forEach(element => {
        pos % 2 == 0 ? hover = "Rtable-row is-striped" : hover = "Rtable-row" 
        datahtml += `<div class="${hover}"> <div class="Rtable-cell date-cell"><div ><span class="webinar-date">${pos}</span></div> </div><div class="Rtable-cell date-cell"><div ><span class="webinar-date">${element.eventos}</span></div> </div> <div class="Rtable-cell topic-cell"><div class="Rtable-cell--content">${element.pulpo}</div></div>   </div>`
        tableBody.innerHTML = datahtml;
        pos++;
    });

}

export { populateTable, findElementsInJson, showFullDiaryTable };