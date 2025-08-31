package Assignment9;

import java.util.*;

public class Sort_Game {

	static class Employee {
		String name;
		int salary;

		Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();

		List<Employee> ll = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int salary = sc.nextInt();

			if (salary >= x) {
				ll.add(new Employee(name, salary));
			}
		}

		Collections.sort(ll, (a, b) -> {
			if (a.salary != b.salary) {
				return b.salary - a.salary;
			} else {
				return a.name.compareTo(b.name);
			}
		});

		for (Employee e : ll) {
			System.out.println(e.name + " " + e.salary);
		}

	}

}
