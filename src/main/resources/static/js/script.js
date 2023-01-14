// Get the form element
const form = document.querySelector("form");

// Add an event listener to the form's submit event
form.addEventListener("submit", function(event) {
  // Get the input element
  const input = document.querySelector("input[type='text']");
  
  // Check if the input is empty
  if (!input.value) {
    // If the input is empty, prevent the form from being submitted
    event.preventDefault();
    // Show an error message to the user
    alert("Please enter a value!");
  }
});
