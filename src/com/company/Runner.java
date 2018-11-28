package com.company;

public class Runner {
    public static void main(String[] args) {
        String [][] face = new String[5][8];
        FaceDrawing face1 = new FaceDrawing(face);
        face1.fill("x");
        face1.edit("O", 1, 1);
        face1.edit("O", 1, 6);
        face1.edit("^", 2, 3);
        face1.edit("|", 3, 1);
        face1.edit("-", 3, 2);
        face1.edit("-", 3, 3);
        face1.edit("-", 3, 4);
        face1.edit("-", 3, 5);
        face1.edit("|", 3, 6);
        System.out.print(face1.toString());
    }
}
