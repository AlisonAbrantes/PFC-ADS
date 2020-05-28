var btnToggleCad = document.querySelectorAll('.toggle-modal-cadastrar');
var btnToggleList = document.querySelectorAll('.toggle-modal-listar');
var btnAlterarInfo = document.querySelectorAll('.toggle-modal-alterarInfo');
var btnAlterarSenha = document.querySelectorAll('.toggle-modal-alterarSenha');
for (var i = 0; i < btnToggleCad.length; i++) {
	btnToggleCad[i].addEventListener('click', function() {
		var modal_cadastro = document.querySelector('#cadastro-produtos');
		var overlay = document.querySelector('.overlay');
		overlay.classList.toggle('display-block');
		modal_cadastro.classList.toggle('display-block');
		modal_cadastro.classList.toggle('modal-top-in');
	});
}

for (var i2 = 0; i2 < btnToggleList.length; i2++) {
	btnToggleList[i2].addEventListener('click', function() {
		var modal_listar = document.querySelector('#lista-produtos');
		var overlay = document.querySelector('.overlay');
		overlay.classList.toggle('display-block');
		modal_listar.classList.toggle('display-block');
		modal_listar.classList.toggle('modal-top-in');
	});
}

for (var i3 = 0; i3 < btnAlterarInfo.length; i3++) {
	btnAlterarInfo[i3].addEventListener('click', function() {
		var modal_perfil = document.querySelector('#alterar-perfil');
		var overlay = document.querySelector('.overlay');
		overlay.classList.toggle('display-block');
		modal_perfil.classList.toggle('display-block');
		modal_perfil.classList.toggle('modal-top-in');
	});
}
for (i4 = 0; i4 < btnAlterarSenha.length; i4++) {
	btnAlterarSenha[i4].addEventListener('click', function() {
		var modal_senha = document.querySelector('#alterar-perfil-senha');
		var overlay = document.querySelector('.overlay');
		overlay.classList.toggle('display-block');
		modal_senha.classList.toggle('display-block');
		modal_senha.classList.toggle('modal-top-in');
	});
}
