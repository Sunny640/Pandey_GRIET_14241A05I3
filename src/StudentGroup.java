import java.util.Date;
import java.util.Scanner;
import java.util.*;
import Student.java;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		//r implementation here
                return students;
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
                Scanner sc=new Scanner(System.in);
                int i=0;
                if(students==null)
                    throw new IllegalArgumentException();
                else
                    for(i=0;i<students.length;i++)
                        students[i]=sc.next();
                }
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
                if(index<0||index>=students.length)
                    throw new IllegalArgumentException();
                return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(students==null)
                    throw new IllegalArgumentException();
		if(index<0||index>=students.length)
                    throw new IllegalArgumentException();
                this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
                    throw new IllegalArgumentException();
		else
		List<Student> ll=new LinkedList<Student>();
			ll.addFirst(student);
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
                    throw new IllegalArgumentException();
		else
		List<Student> ll=new LinkedList<Student>();
			ll.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		int i,int j;
		for(i=0;i<students.length;i++){
			for(j=1;j<n-i-1;j++){
				if(a[j]<a[i]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
			}		
			}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		Date d=new Date();
		if(indexOfStudent==0)
			throw new IllegalArgumentException();
		Student s=students[indexOfStudent];
		int curage=d.getDate()-s.getBirthDate();
		return curage;
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		Date d=new Date();
		ArrayList<Student> a1=new ArrayList<Student>();
		for(i=1;i<students.length;i++){
			if((d.getDate()-students[i].getBirthDate())==age)
				a1.put(students[i]);
				
		}
		return a1;
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int i; ArrayList<Student> s1=new ArrayList<Student>(); 
		double Max=student[0].getavgMark();
		for(i=1;i<students.length;i++){
			if(students[i]>Max)
				Max=students[i].avgMark;
		}
		for(i=0;i<students.length;i++){
			if(students[i].getavgMark()==Max)
				s1.put(i);
			}
		return s1;
				
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
                    throw new IllegalArgumentException();
                TreeMap<Student,Integer> ts=new TreeMap<Student,Integer>();
                for(i=0;i<students.length;i++)
                    ts.add(students[i],i);
                ts.getHigherKey(student);
		return null;
	}
}
