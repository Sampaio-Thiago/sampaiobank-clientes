
public class TestaBanco {
	
		public static void main(String[] args) {
			Cliente thiago = new Cliente();
			thiago.nome = "Thiago Sampaiio de Lima";
			thiago.Cpf = "111.111.111-11";
			thiago.profissao = "Programador";
			
			Conta contaDoThiago = new Conta();
			contaDoThiago.deposita (1000);
			
			// associa o cliente thiago á conta contaDoThiago
			contaDoThiago.titular = thiago;
			System.out.println(contaDoThiago.titular);
			
		}

}
