import java.util.*;
public class Knapsack {
    public static void main(String[] args) {
        Item[] items = {new Item(10,4),new Item(20,10), new Item(15,5), new Item(2,1), new Item(8,2)};
        System.out.println(knapsack(items,10));
    }
    public static ArrayList<Item> knapsack(Item[] items, int capacity) {
        ArrayList<Item> result = new ArrayList<>();
        Arrays.sort(items);
        for(Item item: items) {
            System.out.println(item);
        }
        int sum = 0;
        for(Item item: items ) {
            result.add(item);
            sum+=item.getSecond();
            if(sum > capacity) {
                break;
            }
        }
        Item last = result.get(result.size() - 1);
        float difference = sum - capacity;
        float perc = (float)(last.getSecond()-difference)/last.getSecond();
        System.out.println(difference);
        result.remove(result.size() - 1);
        result.add(new Item(perc * last.getFirst(),perc * last.getSecond()));
        return result;
    }
}
class Item implements Comparable<Item>{
	float first;
	float second;
	float relation;
	public Item(float first, float second) {
		this.first = first;
		this.second = second;
		if(second != 0) {
			relation = first / second;
		}
		else{
			relation = first;
		}
	}
	public float getFirst(){
		return first;
	}
	public float getSecond(){
		return second;
	}
	public int compareTo(Item p){
		if(this.relation > p.relation) {
			return -1;
		}
		if(this.relation == p.relation) {
			return 0;
		}
		else{
			return 1;
		}
	}
	@Override
	public String toString() {
		return "[" + first + "," + second + "]";
	}
}