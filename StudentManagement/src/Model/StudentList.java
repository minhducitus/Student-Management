package Model;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	private List<Student> list = new ArrayList<>();
	
	public void addStudent(Student st) {
		list.add(st);
	}
	
	public void removeStudent(int code) {
		for (Student student : list) {
			if (student.getCode() == code) {
				list.remove(student);
				return;
			}
		}
	}
	
	public void updateStudent(int code) {
		for (Student student : list) {
			if (student.getCode() == code) {
				
			}
		}
	}
	
	public void sortByGrade() {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getGrade() > list.get(j).getGrade()) {
					Student dummy = list.get(i);
					list.set(i, list.get(j));
					list.set(j, dummy);
				}
			}
		}
	}
	
	public void sortByName() {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getName().compareTo(list.get(j).getName()) > 0) {
					Student dummy = list.get(i);
					list.set(i, list.get(j));
					list.set(j, dummy);
				}
			}
		}
	}
}
