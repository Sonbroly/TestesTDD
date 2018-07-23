import java.math.BigDecimal;

public class ContaCorrente implements ServicoRemoto{
	private int numeroConta;
	private BigDecimal saldoConta;

	public ContaCorrente (int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	@Override
	public ContaCorrente recuperarConta(BigDecimal numeroConta) {
		return null;
	}

	@Override
	public void persistirConta() {
		
	}

}
