package tdd.workshop.ikibin48;

import com.google.common.collect.Lists;
import static com.google.common.collect.Lists.newArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author osman
 */
public class Oyun {
	
	private Board board;
	
	private Random random = new Random();

	
	List<Hucre> hucreler = newArrayList();

	public Oyun(Board board) {
		this.board = board;
	}
	
	public Oyun() {
		this.board = new Board();
	}

	public void basla(){
		Hucre h1 = new Hucre(new Pozisyon(rando(), rando()));
		Hucre h2 = new Hucre(new Pozisyon(rando(), rando()));
		hucreler = newArrayList(h1, h2);
	}
	
	private int rando(){
		return random.nextInt(4) + 1;
	}

	public List<Hucre> doluHucreler() {
		List<Hucre> doluHucreler = newArrayList();
		
		for(Hucre h : hucreler){
			if(h.sayi() != null){
				doluHucreler.add(h);
			}
		}
		
		return doluHucreler;
	}
	
}
