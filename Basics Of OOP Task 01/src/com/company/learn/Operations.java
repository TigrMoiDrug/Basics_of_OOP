package com.company.learn;

public class Operations {

    private TextFile textFile;

    public Operations (TextFile textFile){
        this.textFile = textFile;
    }

    public void setTextFile(TextFile textFile) {
        this.textFile = textFile;
    }

    public TextFile getTextFile() {
        return textFile;
    }

    public void rename (String newName){
        textFile.setName(newName);
    }

    public void delete (){
        textFile = null;
    }

    public void readTextFile (){
        System.out.println(textFile.getText());
    }

    public void addText (String newText){
        textFile.setText(textFile.getText().concat(newText));
    }
}
