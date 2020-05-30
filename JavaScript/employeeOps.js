var tableBody = document.querySelector("tbody");


function hideTable() {
    document.getElementById('table').style.visibility="hidden";
}

function showTable() {
    document.getElementById('table').style.visibility="visible";
}

function generateEmployeeTable() {

    var body = "";

    for(emp in employees) {
        var data = employees[emp];
        var row = "<tr>";

        for(field in data) {
            row += "<td>" + data[field] + "</td>"; 
        }

        row += "</tr>" ;
        body += row;
    }

    tableBody.innerHTML = body;
    showTable();
}

function findByName() {
    var empName = document.querySelector("#name").value;
    //alert(empName);
    tableBody.innerHTML = "";

    var body="";
    var found = false;

    for(emp in employees) {
        if(emp == empName) {
            found = true;
            row = "<tr>";
            data = employees[emp];

            for(field in data) {
                row += "<td>" + data[field] + "</td>";
            }

            row += "</tr>";
            body += row;
            break;
        }
    }

    if(!found) {
        alert("No employee found");
    }

    tableBody.innerHTML = body;
    showTable();
}