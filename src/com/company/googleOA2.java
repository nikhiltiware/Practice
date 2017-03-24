package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Nikhil on 2/13/17.
 */
public class googleOA2 {

    //    public static void main(String args[])
//    {
//        pathCount("dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n  file1.txt\ndir2\n file2.gif");
//    }
    public int pathCount(String str) {
        String parts[] = str.split("\n");
        String allImagePaths = "";
        int max = 0, imageMax = 0, addTotal = 0;

        for (int i = 0; i < parts.length; i++) {
            String currentImagePath = "";
            if (parts[i].endsWith(".jpeg") || parts[i].endsWith(".png") || parts[i].endsWith(".gif")) {
                int j = i;
                do {
                    int currentSpaces = parts[j].length() - parts[j].trim().length();
                    int prevSpaces = parts[j - 1].length() - parts[j - 1].trim().length();
                    if (currentSpaces > prevSpaces) {
                        currentImagePath = "/" + parts[--j].trim() + currentImagePath;

                        if (currentSpaces == 0 || prevSpaces == 0) {
                            String totalImage = currentImagePath + "/" + parts[i].trim();

                            addTotal = addTotal + totalImage.length();
                        }
                    }
                    j--;
                }
                while (j > 0);
                if (!allImagePaths.endsWith(currentImagePath)) {
                    allImagePaths += currentImagePath;
                }
            }

        }

        return allImagePaths.length();
//
    }

    public void pathCount2(String str) {
        String parts[] = str.split("\n");
        String unqAbsImgPaths = "";
        int max = 0, imageMax = 0, addTotal = 0;

        for (int i = 0; i < parts.length; i++) {
            String absImgPath = "";
            if (parts[i].endsWith(".jpeg") || parts[i].endsWith(".png") || parts[i].endsWith(".gif") || parts[i].endsWith(".jpg")) {
                int j = i;
                do {
                    int spacesCurr = parts[j].length() - parts[j].trim().length();
                    int spacesPrev = parts[j - 1].length() - parts[j - 1].trim().length();
                    if (spacesCurr > spacesPrev) {
                        absImgPath = "/" + parts[--j].trim() + absImgPath;
                        System.out.println(absImgPath);
                        if (spacesCurr == 0 || spacesPrev == 0) {
                            String totalImage = absImgPath + "/" + parts[i].trim();
                            addTotal = addTotal + totalImage.length();
                            if (totalImage.length() > imageMax)
                                imageMax = totalImage.length();
                            if (absImgPath.length() > max)
                                max = absImgPath.length();
                            break;
                        }
                    }
                    j--;
                }
                while (j > 0);
                if (!unqAbsImgPaths.endsWith(absImgPath)) {
                    unqAbsImgPaths += absImgPath;
                }
            }

        }

        System.out.println("Longest image path to root :- " + max);
        System.out.println("Longest image path to image :- " + imageMax);
        System.out.println("Total image path to root :- " + unqAbsImgPaths.length());
        System.out.println("Total image path to root :- " + addTotal);
    }

    public static int printSum(String s) {
        String[] arr = s.split("\n");
        int sum = 0, spaces = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            String line = arr[i];
            if (line.contains(".gif") || line.contains(".jpeg") || line.contains(".png")) {
                spaces = line.length() - line.trim().length();
            }
            if (spaces > line.length() - line.trim().length()) {
                sum += line.trim().length() + 1;
                spaces--;

                sum++;
            }
        }
        return sum;
    }

    public int lengthLongestPath(String S) {
        String[] splits = S.split("\n");
        int[] array = new int[splits.length + 1];
        int max = 0;
        for (String s : splits) {
            int lev = s.lastIndexOf(" ") + 1;
            array[lev + 1] = array[lev] + s.length() - lev + 1;

            if (s.contains(".jpeg") || s.contains(".png") || s.contains(".gif"))
                max = Math.max(max, array[lev]);
        }
        return max;
    }

    private int countLevel(String s) {
        String cur = s.replaceAll(" ", "");
        return s.length() - cur.length();
    }

    public int lengthPath(String input) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 0);
        int result = 0;
        for (String s : input.split("\n")) {
            int level = s.lastIndexOf(' ') + 1;
            int len = s.length() - level + 1;
            if (s.contains(".jpeg") || s.contains(".png") || s.contains(".gif")) {
                result = Math.max(result, hashMap.get(level));
            } else {
                hashMap.put(level + 1, hashMap.get(level) + len + 1);
            }
        }
        return result;
    }


}

