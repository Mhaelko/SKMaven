package LESS.Lesson05;

public class StringsL {
    public static void main(String[] args) {
        String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};
        cutTrack(tracks);
        flipStr("first");
        String str = "Ivan_Ivanov";
        String [] parts = str.split("_");
        String firstName = parts[0];
        String secondName = parts[1];
        String strDemo2 = "           Ivan  , Ivanov  ";
        String [] parts2 = strDemo2.split(",");
        String firstName2 = parts2[0].trim();
        String secondName2 = parts2[1].trim();
        System.out.println(firstName2 + " " + secondName2);
        System.out.println(countSymb("wwwwww","ww"));

    }
    
    public static void cutTrack(String [] tracks){
        for (int i = 0; i < tracks.length; i++) {
            int trackNum = Integer.parseInt(cutLastDigits4(tracks[i]));
            if(trackNum>=10 && trackNum <=15)
                System.out.println(tracks[i]);
        }
    }

    public static String cutLastDigits(String track) {
        return track.substring("track_".length());
    }
    public static String cutLastDigits2(String track) {
        int ind = track.indexOf("_");
        return track.substring(ind+1);
    }
    public static String cutLastDigits3(String track) {
        int ind = track.length()- 2;
        return track.substring(ind);
    }
    public static String cutLastDigits4(String track) {
        //return track.replaceAll("track_","");
        return track.replaceFirst("track_","");
    }
    public static void flipStr (String str) {
        char[] tmp = str.toCharArray();
        for (int i = 0, j = tmp.length - 1; i < j; i++, j--) {
            char t = tmp[i];
            tmp[i] = tmp[j];
            tmp[j] = t;
        }
        System.out.println(tmp);
    }
    public static int countSymb(String str, String sub){
        int cnt=0;
      //  if(str.length()))
            cnt++;
        return cnt;
    }

}
