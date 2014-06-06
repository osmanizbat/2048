package tdd.workshop.ikibin48;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author osman
 */
public class Ikibin48Tests {
	
	Oyun oyun;
	
	@Before
	public void setup(){
		oyun = new Oyun();
	}
	
	
	@Test
	public void oyun_rastgele_yerlestirilmis_2_tasla_baslar(){
		oyun.basla();
		List<Hucre> doluHucreler = oyun.doluHucreler();
		assertTrue(doluHucreler.size() == 2);
		Pozisyon p1 = doluHucreler.get(0).pozisyon();
		Pozisyon p2 = doluHucreler.get(1).pozisyon();
		oyun.basla();		
		doluHucreler = oyun.doluHucreler();
		Pozisyon p3 = doluHucreler.get(0).pozisyon();
		Pozisyon p4 = doluHucreler.get(1).pozisyon();
		assertNotEquals(p1, p3);
		assertNotEquals(p2, p4);
	}
	
	@Test
	public void ilk_(){
		oyun.basla();
		List<Hucre> doluHucreler = oyun.doluHucreler();
		assertTrue(doluHucreler.size() == 2);
		Hucre h1 = doluHucreler.get(0);
		Hucre h2 = doluHucreler.get(1);
		
		assertTrue(h1.sayi() == 2 || h2.sayi() == 2);
		
	}
	
	
}
