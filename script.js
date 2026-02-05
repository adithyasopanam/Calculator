function back() {
  var exp = document.getElementById("txt").value;
    var regex = /[0-9]|\./;
   if (exp.length === 0) {
    alert("Nothing to delete");
   }


  else{
  if (regex.test(exp)) {
    document.getElementById("txt").value = exp.slice(0, -1);
    if (exp.length === 0) {
      document.getElementById("txt").value = "";
    }
  } else {
    alert("Accept only numbers and decimal point");
    document.getElementById("txt").value = "";
    return;
  }
}
}

function calc(val) {
  var v = document.getElementById('txt');
  v.value += val;
}

function result() {
  var num1 = document.getElementById('txt').value;

  if (ch(num1)) {
    try {
      // Replace 'x' with '*' for multiplication
      var num2 = eval(num1.replace(/x/g, '*'));
      document.getElementById('txt').value = num2;
    } catch {
      document.getElementById('txt').value = 'Error';
    }
  } else {
    document.getElementById('txt').value = '';
  }
}

function ch(expr) {
  expr = expr.trim();

  // 1. Allow only digits, operators (+ - * /), and parentheses
  if (!/^[0-9+\-%*/() ]+$/.test(expr)) {
    alert("Invalid character detected. Only digits and operators (+, -, *, /) are allowed.");
    return false;
  }

  // 2. No consecutive operators
  if (/[+\-*/]{2,}/.test(expr)) {
    alert("Consecutive operators are not allowed.");
    return false;
  }

  // 3. Expression should not start or end with an operator
  if (/^[+\*/%]/.test(expr) || /[+\-*%/]$/.test(expr)) {
    alert("Expression cannot start or end with an operator.");
    return false;
  }


  return true;

}
