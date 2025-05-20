package com.divya.demo.core.util.structuraldp.compositeDP;

public class CompositeClient {

    public static void main(String[] args) {
        FileSystem fs1 = new File("Border");
        FileSystem fs2 = new File("Hulchal");
        FileSystem fs3 = new File("Hungama");

        /*FileSystem fs4 = new Directory("ComedyMovies", List.of(fs2,fs3));
        Directory directory = new Directory("Movies",List.of(fs4));*/
        Directory directory = new Directory();
        directory.directoryName = "Movies";
        directory.add(fs1);
        Directory directory1 = new Directory();
        directory1.directoryName = "ComedyMovies";
        directory1.add(fs2);
        directory1.add(fs3);

        directory.add(directory1);


        directory.ls();

    }
}
