import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap {
	Bucket[] buckets = new Bucket[1000];
	int size = 1000;

	public MyHashMap() {
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new Bucket();
		}
	}

	public void put(int key, int value) {
		Bucket bucket = buckets[key % size];
		for (MapEntry e : bucket.getEntries()) {
			if (e.key == key) {
				e.value = value;
				return;
			}
		}

		bucket.entries.add(new MapEntry(key, value));
	}

	public int get(int key) {
		Bucket bucket = buckets[key % size];
		for (MapEntry e : bucket.getEntries()) {
			if (e.key == key)
				return e.value;
		}
		return -1;
	}

	public void remove(int key) {
		Bucket bucket = buckets[key % size];
		Iterator<MapEntry> it = bucket.getEntries().iterator();
		while (it.hasNext()) {
			MapEntry entry = it.next();
			if (entry.key == key) {
				it.remove();
			}
		}
	}
}

class MapEntry {
	int key;
	int value;

	public MapEntry(int x, int y) {
		key = x;
		value = y;
	}
}

class Bucket {
	List<MapEntry> entries;

	public Bucket() {
		entries = new LinkedList<>();
	}

	public List<MapEntry> getEntries() {
		return entries;
	}

	public void addEntry(MapEntry entry) {
		this.entries.add(entry);
	}

	public void removeEntry(MapEntry entry) {
		this.entries.remove(entry);
	}
}
