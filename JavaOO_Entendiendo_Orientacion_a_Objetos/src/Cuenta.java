     //Nuestro objeto será Cuenta
	class Cuenta {
		double saldo;
		int agencia;
		int numero;
		String titular;
	
		//Con esto podemos crear una función como si de JavaScript se tratase
		//No retorna valor (void) 
		public void depositar(double valor) {
		   // object       object 
			this.saldo += valor;
		}
		
		//Retorna valor booleano
		public boolean retirar (double valor) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			} else { System.out.println("No puedes retirar mas del dinero que tienes");
				return false;
			}
		}
		
		// Retorna valor booleano
		public boolean transferir (double valor, Cuenta cuenta) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				cuenta.depositar(valor);
				return true;
			} else {
				return false;
			}
		}
	}
