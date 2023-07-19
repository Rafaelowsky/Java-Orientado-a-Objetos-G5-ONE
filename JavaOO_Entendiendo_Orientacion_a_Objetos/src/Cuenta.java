     //Nuestro objeto será Cuenta
	class Cuenta {
		private double saldo;
		private int agencia;
		private int numero;
		Cliente titular = new Cliente();
	
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
		
		//Con este método podemos obtener el valor de una variable privada de esta clase
		public double getSaldo () {
			return this.saldo;
	
		}
		
		public int getAgencia () {
			return this.agencia;
		}
		
		public int getNumero () {
			return this.numero;
		}
		
		//Con este método podemos modificar un atributo de la clase aun siendo privada
		public void setSaldo (double saldo) {
			this.saldo = saldo;
		}
		
		public void setAgencia(int agencia) {
			if (agencia < 0) {
			this.agencia = agencia;
		}
			else {
				System.out.println("No existen agencias con números negativos");
			}
		}
		
		public void setNumero(int numero) {
			this.numero = numero;
		}
	}
