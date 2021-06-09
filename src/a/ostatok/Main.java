package a.ostatok;

public class Main {
    public static void main(String[] args) {
        String text = "CyCe`ubTufu|_`ub";
        int i=0;

        String hotovo = "";
        while(i < text.length()){
            StringBuilder oneBinarySign = new StringBuilder(Integer.toBinaryString(text.charAt(i)));
            int order = oneBinarySign.length() - 5;
            System.out.println("pred: " + oneBinarySign);
            if(oneBinarySign.charAt(order)=='0') {
                oneBinarySign.setCharAt(order, '1');
            }else if (oneBinarySign.charAt(order)=='1') {
                oneBinarySign.setCharAt(order, '0');
            }
            int parseInt = Integer.parseInt(String.valueOf(oneBinarySign), 2);
            char c = (char)parseInt;
            hotovo = hotovo+c;
                System.out.println("po: " + oneBinarySign + " " + c);

            i++;
        }
        System.out.println(hotovo);

    }
}
