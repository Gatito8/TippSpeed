import java.awt.Color;
import java.util.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


public class TextControllerClass {
    static int c2;
    public static void GreenRedColorClass(){

        SimpleAttributeSet GreenColor = new SimpleAttributeSet();
        StyleConstants.setForeground(GreenColor, Color.green);
        StyledDocument ColorChanger1 = typingFrame.textpane1.getStyledDocument();
        SimpleAttributeSet RedColor = new SimpleAttributeSet();
        StyleConstants.setForeground(RedColor, Color.red);
        StyledDocument ColorChanger2 = typingFrame.textpane1.getStyledDocument();
        
        ArrayList<String> User_Words = new ArrayList<>();
        String Textarea1_Input = typingFrame.textarea1.getText();
        String[] Text_Words = Textarea1_Input.split("");
        String Text = typingFrame.textpane1.getText();
        String[] Text_Array = Text.split("");
        
        
        int c1 = 1;
        c2 = c1;
        for (String Word : Text_Words){
            User_Words.add(Word);
            System.out.format("\n--List : %s\n--List Size : %d\n", User_Words.toString() , User_Words.size());
            if (Word.equals(Text_Array[c1 - 1])){
                ColorChanger1.setCharacterAttributes(c1 - 1, 1 , GreenColor , false);
            }else{
                ColorChanger2.setCharacterAttributes(c1 - 1, 1 , RedColor , false);
            }
            c1++;
            c2++;
        }
        
    }
    public static void WhiteColorClass(){
        SimpleAttributeSet WhiteColor = new SimpleAttributeSet();
        StyleConstants.setForeground(WhiteColor, Color.white);
        StyledDocument ColorChanger1 = typingFrame.textpane1.getStyledDocument();
        
        ArrayList<String> User_Words = new ArrayList<>();
        String Textarea1_Input = typingFrame.textarea1.getText();
        String[] Text_Words = Textarea1_Input.split("");
        
        for (String Word : Text_Words){
            User_Words.add(Word);
            System.out.format("\n--List : %s\n--List Size : %d\n", User_Words.toString() , User_Words.size());
            ColorChanger1.setCharacterAttributes(c2 - 1, c2 , WhiteColor , false);
        }
        
    } 
}
