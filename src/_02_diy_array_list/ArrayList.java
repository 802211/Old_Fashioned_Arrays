package _02_diy_array_list;

public class ArrayList<V> {

	V[] list;

	public ArrayList() {
		list = (V[]) new Object[0];
	}

	V[] newlist;

	public void add(V value) {

		newlist = (V[]) new Object[list.length + 1];
		for (int i = 0; i < list.length; i++) {

			newlist[i] = list[i];

		}

		newlist[list.length] = value;
		list = newlist;
	}

	public void remove(int l) {
		newlist = (V[]) new Object[list.length - 1];
		for (int k = 0; k < list.length - 1; k++) {
			if (k < l) {
				newlist[k] = list[k];
			} else if (k >= l) {
				newlist[k] = list[k + 1];
			} else {

			}
		}
		list = newlist;
	}

	public V get(int l) {

		return list[l];
	}

	public void addAt(int l, V value) {
		newlist = (V[]) new Object[list.length + 1];
		for (int j = 0; j < newlist.length; j++) {
			if (j < l) {
				newlist[j] = list[j];
			} else if (j == l) {
				newlist[j] = value;
			} else if (j > l) {
				newlist[j] = list[j - 1];
			}

		}

		list = newlist;

	}

	public void set(int l, V value) {
		newlist = (V[]) new Object[list.length];
		for (int n = 0; n < list.length; n++) {
			if (n == l) {
				newlist[n] = value;
			} else {
				newlist[n] = list[n];
			}
		}
		list = newlist;
	}

	public boolean contains(V value) {
		for (int m = 0; m < list.length; m++) {
			if (list[m] == value) {
				return true;
			}
		}

		return false;
	}
}
