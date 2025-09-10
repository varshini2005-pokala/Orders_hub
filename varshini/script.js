document.querySelector("form").addEventListener("submit", function(e) {
  e.preventDefault(); // stop form from submitting normally

  const email = document.getElementById("email").value;
  const password = document.getElementById("password").value;

  if (email.trim() === "" || password.trim() === "") {
    alert("Please enter both email and password.");
    return;
  }

  // Save email to localStorage
  localStorage.setItem("userEmail", email);

  // Redirect to dashboard
  window.location.href = "dashboard.html";
});
