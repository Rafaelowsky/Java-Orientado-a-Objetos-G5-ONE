//Nuestra entidad será Cuenta
	class Cuenta {
		double saldo;
		int agencia;
		int numero;
		String titular;
	
		public void depositar(double valor) {
			saldo = saldo + valor;
		}
	}
