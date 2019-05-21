package task3;

    public class Task3_String {
        public static void main(String[] args) {

            String strLine = "asfa[ofsa[ofba[ofbaosfab[f";
            System.out.println("Initially line: " + strLine);

            strLine = strLine.replace("\u005b", "");
            System.out.println("After replace \"[\" :" + strLine);

            String someSymb = strLine.substring(2, 11);
            System.out.println("Get some symbols: " + someSymb);

            char[] symbArr = someSymb.toCharArray();
            System.out.print("Reverse some symbols: ");
            for (int i = symbArr.length - 1; i >= 0; i--) {
                System.out.print(symbArr[i]);
            }
        }
    }


