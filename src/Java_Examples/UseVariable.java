package Java_Examples;

public class UseVariable {
    public static void main(String[] args) {
        //int로 변수 선언을 하였으니, 이 변수에는 정수를 저장할 수 있다.
        int num1;

        //수학에서는 '같음'을 표기할 때 '='기호를 사용한다.
        // 그러나 자바에서는 오른쪽 피연산자를 왼쪽에 저장하라는 의미로 이 기호가 사용된다.
        num1 = 10;

        //변수를 선언과 동시에 초기화하는 방법이다.
        int num2 = 20;

        //선언과 동시에 초기화를 진행하고 있으며, num1, num2의 덧셈결과로 초기화를 진행하고 있다.
        //이처럼 초기화의 대상은 숫자뿐만 아니라 연산의 결과도 될 수 있다.
        int num3 = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + num3);     //출력 결과 : 10 + 20 = 30
    }
}
