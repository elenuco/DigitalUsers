// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();
  $('#usuarios').DataTable();
});
function cargarUsuarios(){
const request = await fetch('Usuarios/{IDUsuarios} ', {
  method: 'GET',
  headers: {
  'Accept': 'application/json',
  'Content-Type': 'application/json'
  }
});
const usuarios= await request.json();
console.log(usuarios);
}