package com.company.learn;

public class TextFile extends File {

    private String text;

    public TextFile(Directory directory, String name, String text) {
        super(name, directory);
        this.text = text;
    }

    @Override
    public void setDirectory(Directory directory) {
        super.setDirectory(directory);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Directory getDirectory() {
        return super.getDirectory();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Текстовый файл " + getName() + " находящийся в " + getDirectory().getPath() +
                " содержит следующий текст: \n" +
                getText() ;
    }

}
