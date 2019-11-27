package set;

import java.util.Comparator;

public class Symbol implements Comparator<NewCard> {

	@Override
	public int compare(NewCard c1, NewCard c2) {
		// TODO Auto-generated method stub
		return c1.getSymbol().compareTo(c2.getSymbol());
	}

}
