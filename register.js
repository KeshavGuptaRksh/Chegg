function handleSubmit() {
  const cb = document.querySelector("#accept:checked");
  if (cb == null) {
    alert("Please check the terms and conditions box");
  } else {
    alert("You have accepted the terms and conditions");
  }
}
