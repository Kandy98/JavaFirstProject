function add(num1, num2) {
    return num1 + num2;
}
function sub(num1, num2) {
    return num1 - num2;
}
function mul(num1, num2) {
    return num1 * num2;
}
function div(num1, num2) {
    return num1 / num2;
}

function calculate() {
    
    const rbs = document.querySelectorAll("input[type='radio']")

    var num1 = parseInt(document.querySelector("#num1").value);
    var num2 = parseInt(document.querySelector("#num2").value);

    let selectedOperation;
    for (const rb of rbs) {
        if(rb.checked) {
            selectedOperation = rb.id;
            break;
        }
    }

    if(selectedOperation == "add")
        alert(add(num1, num2));
    
    if(selectedOperation == "sub")
        alert(sub(num1, num2));

    if(selectedOperation == "mul")
        alert(mul(num1, num2));
    
    if(selectedOperation == "div")
        alert(div(num1, num2));

}

