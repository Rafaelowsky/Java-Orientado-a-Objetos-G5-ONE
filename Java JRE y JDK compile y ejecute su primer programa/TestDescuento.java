
public class TestDescuento {
	public static void main(String[] args) {
		//Si el valor de la compra está entre $100.0 y $199.99, el descuento es del 10%.
		//Si el valor de la compra está entre $200.0 y $299.99, el descuento es del 15%.
		//Para compras superiores a $300.0, el descuento es del 20%.
		
		double valorCompra = 250.0;
		double descuento = 0;
		
		if (valorCompra >= 100.0 && valorCompra <= 199.99) {
			descuento = 0.90;
		} else if (valorCompra >= 200.0 && valorCompra <= 299.99) {
			descuento = 0.85;
		} else if (valorCompra > 300.0) {
			descuento = 0.80;
		}
		
		double valorFinal = valorCompra * descuento;
		
		System.out.println("Tu total a pagar es de: " + valorFinal + "con un descuento de " + (descuento*100)
				+ "%");
	}
}