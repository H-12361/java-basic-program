package Array;

public class linear_usings_string {
public static String HotelMenu(String[] menu, String key){
    for(int i=0; i<menu.length; i++){
        if(menu[i].equals(key))
            return String.valueOf(i);
    }
    return "not found in menu bar";

}
    public static void main(String[] args) {
        String menu[]={ "Dosha","burger","Pizza","Samosa","Chips","Cold drink","pasta"};
        String key ="Dosha";
        String index = HotelMenu(menu, key);
        if(index=="not found in menu bar" ){
            System.out.println("this element is not listed in hotel menu");
        }
        else{
            System.err.println("Your iteam is present in index of :"+""+index);
        }
    }
}