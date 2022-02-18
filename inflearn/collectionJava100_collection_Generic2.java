package collection;
// 컴파일 단계에서는 에러가 안나고, 실행 단계에서 ClassCast 오류가 발생하는 상황을 만들어보시오.
// 이 문제는 제네릭의 필요성을 보여주는 예를 코드로 설명할 수 있는지를 묻는 문제이다.


class Person {
	// Field
	public Object obj;
	
	// Constructor
	Person( Object obj ) { this.obj = obj; }
}

class Student {
	// Field
	public int grade;
	
	// Constructor
	Student( int grade ) { this.grade = grade; }
}

class Teacher {
	// Field
	public int grade;
}

public class Java100_collection_Generic2 {
	public static void main(String[] args) {
		
		// [1] : 객체 생성
		Person p1 = new Person( new Student(1) );
		System.out.println( p1.obj );
		
		// [2] : 형변환 --> Cast
		Teacher t1 = (Teacher)p1.obj;  // 이 부분은 컴파일 단계에서는 에러가 안나고, 실행하는 단계에서 ClassCast 오류가 발생한다.
				
	}
}







