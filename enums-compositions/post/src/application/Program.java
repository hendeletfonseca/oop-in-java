package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH::mm::ss");

        Comment c1 = new Comment("Have a nice trip");

        Post p1 = new Post(
                sdf.parse("02/10/2022 10:52:00"),
                "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);

        Comment c2 = new Comment("Wow that's awesome!");

        p1.addComments(c1);
        p1.addComments(c2);
    }
}
