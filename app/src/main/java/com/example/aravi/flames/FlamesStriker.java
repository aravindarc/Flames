package com.example.aravi.flames;

/**
 * Created by aravi on 20-07-2017.
 */

public class FlamesStriker {

    public String flamesStrikerMethod(String boyName, String girlName )
    {
        int flamesArgument = 0;
        char flames[] = { 'F', 'L', 'A', 'M', 'E', 'S' };
        Node firstNode, p;
        Node temp;
        NameStriker nameStriker = new NameStriker();
        flamesArgument = nameStriker.nameStrikerMethod( boyName, girlName );
        p = firstNode = new Node();
        p.character = flames[0];
        for( int i = 1; i < 6; i++ )
        {
            p.next = new Node();
            p = p.next;
            p.character = flames[i];
        }

        p.next = firstNode;

        int count = 6;

        while( count > 0 )
        {
            for( int i = 0; i < flamesArgument-1; i++ )
                p = p.next;

            p.next = p.next.next;
            count --;
        }

        if( flamesArgument == 0 || boyName == "" || girlName == ""  )
            return ("NO NAMES");
        else if( p.character == 'F' )
            return ("FRIENDS");
        else if( p.character == 'L' )
            return ("LOVE");
        else if( p.character == 'A' )
            return ("AFFECTION");
        else if( p.character == 'M' )
            return ("MARRIAGE");
        else if( p.character == 'E' )
            return ("ENEMIES");
        else if( p.character == 'S' )
            return ("SIBLINGS");

        return "ERROR";
    }
}
