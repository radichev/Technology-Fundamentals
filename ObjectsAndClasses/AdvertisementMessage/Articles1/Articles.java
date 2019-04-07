package TechModule.ObjectsAndClasses.AdvertisementMessage.Articles1;


class Articles {// създаваме клас със статии от три стринга
    private String content;
    private String title;
    private String author;

    public Articles(String title, String content, String author) { // конструктора на класа от стринговете
        this.title = title;  //това е името на променливата
        this.content = content;
        this.author = author;

    }

    public void edit(String newContent) { // методите на класа
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s -%s:%s", this.title, this.content, this.author);
    }
}
