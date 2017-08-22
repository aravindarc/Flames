package com.example.aravi.flames;

/**
 * Created by aravi on 20-07-2017.
 */

public class NameStriker {
    int nameStrikerMethod(String boyName, String girlName )
    {
        char boyNameArray[] = boyName.toCharArray();
        char girlNameArray[] = girlName.toCharArray();
        int i = 0;
        int j = 0;
        int strikeCount = 0;
        while( i < boyName.length() )
        {
            j = 0;
            while( j < girlName.length() )
            {
                if( boyNameArray[ i ] == ' ' )
                {
                    //ignores white space
                }
                else if( boyNameArray[ i ] == girlNameArray[ j ] )
                {
                    girlNameArray[j] = '*';
                    strikeCount += 2;
                    j++;
                    break;
                }
                j++;
            }
            i++;
        }
        NameStriker counterObj = new NameStriker();
        int argument = ( counterObj.counter( boyName ) + counterObj.counter( girlName ) ) - strikeCount;
        return argument;
    }

    int counter( String name )
    {
        int i = 0;
        int count = 0;
        while( i < name.length() )
        {
            if( name.charAt( i ) != ' ' )
            {
                count++;
            }
            i++;
        }
        return count;
    }
}
