package Practice.Map.HashMap;

public class hashMap_Ex {

    public static void main(String[] args) {

        System.out.println(simpleHash("Manish"));
        System.out.println(simpleHash("Rajeet"));
        System.out.println(simpleHash("Komal"));
        System.out.println(simpleHash("223"));
        System.out.println(simpleHash("423"));
        System.out.println(simpleHash("323"));

    }

    public static int simpleHash(String key){

        int sum = 0;

        for(char c : key.toCharArray()){
            sum+= c;
        }

        return  sum%15;
    }
}
