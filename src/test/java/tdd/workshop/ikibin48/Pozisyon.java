package tdd.workshop.ikibin48;

import lombok.Data;

import lombok.ToString;

/**
 *
 * @author osman
 */
@Data
@ToString
public class Pozisyon {
	
	private Integer x;
	
	private Integer y;

	public Pozisyon(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Pozisyon{" + "x=" + x + ", y=" + y + '}';
	}
	
	
	
	
}
