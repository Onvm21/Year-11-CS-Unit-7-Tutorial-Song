import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;

    private ArrayList<String> people = new ArrayList();

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public String getTitle(){return title;}

    public String getArtist(){return artist;}


    public int howMany(ArrayList<String> a){
        int count = 0;
        int length = a.size();
        for(int i = 0; i<length; i++) {
            String word = a.get(i);
            word.toLowerCase();

            if(!people.contains(word)){
                count += 1;
                people.add(word);
            }else{
                count = count;
            }

        }
        return count;
    }



}
