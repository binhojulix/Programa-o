package br.com.fabio.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.fabio.notafiscal.GeradorDeNotaFiscal;
import br.com.fabio.notafiscal.NFDao;
import br.com.fabio.notafiscal.NotaFiscal;
import br.com.fabio.notafiscal.Pedido;
import br.com.fabio.notafiscal.SAP;

public class GeradorDeNotaFiscalTest {

	@Test
	public void deveEnviarNFGeradaParaSAP() {
		NFDao dao = Mockito.mock(NFDao.class);
		SAP sap = Mockito.mock(SAP.class);
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao, sap);
		Pedido pedido = new Pedido("Mauricio", 1000, 1);
		NotaFiscal nf = gerador.gera(pedido);
		Mockito.verify(sap).envia(nf);
	}


}
