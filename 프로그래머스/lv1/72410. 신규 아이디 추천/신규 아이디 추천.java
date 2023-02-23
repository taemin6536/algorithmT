class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^0-9a-z-_.]","");
        new_id = new_id.replaceAll("[.]+",".");
        if (new_id.startsWith(".")){
            new_id = new_id.substring(1);
        }
        if (new_id.endsWith(".")){
            new_id = new_id.substring(0,new_id.length()-1);
        }
        if (new_id.isEmpty()){
            new_id += "a";
        }
        if (new_id.length() >= 16){
            new_id = new_id.substring(0,15);
            if (new_id.endsWith(".")){
                new_id = new_id.substring(0,new_id.length()-1);
            }
        }
        if (new_id.length() <= 2){
            while (!(new_id.length() >= 3)){
                char c = new_id.charAt(new_id.length() - 1);
                new_id += c;
            }
        }

        return answer = new_id;
    }
}