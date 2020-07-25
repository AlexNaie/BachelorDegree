EnableSubmit = function(val) {
    var next = document.getElementById("next");

    if (val.checked === true)
    {
        next.disabled = false;
    }
    else
    {
        next.disabled = true;
    }
}

EnableCheckbox = function(val) {
    var customSwitch2 = document.getElementById("customSwitch2");

    if (val.checked === true)
    {
        customSwitch2.disabled = false;
    }
    else
    {
        customSwitch2.disabled = true;
    }
}


function butConfirm() {
    alert("Ati verificat datele introduse?");

    if (alert) {
        location.href = "/pr/procesfabricare";
    } else {
        // alert("Reverificati")
    }
}
