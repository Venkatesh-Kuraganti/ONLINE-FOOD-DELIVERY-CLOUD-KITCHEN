import java.util.Scanner;
class pro {
    int result=0;
    int [] price2;
    int numberOfItems;
    String [] item_name;
    int[] item_price;
    String []arr;
    Scanner sc= new Scanner(System.in);
    public void login(){
        System.out.println("Who are you?");
        System.out.println("Click 1 if you are admin");
        System.out.println("Click 2 if you are user");
        int log=sc.nextInt();
        if (log==1){
            System.out.println("Enter the password:");
            int pass=sc.nextInt();
            if (pass==6789){
                System.out.println("Yes you are an admin and you can add an item");
                add_item();
            }
            else{
                System.out.println("Wrong password");
                login();
            }
        }
        else if(log==2){
            System.out.println("you are not an admin ");
            menu();
        }
        else{
            System.out.println("Enter the correct option");
        }
    }
    public void menu(){
        System.out.println("click 1 to order SOUPS");
        System.out.println("click 2 to order STARTERS");
        System.out.println("click 3 to order BIRIYANI");
        System.out.println("click 4 to order FAST FOODS");
        System.out.println("click 5 to show DESSERTS");
        System.out.println("click 6 to show DRINKS");
        System.out.println("click 7 to order SIDES");
        System.out.println("click 8 to add an item");
        System.out.println("click 9 to see added items");
        System.out.println("click 10 to get bill");
        System.out.print("Enter your Option: ");
        logic();
    }
    public void logic(){
        int mo;
        mo = sc.nextInt();
        if (mo==1){
            soups();
        }
        else if (mo==2){
            Starters();
        }
        else if (mo==3){
            Biriyani();
        }
        else if (mo==4){
            Fastfoods();
        }
        else if (mo==5){
            desserts();
        }
        else if(mo==6) {
            drinks();
        }
        else if (mo==7){
            sides();
        }
        else if (mo==8){
            System.out.println("If you want to add an item first you should login as admin");
            login();
        }
        else if(mo==9){
            items(item_price,item_name,numberOfItems);
        }
        else if (mo==10){
            bill(result);
        }
        else{
            System.out.println("Entered wrong number");
            menu();
        }
    }
    public void soups(){
        System.out.println("Welcome to SOUPS Section");
        System.out.print("Serial number"+"\t\t\t\t\t\t"+"Starters"+"\t\t\t\t\t\t\t\t"+"prices\n");
        arr= new String[]{"VEG CORN SOUP       ", "TOMATO SOUP          ", "LEMON CORIANDER SOUP", "MANCHOW SOUP        ", "CHICKEN CORN SOUP   ", "CHICKEN SPINACH SOUP", "CHICKEN THAI SOUP    "};
        price2= new int[]{70, 70, 70, 80, 100, 100, 100};
        int al=arr.length;
        int bl=0;
        for(int i=0;i<al ;i++){
            bl=bl+1;
            System.out.printf("%d\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t%d\n",bl,arr[i],price2[i]);
        }
        calc(price2);
    }
    public void Starters(){
        System.out.println("Welcome to STARTES Section");
        System.out.print("Serial number"+"\t\t\t\t\t\t"+"Starters"+"\t\t\t\t\t\t"+"  prices\n");
        String[]arr= {"PANEER 65   ","BROCDI TIKKI","CHILLI MUSHROOM","CHILLI CHICKEN","CHICKEN 65   ","FISH FRY     ","PRAWN 65     "};
        price2= new int[]{100, 90, 100, 100, 130, 150, 180};
        int al=arr.length;
        int bl=0;
        for(int i=0;i<al ;i++){
            bl=bl+1;
            System.out.printf("%d\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t%5d\n",bl,arr[i],price2[i]);
        }
        calc(price2);
    }
    public void Biriyani(){
        System.out.println("Welcome to BIRIYANI Section");
        System.out.print("Serial number"+"\t\t\t\t\t\t"+"Biriyani"+"\t\t\t\t\t\t\t\t\t"+"prices\n");

        String []arr= {"VEG BIRIYANI              ","CHICKEN DUM BIRIYANI      ","AVAKAYA CHICKEN BIRIYANI","PANEER KAJU BIRIYANI     ","MUSHROOM BIRIYANI         ","MUTTON FRY BIRIYANI      ","PRAWNS FRY BIRIYANI       ","FISH BIRIYANI            "};
        price2=new int[]{150,190,240,220,180,250,250,250};
        int al=arr.length;
        int bl=0;
        for(int i=0;i<al ;i++){
            bl=bl+1;
            System.out.printf("%d\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t%5d\n",bl,arr[i],price2[i]);
        }
        calc(price2);
    }
    public void Fastfoods() {
        System.out.println("Welcome to Fast Food Section");
        System.out.print("Serial number" + "\t\t\t\t\t\t" + "Starters" + "\t\t\t\t\t\t\t" + "prices\n");
        String[] arr = {"VEG MANCHUIA      ", "VEG NOODLES      ", "CHICKEN MANCHURIA","CHICKEN NOODELS   ","FRIED RICE      ","CHICKEN BURGER   ","CHICKEN ROLL    ","CHICKEN SANDWICH"};
        price2 = new int[]{80, 80, 110, 110, 100, 100, 100, 80};
        int al = arr.length;
        int bl = 0;
        for (int i = 0; i < al; i++) {
            bl = bl + 1;
            System.out.printf("%d\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t%5d\n", bl, arr[i], price2[i]);
        }
        calc(price2);
    }
    public void desserts(){
        System.out.println("Welcome to DESSERTS Section");
        System.out.print("Serial number"+"\t\t\t\t\t\t"+"Starters"+"\t\t\t\t\t\t\t\t\t\t"+"  prices\n");
        String[]arr= {"MANGO ICE CREEM              ","CHOCHO CHIPS ICE CREAM WAFFLE","GREEN PISTA ICE CREAM        ","VANILLA PASTRY               ","STRAWBERRY PASTRY              ","BLACK CURRENT PASTRY           ","GULAB JAMUN                 ","RED VELVET PASTRY            "};
        price2= new int[]{120, 130, 120, 100, 100, 100, 120, 130};
        int al=arr.length;
        int bl=0;
        for(int i=0;i<al ;i++){
            bl=bl+1;
            System.out.printf("%d\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t%5d\n",bl,arr[i],price2[i]);
        }
        calc(price2);
    }
    public void drinks(){
        System.out.println("Welcome to DRINKS Section");
        System.out.print("Serial number"+"\t\t\t\t\t\t"+"Starters"+"\t\t\t\t\t\t\t\t"+"prices\n");
        String[]arr= {"WATER BOTTLE        ","BANANA MILK SHAKE   ","DRY FRUIT JUICE       ","BADHAM MILK SHAKE   ","BELGIUM CHOCOLATE SHAKE"};
        price2= new int[]{50, 80, 100, 90, 100};
        int al=arr.length;
        int bl=0;
        for(int i=0;i<al ;i++){
            bl=bl+1;
            System.out.printf("%d\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t%5d\n",bl,arr[i],price2[i]);
        }
        calc(price2);
    }
    public void sides(){
        System.out.println("Welcome to SIDES Section");
        System.out.print("Serial number"+"\t\t\t\t\t\t"+"Starters"+"\t\t\t\t\t\t"+"  Prices\n");
        String[]arr= {"MOMOS        ","FRENCH FRIES","TWISTED POTATO","ONION RINGS  "};
        price2= new int[]{80, 80, 80, 80};
        int al=arr.length;
        int bl=0;
        for(int i=0;i<al ;i++){
            bl=bl+1;
            System.out.printf("%d\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t%5d\n",bl,arr[i],price2[i]);
        }
        calc(price2);
    }
    public void bill(int result){
        this.result=result;
        System.out.println("\n\nYour Bill Amount is: "+result);
        if (result>500 && result<999){
            System.out.println("\n\nYour Bill Amount is: "+(result-19));
        }
        else if (result>999 && result<1499){
            System.out.println("\n\nYour Bill Amount is: "+(result-69));
        }
        else if (result>1500 && result<2000){
            System.out.println("\n\nYour Bill Amount is: "+(result-99));
        }
        else if(result>2500){
            System.out.println("\n\nYour Bill Amount is: "+(result-150));
        }
        else {
            System.out.println("\n\nYour Bill Amount is: "+result);
        }
        System.out.print("You have Placed your order on: "+java.time.LocalDate.now()+"\t");
        System.out.println("at: "+java.time.LocalTime.now());
    }
    public  void add_item(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Now you can add an item");
        System.out.print("How many items do you want to add: ");
        numberOfItems=sc.nextInt();
        item_name=new String[numberOfItems];
        item_price= new int[numberOfItems];

        for (int i=0;i<numberOfItems;i++){
            System.out.print("What is name of the item: ");
            item_name[i]=sc.next();
            System.out.print("what is the price of the item: ");
            item_price[i]=sc.nextInt();
        }
        menu();
    }
    public  void items(int [] item_price, String[] item_name,int numberOfItems) {
        System.out.print("Serial number"+"\t\t\t\t\t\t"+"Starters"+"\t\t\t\t\t\t"+"prices\n");
        for (int i = 0; i< numberOfItems; i++) {
            System.out.printf("%d\t\t\t\t\t\t\t\t\t%s\t\t\t\t\t%5d\n", i + 1, item_name[i], item_price[i]);
        }
        calc(price2);
    }
    public void calc(int [] item_price){
        System.out.println("Place your order as per serial number");
        System.out.print("Enter the item: ");
        int item1=sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity=sc.nextInt();
        result=result+item_price[item1-1]*quantity;
        menu();
    }
}
public class Resturant {
    public static void main(String[] args) {
        pro m= new pro();
        m.menu();
    }
}