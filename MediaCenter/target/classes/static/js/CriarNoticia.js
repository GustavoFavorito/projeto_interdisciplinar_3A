$(document).validar(function(){
		// pegando array com as disciplinas
		var e = document.getElementsByName("disciplinas[]");
		
		// guarda o numero de campos marcados
		var num=0;
		
		// lendo todos os campos disciplinas
		for(var k in e){
			// pegando elemento disciplina
			var el = e[k];
			
			// se estiver marcado soma 1
			if(el.checked)
				num++;
		}
		
		// se tiver marcado pelo menos 2 disciplinas deixa enviar
		if(num >= 2)
			return true;
		
		// se não manda mensagem para o usuário e nao deixa enviar
		alert("Marque ao menos dois campos em disciplinas ");
		return false;
	}