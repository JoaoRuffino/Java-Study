package aula36;

public class TesteContato {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		//contato.setEndereco("Guarulhos");
		contato.setNome("Robson");
		//contato.setTelefone("11 989786756");
		
		Endereco end = new Endereco();
		end.setNomeDaRua("Rua josé");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCep("09089765");
		end.setCidade("Guarulhos");
		end.setEstado("São Paulo");
		
		contato.setEndereco(end);
		
		Telefone tel = new Telefone();
		tel.setDdd("11");
		tel.setNumero("908765643");
		tel.setTipo("celular");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("11");
		tel2.setNumero("23457689");
		tel2.setTipo("casa");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		
		contato.setTelefones(telefones);
		
		//contato.setTelefone(tel);
		
		if(contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		/*if(contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t: contato.getTelefones()) {
				System.out.println(t.getTipo() + " : " + t.getDdd() + " " + t.getNumero());
			}
		}
		
		System.out.println(contato.getNome());
	}

}
