<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Nome, Disciplina, nota1, nota2 -->
<form method="post" action="ControllerAluno">

<h2>Cadastro de Aluno</h2>
<br/>Nome<br/>
<input type="text" name="nome" id="nome" size="50" required="required"><br/>
<br/>Disciplina<br/>
<select name="disciplina" id="disciplina">
	<option value="nada">Escolha uma opção</option>
	<option value="java">Java</option>
	<option value="javascript">JavaScript</option>
	<option value="angular">Angular</option>
	<option value="node">Node</option>
</select>
<br/>Nota1<br/>
<input type="number" step="0.1" name="nota1" id="nota1" size="50" required="required"><br/>
<br/>Nota2<br/>
<input type="number" step="0.1" name="nota2" id="nota2" size="50" required="required"><br/>
<br/><button type="submit" id="btn1">Enviar dados</button>

<div id="respostaServidor">
	${msg}
</div>

</form>

</body>
</html>