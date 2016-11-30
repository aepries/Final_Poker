import java.util.*;

public class Hand {

   public String[] array;
    ArrayList<String> cards = new ArrayList<String>();

    public Hand(String[] array) {
        cards.addAll(Arrays.asList(array));
    }


    public void addCard(String card) {
        cards.add(card);
    }

    public void removeCard(int position) {
        String chosenCard = cards.get(position);
        cards.remove(position);
    }

    public void removeCard(String card) {
        cards.remove(card);
    }

    public void gameStats() {
    }

    //figure this shit out
    public void printHand(){
        System.out.println(cards.size() + " cards:" + Arrays.asList(cards));
        for (String s: cards){
            s.charAt(0) =
            System.out.println(Card.class.getName());
        }
        }
    }

