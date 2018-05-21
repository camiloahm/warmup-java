package com.pie;

class RemoveCharacters {

    public static void main(String args[]) {

        RemoveCharacters removeCharacters = new RemoveCharacters();
        System.out.println(removeCharacters.removeCharacters("camilo", "milo"));
        System.out.println(removeCharacters.removeCharacters("camilo is taking an interview", "ai"));

    }


    public String removeCharacters(String stg, String remove) {

        char[] stgArray = stg.toCharArray();
        char[] removeArray = remove.toCharArray();
        boolean[] asciiRemove = new boolean[128];

        for (int i = 0; i < removeArray.length; i++) {
            int letter = removeArray[i];
            asciiRemove[letter] = true;
        }

        int newStringCount = 0;
        char[] finalString = new char[stg.length()];

        for (int j = 0; j < stgArray.length; j++) {
            int position = stgArray[j];
            if (!asciiRemove[position]) {
                finalString[newStringCount] = stgArray[j];
                newStringCount++;
            }
        }

        return new String(finalString, 0, newStringCount);

    }

}