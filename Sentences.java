// Program randomly generates sentences.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sentences extends JFrame {
private JTextArea display;

// set up GUI and create sentence
public Sentences()
{
String article[] = { "the ", "a ", "one ", "some ", "any " },
adjective[] = { "blue ", "red ", "thin ", "pretty ", "cold " },
adverb[] = { "about ", "abroad ", "almost ", "already ", "altogether " },
conjunction[] = { "for ", "and ", "nor ", "but ", "or " },
common[] = { "Bill ", "Austin ", "Amanda ", "George ", "Chrystal " },
noun[] = { "man", "woman", "cat", "city", "truck" },
verb[] = { " ran", " swam", " drove", " walked", " skipped" },
preposition[] =
{ " to ", " from ", " over ", " under ", " on " };

display = new JTextArea( 10, 30 );

// randomly create sentence
for ( int j = 1; j <= 10; j++ ) {
int article1 = ( int )( Math.random() * 5 );
int noun1 = ( int )( Math.random() * 5 );
int verb1 = ( int )( Math.random() * 5 );
int preposition2 = ( int )( Math.random() * 5 );
int common1 = ( int )( Math.random() * 5 );
int adverb1 = ( int )( Math.random() * 5 );
int adjective1 = ( int )( Math.random() * 5 );
int conjunction1 = ( int )( Math.random() * 5 );
StringBuffer buffer = new StringBuffer();

// concatenate words and add period
buffer.append( article[ article1 ] + noun[ noun1 ] +
verb[ verb1 ] + preposition[ preposition2 ] +
common[ common1 ] + adverb[ adverb1 ] + adjective[ adjective1 ] + conjunction[ conjunction1 ] + ".\n" );

// capitalize first letter
buffer.setCharAt(
0, Character.toUpperCase( buffer.charAt( 0 ) ) );
display.append( buffer.toString() );
}

Container container = getContentPane();
container.add( display );

setSize( 300, 400 ); // set the window size
setVisible( true ); // show the window
}

// execute application
public static void main( String args[] )
{
Sentences application = new Sentences();
application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
}

} // end class Sentences