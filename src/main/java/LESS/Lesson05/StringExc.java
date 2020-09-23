package LESS.Lesson05;

public class StringExc {
    public static void main (String[] args) {
        String str = "Hello world!! lolo dsfsdfsdf lo dfgfgxcg lo";
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='l')
                cnt++;

        }
        System.out.println(cnt);
        System.out.println("******************************");
        int count = 0;
        /*Моя версия
        for (int i = 0; i< str.length(); i++) {
            i = str.indexOf("lo",i);
            if(i==-1)
                break;
            count++;

        }*/
        //Оптимальная версия
        int index = str.indexOf("lo");
        while(index!=-1){
            count++;
            index = str.indexOf("lo",index+=1);
        }
        System.out.println(count);
    }
}
