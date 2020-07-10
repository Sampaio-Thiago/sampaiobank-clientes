
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoThiago = new Conta();
		contaDoThiago.saldo = 100;
		contaDoThiago.deposita(70);
		System.out.println(contaDoThiago.saldo);

		boolean saqueEfetivado = contaDoThiago.saca(60);
		System.out.println(contaDoThiago.saldo);
		System.out.println(saqueEfetivado);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.transfere(300, contaDoThiago)) {
			System.out.println("Transferência realizada com sucesso");
		} else {
			System.out.println("Saldo Insuficiente");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoThiago.saldo);

	}

}
