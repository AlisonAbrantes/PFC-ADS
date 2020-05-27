var btnToggleCad = document.querySelectorAll('.toggle-modal-cadastrar');
var btnToggleList = document.querySelectorAll('.toggle-modal-listar');

for (var i = 0; i < btnToggleCad.length; i++) {
	btnToggleCad[i].addEventListener('click', function() {
		var modal_cadastro = document.querySelector('#cadastro-produtos');
		var overlay = document.querySelector('.overlay');
		overlay.classList.toggle('display-block');
		modal_cadastro.classList.toggle('display-block');
		modal_cadastro.classList.toggle('modal-top-in');
	});
}

for (var count = 0; count < btnToggleList.length; count++) {
	btnToggleList[count].addEventListener('click', function() {
		var modal_listar = document.querySelector('#lista-produtos');
		var overlay = document.querySelector('.overlay');
		overlay.classList.toggle('display-block');
		modal_listar.classList.toggle('display-block');
		modal_listar.classList.toggle('modal-top-in');
	});
}
