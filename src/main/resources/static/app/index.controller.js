function getValueAd() {
    var retVal = prompt("Introduceti parola: ");

    if (retVal === "admin") {
        location.href = "/meniu/administrator";
    } else {
        alert("Parola gresita!")
    }
}
function getValueEc() {
    var retVal = prompt("Introduceti parola: ");

    if (retVal === "econo") {
        location.href = "/meniu/depeconomic";
    } else {
        alert("Parola gresita!")
    }
}
function getValuePr() {
    var retVal = prompt("Introduceti parola: ");

    if (retVal === "produ") {
        location.href = "/meniu/depproductie";
    } else {
        alert("Parola gresita!")
    }
}
function getValueCo() {
    var retVal = prompt("Introduceti parola: ");

    if (retVal === "comer") {
        location.href = "/meniu/depcomercial";
    } else {
        alert("Parola gresita!")
    }
}