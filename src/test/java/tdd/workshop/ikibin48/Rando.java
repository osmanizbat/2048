package tdd.workshop.ikibin48;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author osman
 */
public class Rando {

	Random random = new Random();
	
	@Test
	public void rando(){
		System.out.println(random.nextInt(4));
		System.out.println(random.nextInt(4));
		System.out.println(random.nextInt(4));
		System.out.println(random.nextInt(4));
	}
	
	
	
}
