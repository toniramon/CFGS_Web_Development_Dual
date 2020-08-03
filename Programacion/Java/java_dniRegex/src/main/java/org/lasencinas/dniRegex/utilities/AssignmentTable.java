package org.lasencinas.dniRegex.utilities;

public class AssignmentTable {

    char[] table = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
            'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    char[] nieFirstLetter = {'0', '1', '2'};


    public char getLetter(int position){
        return this.table[position];
    }

    public char getNieFirstLetterValue(int position){
        return this.nieFirstLetter[position];
    }

    public int getDniModule(){
        return this.table.length;
    }

    public int getNieModule(){
        return this.table.length;
    }

}
