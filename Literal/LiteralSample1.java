class LiteralSample1{
    public static void main(String[] args){
        /* 整数リテラル */
        int i = 100;
        long l = 100L;

        /* 実数リテラル */
        double d = 100.0;
        float f = 100.0F;

        /* 文字リテラル */
        char c = 'A';

        /* 真偽値リテラル */
        boolean b = true;

        /* 整数リテラル */
        int bin = 0b1111011;                //2進数(先頭に0bもしくは0B)
        int oct = 0123;                     //8進数(先頭に0)
        int hex = 0x123;                    //16進数(先頭に0xもしくは0X)
        int bin2 = 0b0111_0100_0101_1101;   //[_](アンダーバー)による桁区切り

        System.out.println(bin);
        System.out.println(oct);
        System.out.println(hex);
        System.out.println(bin2);

        /* 実数リテラル */
        double du = 1e13;
        System.out.println(du);

        /* 文字リテラル */
        char ch = '\u0041';
        System.out.println(ch);
    }
}