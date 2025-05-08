package app;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment(1, "Have a nice trip!", "Jose", new Date());
        Comment c2 = new Comment(2, "Wow that's awesome!", "Lurdes", new Date());
        Comment c3 = new Comment(3, "Good night", "Marcos", new Date());
        Comment c4 = new Comment(4, "May the Force be with you", "Luciana", new Date());

        Post p1 = new Post("Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                sdf.parse("21/06/2018 13:05:44"),
                12);

        p1.addComent(c1);
        p1.addComent(c2);

        Post p2 = new Post("Good night guys",
                "See you tomorrow",
                sdf.parse("28/07/2018 23:14:19"),
                12);
        p2.addComent(c3);
        p2.addComent(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
