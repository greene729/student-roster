/*
 * Repositories are also part of the Model as they help
 * build and structure the data we're using.
 * 
 * We will be using these in conjunction with
 * databases in the future (which also fit into the
 * Model section)
 * 
 */

package org.wecancodeit.studentroster.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.wecancodeit.studentroster.model.Student;

@Repository
public class StudentRepository {
	
	private Map<Long, Student> students = new HashMap<>();

	public StudentRepository() {
		add(new Student(1L, "Max", "maxmraz", "Cinammon"));
		add(new Student(2L, "Kelli", "kellimk", "Oatmeal"));
		add(new Student(3L, "Thomas", "ttrain1", "Kool-aid"));
		add(new Student(4L, "Tre", "kingboolean89", "Ribs"));
	}

	public int size() {
		return students.size();
	}

	public void add(Student student) {
		students.put(student.getId(), student);
	}

	public Student findOne(Long id) {
		return students.get(id);
	}

	public Collection<Student> findAll() {
		return students.values();
	}
	
	
}
