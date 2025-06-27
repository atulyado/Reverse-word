class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");//This split the string by the space
        StringBuilder result = new StringBuilder();
        
        for(String word : words){
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse().toString()).append(" ");//here we reverse the the sentece and change it back to the normal string and add space
        }
        return result.toString().trim(); //here change the sentence back to string remove the space at the end
    }
}
