import java.math.BigDecimal;

public interface ServicoRemoto {
	public ContaCorrente recuperarConta(BigDecimal numeroConta);

	public void persistirConta();
}
