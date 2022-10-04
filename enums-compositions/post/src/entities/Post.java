package entities;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Post {
    private Date date;
    private String title;
    private String content;
    private Integer likes;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH::mm::ss");

    private List<Comment> comments = new ArrayList<>();


    public Post(Date date, String title, String content, Integer likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComments(Comment comment){
        comments.add(comment);
    }

    public void removeComments(entities.Comment comment){
        comments.remove(comment);
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title);
        sb.append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(date));
        sb.append("\n");
        sb.append(content);
        sb.append('\n');
        sb.append("Comments:");
        sb.append('\n');
        for (Comment c : comments) sb.append(c.getText()).append('\n');
        return sb.toString();
    }
}
