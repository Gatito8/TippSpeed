import javax.swing.*;


public class settingClass extends typingFrame{
    
    private String text = "";
    public static int Sec = 0;
    
    
    
    public void SecondFrame() throws InterruptedException{
        typingFrame TextFrame = new typingFrame ();
        TextFrame.setVisible(true);
        TextFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    
    public void Timer(int typeduration){
        switch (typeduration) {
            case 0:
                Sec = 30;
                break;
            case 1:
                Sec = 60;
                break;
            case 2: 
                Sec = 120;
                break;
            default:
                Sec = 30;
                break;
        }
    }
    
    
    public void TextCreatation(boolean uppercase , boolean lowercase, 
                               boolean numbers , boolean marks, 
                               boolean traps){   
        if (uppercase){
           text = text + "DEUTSCHLAND IST EIN LAND VOLLER GESCHICHTE\n";
        }
        if (lowercase){
            text = text + "und seine städte sind lebendig und bunt\n";
        }
        if (numbers){
            text = text + "seit dem jahr 2005 hat sich vieles verändert\n";
        }
        if (marks){
            text = text + "! bitte achte auf jedes detail\n";
        }
        if (traps){
            text = text + "^~^ manchmal tippe ich zu nschnel und vergesse buchstaben\n";
        }
        textpane1.setText(text);

    }
    
    public void TextCreatation (int difficulty){
        switch (difficulty){
            case 1:
                text = text + "DEUTSCHLAND IST EIN LAND VOLLER GESCHICHTE\n";
                text = text + "und seine städte sind lebendig und bunt\n";
                break;
            case 2:
                text = text + "DEUTSCHLAND IST EIN LAND VOLLER GESCHICHTE\n";
                text = text + "und seine städte sind lebendig und bunt\n";
                text = text + "seit dem jahr 2005 hat sich vieles verändert\n";
                text = text + "! bitte achte auf jedes detail\n";
                break;
            case 3:
                text = text + "DEUTSCHLAND IST EIN LAND VOLLER GESCHICHTE\n";
                text = text + "und seine städte sind lebendig und bunt\n";
                text = text + "seit dem jahr 2005 hat sich vieles verändert\n";
                text = text + "! bitte achte auf jedes detail\n";
                text = text + "^~^ manchmal tippe ich zu nschnel und vergesse buchstaben\n";
                break;
            default:
                text = text + "DEUTSCHLAND IST EIN LAND VOLLER GESCHICHTE\n";
                text = text + "und seine städte sind lebendig und bunt\n";
                break;
        }
        textpane1.setText(text);
    
    }
    

}
