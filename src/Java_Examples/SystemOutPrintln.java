package Java_Examples;

public class SystemOutPrintln {
    public static void main(String[] args) {
        //숫자를 출력할 수 있으며, 숫자를 출력할 때는 큰 따옴표로 묶지 않아도 된다.
        System.out.println(7);
        System.out.println(3.14);

        //함께 이어서 출력할 대상을 + 기호로 묶을 수 있다.
        System.out.println("3 + 5 = " + 8);
        System.out.println(3.14 + "는 실수입니다.");
        System.out.println("3 + 5" + "의 연산 결과는 8입니다.");

        //수식을 큰 따옴표로 묶지 않으면, 덧셈이 진행 되어 덧셈의 결과인 8을 출력 하는 것을 알 수 있고,
        //+ 기호가 덧셈 연산을 하는 사실도 파악할 수 있다.
        System.out.println(3 + 5);
    }
}
