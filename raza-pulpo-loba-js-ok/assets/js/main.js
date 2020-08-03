/**
 * Creamos un método para calcular la correlación a partir de un json.
 */

import { getDiario } from "./apiRequest";
import { populateTable, showFullDiaryTable } from "./table";

window.addEventListener('load', async function() {
    // Obtenemos el diario de un ApiREST.
    const diario = await getDiario();

    function generateTableFromArray(diario) {
        const tableBody = document.getElementById('Rtable')

        // Set table headers.
        let datahtml = '<div class="Rtable-row Rtable-row--head"><div class="Rtable-cell date-cell column-heading">TOP</div><div class="Rtable-cell date-cell column-heading">Element</div><div class="Rtable-cell  column-heading">Percent</div></div>';
        // For each orderer event in the table.
        var pos = 1;
        var hover;

        populateTable(diario).forEach(element => {
            pos % 2 == 0 ? hover = "Rtable-row is-striped" : hover = "Rtable-row" 
            datahtml += `<div class="${hover}"> <div class="Rtable-cell date-cell"><div ><span class="webinar-date">${pos}</span></div> </div><div class="Rtable-cell date-cell"><div ><span class="webinar-date">${element[0]}</span></div> </div> <div class="Rtable-cell topic-cell"><div class="Rtable-cell--content">${element[1] + '%'}</div></div>   </div>`
            tableBody.innerHTML = datahtml;
            pos++;
        });
    }

    // If Rtable exists, ejecute function.
    let rTableExists = document.getElementById("Rtable");
    if (rTableExists) {
        // Add showTable button function to show the table calculated.
        showFullDiaryTable(diario);
    }

    let showTableExists = document.getElementById("showTable");
    // If showTable button exists, assign function.
    if (showTableExists) {
        // Add showTable button function to show the table calculated.
        document.getElementById("showTable").onclick = function() { generateTableFromArray(diario) };
    }  
})
