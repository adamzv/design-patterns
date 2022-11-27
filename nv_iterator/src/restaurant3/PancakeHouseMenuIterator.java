package restaurant3;

// teraz implementujeme rozhranie Iterator z Java API
import java.util.Iterator;
import java.util.ArrayList;


public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem object = items.get(position);
        position = position + 1;
        return object;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
