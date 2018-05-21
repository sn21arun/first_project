var xhr = new XMLHttpRequest();
var btn = document.getElementById('button');
var inp = document.getElementById('ninput');

btn.addEventListener('click', getNumbers);

function getNumbers(e) {
  getApi(inp.value)
  e.preventDefault();
}

function getApi(num) {
  xhr.open('GET', `http://numbersapi.com/${num}`, true);
  xhr.send();
  xhr.addEventListener("readystatechange", processRequest, false);
}

function processRequest(e) {
  if (xhr.readyState == 4 && xhr.status == 200) {
    document.getElementById('output').innerHTML = xhr.responseText;
  }
}
