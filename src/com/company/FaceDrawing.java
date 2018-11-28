package com.company;

public class FaceDrawing {
    private String [][] arr;
    public FaceDrawing (String [][] arr)
    {
        this.arr = arr;
    }
    public void fill(String str)
    {
        for (int row = 0; row < arr.length; row ++)
        {
            for (int col = 0; col < arr[0].length; col++)
            {
                arr[row][col] = str;
            }
        }
    }
    public void edit(String replace, int row, int col)
    {
        arr[row][col] = replace;
    }
    public String toString()
    {
        String str = "";
        for (int row = 0; row < arr.length; row++)
        {
            for ( int col = 0; col < arr[0].length; col++)
            {
                if(arr[row][col].equals("x"))
                {
                    str += " ";
                } else {
                    str += arr[row][col];
                }
            }
            str += "\n";
        }
        return str;
    }

}
