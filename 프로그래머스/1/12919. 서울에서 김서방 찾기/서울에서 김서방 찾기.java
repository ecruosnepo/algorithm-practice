class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int indexOfKim = 0;
        
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                indexOfKim = i;
            }
        }
        
        answer = "김서방은 " + indexOfKim +"에 있다";
        
        return answer;
    }
}