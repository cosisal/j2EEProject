package test.ws;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import ws.WsImplementation;

public class WsTest {
	
	String qualcosa;
	
	@Before
	public void setQualcosa() {
		this.qualcosa = "ciccio";
	}
		
	@Test
	public void testSayHello() {
		WsImplementation ws = new WsImplementation();
		String ciao = ws.sayHello();
		assertEquals("Ciao", ciao);
		
	}
	
	@Test
	public void testDiQualcosa() {
		WsImplementation ws = new WsImplementation();
		String response = ws.diQualcosa(qualcosa);
		Integer prova = 1;
		assertEquals("ciccio", response);
		assertThat(prova, isA(Integer.class));
	}

}
