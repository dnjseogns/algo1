public class Main {
    public static void main(String[] args){
        System.out.println("haha");
        System.out.println(new Main().solution(40));
    }
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
}
