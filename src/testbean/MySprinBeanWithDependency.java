package testbean;

import writer.IWriter;

public class MySprinBeanWithDependency {
    private IWriter writer;

    public void setWriter(IWriter writer){
        this.writer = writer;
    }

    public void run(){
        String s = "This is a test";
        writer.writer(s);
    }
}
