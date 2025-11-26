package poo;
public class Main {
    public static void main(String[] args){
      String text="aA aAaAaaaaA";
        text=text.toLowerCase();
      String text2="";
      for(int i=0; i<text.length();i++){
        if(text.charAt(i)>=97&&text.charAt(i)<=122){
          if(i!=0){
            text2+=" ";
          }
          text2+=getAlfabetPos(text.charAt(i))+"";
        }
      }
      System.out.println(text2);


    }
    public static int getAlfabetPos(char char1){
      return (int)(char1);
    }
    
}
