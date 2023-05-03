public class Expriment4Extra {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("QWERTYuiop");

        System.out.println(str.length());
        System.out.println(str.capacity());
        System.out.println(str.charAt(3));
        
        str.setCharAt(3, '%');
        System.out.println(str);

        System.out.println(str.append("--ASDF"));

        System.out.println(str.insert(1, "-S-"));

        System.out.println(str.delete(2, 3));
        System.out.println(str.deleteCharAt(5));
        System.out.println(str.replace(1, 2, "123"));
        System.out.println(str.substring(4,5));
        System.out.println(str.reverse());
        
    }
}
