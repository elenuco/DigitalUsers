// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();
  $('#usuarios').DataTable();
});
async function cargarUsuarios(){
const request = await fetch('usuarios} ', {
  method: 'GET',
  headers: {
  'Accept': 'application/json',
  'Content-Type': 'application/json'
  }
});
const usuarios= await request.json();

for (let usuario of usuarios) {
let usuarioHtml='<td>0</td><td>Usuario Usuario</td><td>Usuario</td><td>Usuario@usuario.com</td><td>Aloha St.</td><td>222-3333-3333</td><td><a href="#" class="btn btn-warning btn-circle"><i class="fas fa-exclamation-triangle"></i></a><a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a>';
}

document.querySelector('#usuarios tbody').outerHTML = usuario;
}