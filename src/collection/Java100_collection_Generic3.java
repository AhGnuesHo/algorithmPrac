package collection;
// 제네릭(Generic) 개념과 사용법을 예제 코드로 구현해보시오.
// 이 문제는 자바 문법중 제네릭에 대한 개념과 사용법에 대해서 알고 있는지를 묻는 문제이다.

class Sample_1 <T> {
    T param ;

    public Sample_1(T param) {
        this.param = param;
    }
}
public class Java100_collection_Generic3 {
    public static void main(String[] args) {

        // [1] : 객체 생성 --> String
        Sample_1 s1 = new Sample_1("안녕하세요~");

        // [2] : 객체 생성 --> Integer
        Sample_1 s2 = new Sample_1(100);
    }
}
