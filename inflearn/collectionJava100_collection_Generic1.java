package collection;
// 제네릭(Generic)의 개념과 필요성에 대해서 예제 코드로 설명해보시오.
// 이 문제는 자바 문법중 제네릭에 대한 개념과 필요성에 대해서 알고 있는지를 묻는 문제이다.
// 모든 타입을 다 받는 클래스를 만들어보시오.


class Sample <T>{
    private T a;

    Sample(T x) {
        this.a = x;
    }

    public T getA() {
        return a;
    }
}


public class Java100_collection_Generic1 {
    public static void main(String[] args) {

        // 문자열 타입이 들어오는 경우
        Sample s1 = new Sample("안녕하세요~");

        System.out.println(s1.getA());

        // 정수형이 들어오는 경우
        Sample s2 = new Sample(100);

        System.out.println(s2.getA());

    }
}



























