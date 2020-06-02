var btnResposta = document.querySelectorAll('.btn-resposta');
var btnConfirmar = document.getElementById('confirmar');
var btnCancelar = document.getElementById('cancelar');

var op1 = document.querySelector('#op1');
var op2 = document.querySelector('#op2');

var resp1Click = function () {
    op1.classList.add('btn-click');
    op2.classList.remove('btn-click');
    btnConfirmar.style.display = 'block';
};
var resp2Click = function () {
    op1.classList.remove('btn-click');
    op2.classList.add('btn-click');
    btnConfirmar.style.display = 'block';
};

function cancelar()
{
    op2.classList.remove('btn-click');
    op1.classList.remove('btn-click');
    btnConfirmar.style.display = 'none';
}