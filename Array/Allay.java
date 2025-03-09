class Allay {
    public static void main(String[] args){
        int [] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        
        for (int j = 0; j < array.length; j++) {
            System.out.println("配列array[" +j+ "]" + array[j]);
        }
    }    
}
