package a09_클래스_정보은닉;

/**
 * 접근지정자(AccessModifier)
 * 
 * default		클래스가 위치하고 있는 패키지 내부(같은 패키지)
 * protected	기본 접근 권한은 default와 같다, 하지만 상속 관계를 가지면 다른 패키지에 있어도 접근을 허용한다.
 * public		모든 위치에서 접근이 가능하다.
 * private		본인 클래스 내부에서만 가능하다. 외부에서 접근할 수 없다.
 *
 */

public class AccessModifier {
	String name;
	int age;
	public String phone;
	private String address;
	
	public AccessModifier() {
		this.address = "부산";
	}
}
