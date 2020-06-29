import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HashTag {

	static class Node {
		String s;
		Integer count;

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}

		public Integer getCount() {
			return count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Node(String s, Integer count) {
			super();
			this.s = s;
			this.count = count;
		}

		public int compareTo(Node o) {
			return this.getCount().compareTo(o.getCount());
		}

	}

	public static void main(String arr[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();

		String[] string = getHashTags(str);

		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}

	}

	private static String[] getHashTags(String str) {
		String[] array = str.split(" ");
		String[] newarray = new String[3];
		ArrayList<Node> list = new ArrayList<Node>();
		for (String s : array) {
			list.add(new Node(s, s.length()));
		}

		Comparator<Node> nameSorter = (a, b) -> b.getCount().compareTo(a.getCount());
		Collections.sort(list, nameSorter);

		int i = 0;
		for (Node node : list) {

			newarray[i] = "#" + node.getS();
			i++;
			if (i == 3) {
				break;
			}
		}
		return newarray;

	}

}
