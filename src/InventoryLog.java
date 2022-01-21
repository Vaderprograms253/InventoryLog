import javax.print.CancelablePrintJob;
import java.util.ArrayList;
import java.util.Collections;

public class InventoryLog implements Inventory {
    //empty ArrayList to track char inventory
    private final ArrayList<Character> list = new ArrayList<>();


    /**
     * increments the count of the character c in the inventory
     * character is placed at the end of the list
     *
     * @param c character to track in inventory
     */
    @Override
    public void add(char c) {
        if (Character.isLetter(c)) {
            list.add(c);
        }

    }

    /**
     * removes all occurrences of character passed through parameter
     *
     * @param c character to track in inventory
     */
    @Override
    public void subtract(char c) {
        if (Character.isLetter(c)) {
            list.removeAll(Collections.singleton(c));
        }
    }

    /**
     * returns a count of the letter in the inventory, zero otherwise
     *
     * @param c character in inventory
     * @return a count of the character in the inventory
     */
    @Override
    public int get(char c) {
        c = Character.toLowerCase(c);
        if (Character.isLetter(c)) {
            return list.indexOf(c);
        }
        return 0;
    }

    /**
     * updates the count of the character c in the inventory (if count is zero or greater)
     *
     * @param c     character to update in inventory, throws IllegalArgumentException if character not in inventory
     * @param count number to update count with, throws IllegalArgumentException if negative
     */
    @Override
    public void set(char c, int count) {
        try {
            if (Character.isLetter(c)) {
                for (int i = 0; i < count; i++) {
                    int letterIndex = list.indexOf(c);
                    list.add(letterIndex + 1, c);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    /**
     * returns true if character is contained in the inventory
     *
     * @param c character
     * @return true if character in inventory, false otherwise
     */
    @Override
    public boolean contains(char c) {
        c = Character.toLowerCase(c);
        for (Character letter: list) {
            if (letter == c){
                return true;
            }
        }
        return false;
    }

    /**
     * returns the sum of all counts in the inventory
     *
     * @return the total count
     */
    @Override
    public int size() {
        return list.size();
    }

    /**
     * Returns true if this inventory is empty (all counts are 0)
     *
     * @return true if all counts are 0, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Log: " + list;
    }
}
