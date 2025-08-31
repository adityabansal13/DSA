package Assignment9;

public class test {

	public static void main(String[] args) {
		
	}

}

//Longest Consecutive Sequence
//public static void main(String[] args) {
//		int[] arr = { 100, 4, 200, 1, 3, 2 };
//		HashMap<Integer, Boolean> map = new HashMap<>();
//		for (int i = 0; i < arr.length; i++) {
//			if (map.containsKey(arr[i] - 1)) {
//				map.put(arr[i], false);
//			} else {
//				map.put(arr[i], true);
//			}
//			if (map.containsKey(arr[i] + 1)) {
//				map.put(arr[i] + 1, false);
//			}
//		}
//		int ans = 0;
//		for (int key : map.keySet()) {
//			if (map.get(key)) {
//				int count = 0;
//				while (map.containsKey(key)) {
//					count++;
//					key++;
//				}
//				ans = Math.max(ans, count);
//			}
//		}
//		System.out.println(ans);
//	}

//Intersection of two Arrays i
//public static void main(String[] args) {
//	int[] arr1 = { 4, 9, 5 };
//	int[] arr2 = { 9, 4, 9, 8, 4 };
//
//	HashMap<Integer, Integer> map = new HashMap<>();
//	HashSet<Integer> set = new HashSet<>();
//
//	for (int i = 0; i < arr1.length; i++) {
//		set.add(arr1[i]);
//	}
//	ArrayList<Integer> ll = new ArrayList<>();
//	for (int i = 0; i < arr2.length; i++) {
//		if (set.contains(arr2[i])) {
//			ll.add(arr2[i]);
//			set.remove(arr2[i]);
//		}
//	}
//	int[] ans = new int[ll.size()];
//	for (int i = 0; i < ans.length; i++) {
//		ans[i] = ll.get(i);
//	}
//	for (int i = 0; i < ans.length; i++) {
//		System.out.print(ans[i] + " ");
//	}
//	
//}

//Intersection of two Arrays ii
//public static void main(String[] args) {
//	int[] arr1 = { 4, 9, 5 };
//	int[] arr2 = { 9, 4, 9, 8, 4 };
//
//	HashMap<Integer, Integer> map = new HashMap<>();
//
//	for (int i = 0; i < arr1.length; i++) {
//		if (map.containsKey(arr1[i])) {
//			int v = map.get(arr1[i]);
//			map.put(arr1[i], v + 1);
//		} else {
//			map.put(arr1[i], 1);
//		}
//	}
//	ArrayList<Integer> ll = new ArrayList<>();
//
//	for (int i = 0; i < arr2.length; i++) {
//		if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
//			ll.add(arr2[i]);
//			int v = map.get(arr2[i]);
//			map.put(arr2[i], v - 1);
//		}
//	}
//	int[] ans = new int[ll.size()];
//	for (int i = 0; i < ans.length; i++) {
//		ans[i] = ll.get(i);
//	}
//
//	for (int i = 0; i < ans.length; i++) {
//		System.out.print(ans[i] + " ");
//	}
//
//}

//Minimum sum pair
//public static void main(String[] args) {
//	int[] arr = { 2, 2, 3, 3, 4 };
//	PriorityQueue<Integer> pq = new PriorityQueue<>();
//	int sum = 0;
//	for (int i = 0; i < arr.length; i++) {
//		pq.add(arr[i]);
//	}
//	while (!pq.isEmpty()) {
//		int a = pq.poll();
//		int b = pq.poll();
//		sum += a + b;
//		if(pq.isEmpty()) {
//			break;
//		}
//		pq.add(a + b);
//	}
//	System.out.println(sum);
//}
