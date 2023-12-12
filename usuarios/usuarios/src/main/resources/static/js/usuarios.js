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
 let listadoHtml = '';
for (let usuario of usuarios) {
let usuarioHtml = '<tr><td>'+usuario.IDUsuarios+'</td><td>'
                  + usuario.Nombre +'</td><td>'+
                  usuario.Usuario+'</td><td>'+
                  usuario.CorreoElectronico+ '</td><td>'+
                  usuario.Telefono+ '</td></tr>';
    listadoHtml += usuarioHtml;
}

document.querySelector('#usuarios tbody').outerHTML = listadoHtml;
}