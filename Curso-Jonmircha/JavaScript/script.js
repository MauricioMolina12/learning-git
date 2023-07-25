function redireccionar() {
    var selectElement = document.getElementById("opciones");
    var selectedValue = selectElement.value;
    if (selectedValue !== "") {
      window.location.href = selectedValue;
    }
  }
  