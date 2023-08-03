package programmers.highScore.sort.K번째수;

import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //답을 리턴할 answer이라는 함수
        int[] answer = new int[commands.length];

        //1. array에 있는 숫자를 i-1~j-1번까지 자른다
        //그러기 위해서는 commands배열안에 있는걸 하나하나 해나가면 된다. 추가로 많이 쓰일 것 같은 변수들은 따로 정리 해뒀다. k j l 로
        for(int i=0; i<commands.length; i++){
            int k = commands[i][1];
            int j = commands[i][0];
            int l = commands[i][2];
            //이렇게 하면 일단 배열은 완성함
            int [] answer2 = new int[k-j+1];
            //이제 잘라넣을 것들을 하나하나 넣는다.
            for(int h=0; h<answer2.length;h++){
                answer2[h] = array[j-1+h];
            }
            Arrays.sort(answer2);
            answer[i] = answer2[l-1];
        }
        return answer;
    }
}
